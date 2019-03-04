import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
@Component({
  selector: 'app-usuario-detalle',
  template: `
    <p>
      usuario-detalle works!
    </p>
  `,
  styles: []
})
export class UsuarioDetalleComponent implements OnInit {

  constructor(private route:ActivatedRoute) {
    this.route.params.subscribe(par =>{
      console.log(par);
    })
   }

  ngOnInit() {
  }

}
