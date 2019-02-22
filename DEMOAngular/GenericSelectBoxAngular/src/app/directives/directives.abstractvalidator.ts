import {FormGroup, ValidationErrors} from '@angular/forms';
import {TranslateService} from '@ngx-translate/core';

export  class AbstractValidator {

  public formGroup: FormGroup;

  constructor(protected translate: TranslateService) {
    this.validateChanges();
  }

  validateBean(): Boolean {
    this.cleanMessages();
    Object.keys(this.formGroup.controls).forEach(key => {
      const controlErrors: ValidationErrors = this.formGroup.get(key).errors;
      if (controlErrors != null) {
        Object.keys(controlErrors).forEach(keyError => {
          const elements = Array.from(document.getElementsByName(key));
          elements.forEach(item => {
            const divMessage = document.createElement('div'); // is a node
            divMessage.innerHTML = this.translate.instant(controlErrors[keyError].message);
            divMessage.className = 'required-message';
            item.parentNode.appendChild(divMessage);
          });
        });
        return false;
      }
    });
    return true;
  }

  cleanMessages() {
    const elements = Array.from(document.getElementsByClassName('required-message'));
    elements.forEach(item => {
      item.remove();
    });
  }

  validateChanges() {
    this.formGroup.valueChanges.subscribe(val => {
      this.validateBean();
    });
  }

}
