import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';     //para pasarle parametros a los hijos   
 
@Component({
  selector: 'app-usuario-nuevo',
  template: `
    <p>
      usuario-nuevo works!
    </p>
  `,
  styles: []
})
export class UsuarioNuevoComponent implements OnInit {

 constructor(private router:ActivatedRoute) {
    this.router.parent.params.subscribe(parametros =>{      /*para obtener todos los parametros del padre simplemente se suscribe al .parent */
      console.log("ruta hija");      
      console.log(parametros);
    })
   }

  ngOnInit() {
  }

}
