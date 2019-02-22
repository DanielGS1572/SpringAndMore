import {Component, forwardRef, Input} from '@angular/core';
import {ControlValueAccessor, NG_VALUE_ACCESSOR} from '@angular/forms';

@Component({
  selector: 'app-combo-box-component',
  templateUrl: './combo-box-component.component.html',
  styleUrls: ['./combo-box-component.component.css'],
  providers: [
    {
      provide: NG_VALUE_ACCESSOR,
      useExisting: forwardRef(() => ComboBoxComponentComponent),
      multi: true,
    }
  ],
})
export class ComboBoxComponentComponent implements ControlValueAccessor {

  @Input()
  public items: any[] = new Array<any>();

  @Input()
  public formControlName: string;
  @Input('value')
  value: string = '';
  @Input()
  caption: string;
  selectedItem: string;

  onChange = (_: any) => {};
  onTouched = () => {};

  constructor() {
  }

  registerOnChange(fn: any): void {
    this.onChange = fn;
  }

  registerOnTouched(fn: any): void {
    this.onTouched = fn;
  }

  writeValue(obj: any): void {
    this.value = obj || '';
  }

  setDisabledState(isDisabled: boolean): void {
  }


}
