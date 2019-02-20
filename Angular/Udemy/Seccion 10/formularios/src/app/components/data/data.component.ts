import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, FormArray } from '@angular/forms';    //Requiere de ReactiveFormsModule en el app.module
@Component({
  selector: 'app-data',
  templateUrl: './data.component.html',
  styles: []
})
export class DataComponent {

  forma:FormGroup;
  usuario:any={
    nombreCompleto:{
      nombre:"fernando",
      apellido:"herrera"
    },correo:"correo@gmail.com",
     // pasatiempos:["Dormir","Comer","correr"]
  }
  constructor() { 
    /** 4 Formas de setear la forma AAA) BBB) CCC) DDD) */
      console.log(this.usuario);
      /**El objeto usuario que llene en la forma tiene la misma estructura */
      this.forma = new FormGroup({

        'nombreCompleto': new FormGroup({             /**Un formGroup dentro de otro FormGroup */
           'nombre': new FormControl(''/*Nombre...this.usuario.nombreCompleto.nombre AAA) */, [
                                                  Validators.required,
                                                  Validators.minLength(3)
           ]   /**Regla de validacion ,Regla de validacion async */),
        'apellido':new FormControl('', Validators.required)
        }),
        'correo':new FormControl('', [
                                      Validators.required, 
                                      Validators.pattern("[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$")]),
        'pasatiempos': new FormArray([
            new FormControl('', [Validators.required])      /**Si hubieran varios validadores va entre [] */
        ])

      });
     //this.forma.setValue( this.usuario );    //como el objeto tiene la misma estructura que el form setea los campos en automatico  BBB)

  }
  agregarPasatiempo(){
    (<FormArray>this.forma.controls['pasatiempos']).push(new FormControl('',Validators.required));
  }
  guardarCambios(){
    console.log( this.forma.value );
    console.log( this.forma );

    //PARA REGRESAR LA FORMA EN ESTADO PRISTINE SE USA RESET
    //this.forma.reset( this.usuario );
   this.forma.reset( {                  
      nombreCompleto:{
        nombre:"",
        apellido: "" 
      
    },
        correo:""
    });                 /** DDD) --> ESTE SETEO LO DEJA EN ESTADO PRISTINE*/
   /**this.forma.controls['correo'].setValue('nuevocorreo@gmail.com');            CCC)*/
  }
}
