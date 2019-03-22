import {Component, forwardRef, Input} from '@angular/core';
import {ControlValueAccessor, NG_VALUE_ACCESSOR} from '@angular/forms';



@Component({
    selector: 'ls-combobox',
    templateUrl: './ls-combobox.component.html',
    providers: [
        {
            provide: NG_VALUE_ACCESSOR,
            useExisting: forwardRef(() => LsComboBoxComponent),
            multi: true,
        }
    ],
})
export class LsComboBoxComponent implements ControlValueAccessor {

    @Input()
    public items: any[] = [];

    @Input()
    public formControlName: string;
    @Input('value')
    value: string = '';
    @Input()
    caption: string = 'name';

    selectedItem: any;

    onChange = (_: any) => {};
    onTouched = () => {};

    constructor() {
        console.log("componente");
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
