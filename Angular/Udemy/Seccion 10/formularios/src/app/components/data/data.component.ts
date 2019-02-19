import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';    //Requiere de ReactiveFormsModule en el app.module
@Component({
  selector: 'app-data',
  templateUrl: './data.component.html',
  styles: []
})
export class DataComponent {

  forma:FormGroup;

  constructor() { 

      this.forma = new FormGroup({
        'nombre': new FormControl(''/*Nombre */, [
                                                  Validators.required,
                                                  Validators.minLength(3)
           ]   /**Regla de validacion ,Regla de validacion async */),
        'apellido':new FormControl('', Validators.required),
        'correo':new FormControl('', [
                                      Validators.required, 
                                      Validators.pattern("[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$")])
      });

  }

  guardarCambios(){
    console.log( this.forma.value );
    console.log( this.forma );
  }
}
