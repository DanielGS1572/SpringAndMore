import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
/**
 * @title Stepper vertical
 */
@Component({
  selector: 'app-root',
  templateUrl: 'app.component.html',
  styles: [``]
})
export class AppComponent implements OnInit {
  isLinear = false;
  varMax : number = 50;
  firstFormGroup: FormGroup;
  secondFormGroup: FormGroup;
  numericValue : number = 30;

  constructor(private _formBuilder: FormBuilder) {}
  value:number=30;
  ngOnInit() {
    this.firstFormGroup = this._formBuilder.group({
      firstCtrl: ['', Validators.required]
    });
    this.secondFormGroup = this._formBuilder.group({
      secondCtrl: ['', Validators.required]
    });
  }
}
