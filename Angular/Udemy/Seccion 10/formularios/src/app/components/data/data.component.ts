import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, FormArray } from '@angular/forms';    //Requiere de ReactiveFormsModule en el app.module
import { Observable } from 'rxjs';
import { resolve } from 'q';
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
        'apellido':new FormControl('', [Validators.required,this.noHerrera])          //this.noHerrera no lleva parentesis noHerrera()
                                              //si no lleva parentesis es pasado como callback y no regresa el dato como tal
        }),
        'correo':new FormControl('', [
                                      Validators.required, 
                                      Validators.pattern("[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$")]),
        'pasatiempos': new FormArray([
            new FormControl('', [Validators.required])      /**Si hubieran varios validadores va entre [] */
        ]),
        'username': new FormControl('',Validators.required,this.existeUsuario),
        'password1': new FormControl('',Validators.required),
        'password2': new FormControl()


      });
     //this.forma.setValue( this.usuario );    //como el objeto tiene la misma estructura que el form setea los campos en automatico  BBB)
      this.forma.controls['password2'].setValidators([
        Validators.required,
        this.noIgual.bind( this.forma )       //El bind hace que el this apunte a this.forma, se tiene que hacer esto porque el validador
                //de no igual no esta en el mismo contexto
      ]);

      this.forma.valueChanges.subscribe( data =>{
        console.log(data);
      })            //escucha todos los cambios en los campos del formulario

      this.forma.controls['username'].valueChanges.subscribe( data =>{
        console.log(data);
      })            //para escuchar cambios en un campo en particular

      this.forma.controls['username'].statusChanges.subscribe( data =>{
        console.log(data);
      })            //para suscribirse a un estatus
  }
  agregarPasatiempo(){
    (<FormArray>this.forma.controls['pasatiempos']).push(new FormControl('',Validators.required));
  }

  /**Validaciones personalizadas */
  noHerrera( control:FormControl ): {[s:string]:boolean} {          //Esto sería como llave:valor
      if( control.value === "herrera"){
        return {
          noherreras:true                 //el no herreras es para mostrar el tipo de error, no importa si es true o false, es simplemente para mostrar en consola
        }
      }
      return null
  }

  noIgual( control:FormControl ): {[s:string]:boolean} {    
    let forma:any = this;      
    if( control.value !== forma.controls['password1'].value){
      return {
        noiguales:true                
      }
    }
    return null
  }

  existeUsuario( control: FormControl ) : Promise<any>|Observable<any>{
    let promesa = new Promise(
      (resolve, reject) =>
      {
        setTimeout(()=>{
          if(control.value ==="strider"){
            resolve({ existe: true})
          }else{
            resolve(null)
          }
        },3000) 
      }
    )
    return promesa;
  }

  guardarCambios(){
    console.log( this.forma.value );
    console.log( this.forma );

    //PARA REGRESAR LA FORMA EN ESTADO PRISTINE SE USA RESET
    //this.forma.reset( this.usuario );
   /** this.forma.reset( {                  
      nombreCompleto:{
        nombre:"",
        apellido: "" 
      
    },
        correo:""
    });*/   
                  /** DDD) --> ESTE SETEO LO DEJA EN ESTADO PRISTINE*/
   /**this.forma.controls['correo'].setValue('nuevocorreo@gmail.com');            CCC)*/
  }
}
