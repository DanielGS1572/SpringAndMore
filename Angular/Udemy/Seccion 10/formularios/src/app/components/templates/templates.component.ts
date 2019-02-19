import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-templates',
  templateUrl: './templates.component.html',
  styles: [`
    .ng-invalid.ng-touched:not(form){
        border:1px solid red;
    }
  `]
})
export class TemplatesComponent implements OnInit {
  usuario: Object = {
    nombre: null,
    apellido: null,
    correo: null,
    pais: "CRI",
    sexo: "Hombre",
    acepta: false
  }

  paises = [{
    codigo: "CRI",
    nombre: "Costa Rica"
  }, {
    codigo: "ESP",
    nombre: "España"
  }
  ]

  sexos = ["Hombre","Mujer","Sin definir"]


  constructor() { }

  ngOnInit() {
  }
  guardar(forma: NgForm) {
    console.log("formulario posteado");
    console.log("ngForm", forma);
    console.log("valor ", forma.value)      //trae todos los datos de la forma
    console.log("usuario", this.usuario);

  }

}
