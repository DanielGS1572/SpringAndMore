import {Component, forwardRef, OnInit} from '@angular/core';
import {ControlValueAccessor, NG_VALUE_ACCESSOR} from "@angular/forms";

@Component({
  selector: 'app-radio-button-component',
  templateUrl: './radio-button-component.component.html',
  styleUrls: ['./radio-button-component.component.css'],
  providers: [
    {
      provide: NG_VALUE_ACCESSOR,
      useExisting: forwardRef(() => RadioButtonComponentComponent),
      multi: true,
    }
  ],
})
export class RadioButtonComponentComponent implements ControlValueAccessor {

  public options: string[];
  public valueOpt: string;

  constructor() { }

  generateRadioEnum(e: any){
    this.options = Object.keys(e);
  }

  generateRadioArray(arr: string []){
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
