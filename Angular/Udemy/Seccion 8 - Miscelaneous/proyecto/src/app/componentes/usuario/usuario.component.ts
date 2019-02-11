import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';     //para pasarle parametros a los hijos   

@Component({
  selector: 'app-usuario',
  templateUrl: './usuario.component.html'
})
export class UsuarioComponent implements OnInit {

  constructor(private router:ActivatedRoute) {
    this.router.params.subscribe(parametros =>{
      console.log("ruta padre");      
      console.log(parametros);
    })
   }

  ngOnInit() {
  }

}
