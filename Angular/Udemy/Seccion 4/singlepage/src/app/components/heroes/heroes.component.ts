import { Component, OnInit } from '@angular/core';
import { HeroesService, Heroe } from '../../servicios/heroes.service';
import { Router } from '@angular/router';       //Router es como si estuviera llamando un servicio
// por lo que se tiene que configurar en el constructor

@Component({
  selector: 'app-heroes',
  templateUrl: './heroes.component.html'
})
export class HeroesComponent implements OnInit {
  heroes: Heroe[] = [];
  constructor(private _heroesService: HeroesService,
              private _router: Router
              ) {
    /**Para importar el servicio debe ir en el constructor, hacer esto se dispara el constructor del servicio */
  }

  ngOnInit() {
    //El ngOnInit se ejecuta cuando ya toda la pagina esta renderizada (Pero primero se ejecuta el constructor)
    this.heroes = this._heroesService.getHeroes();
    console.log(this.heroes)
  }

  verHeroe(idx: number) {
      this._router.navigate( ['/heroe',idx] );      //Para poder navegar entre los componentes se usar el Router

  }

}
