import {Component, forwardRef, OnInit} from '@angular/core';
import {ControlValueAccessor, NG_VALUE_ACCESSOR} from "@angular/forms";

@Component({
  selector: 'app-check-box-component',
  templateUrl: './check-box-component.component.html',
  styleUrls: ['./check-box-component.component.css'],
  providers: [
    {
      provide: NG_VALUE_ACCESSOR,
      useExisting: forwardRef(() => CheckBoxComponentComponent),
      multi: true,
    }
  ],
})
export class CheckBoxComponentComponent implements ControlValueAccessor {

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
