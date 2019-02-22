import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculo',
  templateUrl: './calculo.component.html',
  styleUrls: ['./calculo.component.css']
})
export class CalculoComponent implements OnInit {

  monto: number = 0; iva = 16; montoIva = 0; montoTotal=0;

  constructor() { }

  ngOnInit() {
  }

  calculo1(){
    let i = this.iva / 100;
    this.montoIva = i * this.monto;
    this.montoTotal = this.montoIva + this.monto;

    console.log("monto: " + this.monto);
    console.log("iva : " + this.iva);
    console.log("monto iva : " + this.montoIva);
    console.log("total : " + this.montoTotal);
  }

}
