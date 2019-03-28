import { Component, ViewChild, OnInit } from '@angular/core';
import { FormGroup } from '@angular/forms';
import { LsCheckboxComponent } from '../ls-checkbox/ls-checkbox.component';
import { CurrencyPipe } from "@angular/common";
@Component({
  selector: 'app-parametros',
  templateUrl: './parametros.component.html',
  styleUrls: ['./parametros.component.css']
})
export class ParametrosComponent implements OnInit {

  @ViewChild(LsCheckboxComponent) chkComponent: LsCheckboxComponent = new LsCheckboxComponent();
  llevaMonto: boolean;
  constructor(private currencyPipe: CurrencyPipe){

  }
  ngOnInit(): void {
    this.chkComponent.generateChecksArray(['Configurable por usuario final',
      'Visible por usuario final',
      'Monto configurable',
      'Mostrar/Ocultar saldo disponible',
      'Notificación interna',
      'Lleva monto']);
  }
  transformAmount(element: any) {
    element.target.value = this.currencyPipe.transform(element.target.value, 'USD');
  }
  submit() { }
  updateStatus(selected) {
    console.log(selected);
  }
}
