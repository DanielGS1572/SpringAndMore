import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ngstyle',
  template: `
  <p style="font-size:30px">
    Hola Mundo... esta es una etiqueta
  </p>
  <p  [ngStyle]="{'font-size':'30px','color':'red'}">
    Hola Mundo... esta es una etiqueta
  </p>
  <p [style.fontSize]="'30px'">     <!--Ver como lleva las comillas simples-->
    Hola Mundo... esta es una etiqueta
  </p>
  <p [style.fontSize.px]="tamano">
    Hola Mundo... esta es una etiqueta
  </p>

  <p [style.fontSize.px]="tamano2">
    Hola Mundo... esta es una etiqueta
  </p>
  <button class="btn btn-primary" (click)="tamano2 = tamano2 + 5">
      <i class="fa fa-plus"></i>
  </button>
  <button class="btn btn-primary" (click)="tamano2 = tamano2 -5">
      <i class="fa fa-minus"></i>
  </button>

  <p  [ngStyle]="obj">
  Hola Mundo... esta es una etiqueta
</p>
  `,
  styles: []
})
export class NgstyleComponent implements OnInit {
 tamano = 30;
 tamano2 = 30;
 obj = {'font-size':'30px','color':'red'};
  constructor() { }

  ngOnInit() {
  }

}
