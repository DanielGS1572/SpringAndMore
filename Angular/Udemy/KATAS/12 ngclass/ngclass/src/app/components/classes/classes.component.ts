import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-classes',
  templateUrl: './classes.component.html',
  styles: []
})
export class ClassesComponent implements OnInit {
  alerta:string = "alert-danger";
  propiedades:Object = {
    condicion:false
  }
  constructor() { }

  ngOnInit() {
  }

}
