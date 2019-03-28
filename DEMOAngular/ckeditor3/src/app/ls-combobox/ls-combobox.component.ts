import {Component, forwardRef, Input, ViewChild, EventEmitter, Output, ElementRef, OnInit} from '@angular/core';
import {ControlValueAccessor, NG_VALUE_ACCESSOR} from '@angular/forms';
import { Observable, from, fromEvent } from 'rxjs';
import { InfoService } from '../service/infoservice.service';



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
    info: string;
    selectedItem: any;
    @ViewChild('combo') combo;
   // @Output()
   @Output()
    public event = new EventEmitter();

    onChange = (_: any) => {};
    onTouched = () => {};
    
    constructor(private elementref : ElementRef) {

}

 changed(){
        console.log('select',this.selectedItem);
        this.event.emit(this.selectedItem);
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
