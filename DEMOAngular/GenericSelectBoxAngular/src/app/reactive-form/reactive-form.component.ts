import {Component, OnInit, ViewChild} from '@angular/core';
import {FormGroup, FormControl, FormBuilder, Validators} from "@angular/forms";
import {Person} from "../classes/person";
import {AbstractValidator} from "../directives/directives.abstractvalidator";
import {TranslateService} from "@ngx-translate/core";
import {Binder} from "../directives/directives.validator";
import {PersonserviceService} from "../service/personservice.service";
import {ComboBoxComponentComponent} from "../combo-box-component/combo-box-component.component";
import {RadioButtonComponentComponent} from "../radio-button-component/radio-button-component.component";
import {SexoEnum} from "../enums/Sexo.enum";
import {CheckBoxComponentComponent} from "../check-box-component/check-box-component.component";
import {RegimenFiscalEnum} from "../enums/RegimenFiscal.enum";


@Component({
  selector: 'app-reactive-form',
  templateUrl: './reactive-form.component.html',
  styleUrls: ['./reactive-form.component.css', '../app.component.css']
})

@Binder({
  bean: 'formGroup',
  size: [
    {
      min: 13,
      max: 13,
      fields: ['rfc'],
      message: 'ValidatorMessages.rfcError',
    }
  ],
  pattern: [
    {
      regexp: '[a-z0-9._%+-]+@[a-z0-9.-]+.[a-z]{2,3}$',
      fields: ['email'],
      message: 'ValidatorMessages.emailError',
    }
  ],
  notEmpty: [
    {
      fields: ['name', 'lastName', 'telephone', 'email', 'rfc', 'password', 'confirmPassword', 'person', 'sexo','regimenFiscal'],
      message: 'ValidatorMessages.notEmpty',
    }
  ]
})
export class ReactiveFormComponent extends AbstractValidator implements OnInit {

  @ViewChild(ComboBoxComponentComponent)cmbComponet: ComboBoxComponentComponent;
  @ViewChild(RadioButtonComponentComponent) radioBtnComponent: RadioButtonComponentComponent;
  @ViewChild(CheckBoxComponentComponent) chkComponent: CheckBoxComponentComponent;


  submitted = false;
  //person: Person = new Person();

  constructor(protected translate: TranslateService, private personService: PersonserviceService) {
    super(translate);
  }

  ngOnInit() {
    this.cmbComponet.caption = 'name';
    this.personService.getPersons().forEach(o => {
      this.cmbComponet.items.push(o);
    });

    this.radioBtnComponent.generateRadioEnum(SexoEnum);
    this.chkComponent.generateChecksEnum(RegimenFiscalEnum);
  }


  get form() {
    return this.formGroup.controls;
  }

  onSubmit() {
    console.warn(this.formGroup.value);
    //console.warn(this.person);
    super.validateBean();
  }

  updateProfile() {
    super.validateBean();
    this.submitted = true;
    if (this.formGroup.invalid)
      return;
  }

}
