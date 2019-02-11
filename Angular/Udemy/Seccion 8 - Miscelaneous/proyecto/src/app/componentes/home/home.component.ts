import { Component, OnInit } from '@angular/core';
//Aqui se veran las rutas hijas
@Component({
  selector: 'app-home',
  template:`
  <app-ng-style></app-ng-style>
  <app-css></app-css>
  <app-clases></app-clases>
  <hr>
  <h3>Ejemplo directiva</h3>
  <p [appResaltado]="'orange'">Texto</p>
  <hr>
  <h3>ngSwitch</h3>
  <app-ng-switch></app-ng-switch>
  `,
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
