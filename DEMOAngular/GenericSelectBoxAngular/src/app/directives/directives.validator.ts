import {EmailValidator, FormControl, FormGroup, ValidatorFn, Validators} from '@angular/forms';
import 'reflect-metadata';

class BinderBean {
  bean: string;
  size?: Size[] = [];
  pattern?: Pattern[] = [];
  notEmpty?: NotEmpty[] = [];
  notNull?: NotNull[] = [];
}

export interface Validator {
  message: string;
  fields: string[];
}

export class Size implements Validator {
  min?: number;
  max?: number;
  message: string;
  fields: string[];
}

export class Pattern implements Validator {
  fields: string[];
  message: string;
  regexp?: string;
}

export class NotEmpty implements Validator {
  fields: string[];
  message: string;
}

export class NotNull implements Validator {
  fields: string[];
  message: string;
}

export class EmailValidation implements Validator{
  fields: string[];
  message: string;
}

export function Binder(binder: BinderBean) {
  return function (target) {

    const validators = new Map<String, ValidatorFn[]>();

    const form: FormGroup = new FormGroup({});

    if(binder.size !== undefined) {
      for (const s of binder.size) {
        for (const f of s.fields) {
          const valids: ValidatorFn[] = [];
          if (s.min !== undefined) {
            valids.push(LSValidators.min(s.min, s.message));
          }
          if (s.max !== undefined) {
            valids.push(LSValidators.max(s.max, s.message));
          }
          validators.set(f, valids);
        }
      }
    }

    if(binder.pattern !== undefined) {
      for (const p of binder.pattern) {
        for (const f of p.fields) {
          if (validators.has(f)) {
            validators.get(f).push(LSValidators.pattern(p.regexp, p.message));
          } else {
            validators.set(f, [LSValidators.pattern(p.regexp, p.message)]);
          }
        }
      }
    }

    if(binder.notEmpty !== undefined) {
      for (const ne of binder.notEmpty) {
        for (const f of ne.fields) {
          if (validators.has(f)) {
            validators.get(f).push(LSValidators.required(ne.message));
          } else {
            validators.set(f, [LSValidators.required(ne.message)]);
          }
        }
      }
    }

    if (binder.notNull !== undefined) {
      for (const ne of binder.notNull) {
        for (const f of ne.fields) {
          if (validators.has(f)) {
            validators.get(f).push(Validators.nullValidator);
          } else {
            validators.set(f, [Validators.nullValidator]);
          }
        }
      }
    }

    validators.forEach((value: ValidatorFn[], key: string) => {
      form.addControl(key, new FormControl('', value));
    });

    Object.defineProperty(target.prototype, binder.bean, {value: form});
  };
}

export class LSValidators {

  static nullValidator(message: string) {
    return (c: FormControl) => {
      if (c.errors) {
        return null;
      }
      if (c.value === null) {
        return {
          nullValidator: {
            message: message
          }
        };
      }
      return null;
    };
  }

  static required(message: string) {
    return (c: FormControl) => {
      if ('' === c.value || c.value === undefined) {
        return {
          required: {
            message: message
          }
        };
      }
      return null;
    };
  }

  static ranged(min: number, max: number, message: string) {
    return (c: FormControl) => {
      if (c.value.length < min || c.value.length > max) {
        return {
          ranged: {
            message: message
          }
        };
      }
      return null;
    };
  }

  static min(min: number, message: string) {
    return (c: FormControl) => {
      if (c.value.length < min) {
        return {
          min: {
            message: message
          }
        };
      }
      return null;
    };
  }

  static max(max: number, message: string) {
    return (c: FormControl) => {
      if (c.value.length > max) {
        return {
          max: {
            message: message
          }
        };
      }
      return null;
    };
  }

  static pattern(pattern: string, message: string) {
    return (c: FormControl) => {
      if (!c.value.match(pattern)) {
        return {
          pattern: {
            message: message
          }
        };
      }
      return null;
    };
  }
}
