import {Component, forwardRef} from '@angular/core';
import {ControlValueAccessor, NG_VALUE_ACCESSOR} from "@angular/forms";

@Component({
  selector: 'ls-checkbox',
  templateUrl: './ls-checkbox.component.html',
  styleUrls: [],
  providers: [
    {
      provide: NG_VALUE_ACCESSOR,
      useExisting: forwardRef(() => LsCheckboxComponent),
      multi: true,
    }
  ],
})
export class LsCheckboxComponent implements ControlValueAccessor {

  public options: string[];

  constructor() { }

  generateChecksEnum(e: any){
    this.options = Object.keys(e);
  }

  generateChecksArray(arr: string []){
    this.options = arr;
  }

  registerOnChange(fn: any): void {
  }

  registerOnTouched(fn: any): void {
  }

  setDisabledState(isDisabled: boolean): void {
  }

  writeValue(obj: any): void {
  }
}
