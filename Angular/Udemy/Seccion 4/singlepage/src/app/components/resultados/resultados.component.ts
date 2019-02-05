import { Component, OnInit } from '@angular/core';
import { HeroesService, Heroe } from '../../servicios/heroes.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-resultados',
  templateUrl: './resultados.component.html'
})
export class ResultadosComponent implements OnInit {
  private heroes: Heroe[];
  constructor(private _heroesService: HeroesService,
    private activatedRoute: ActivatedRoute
  ) {}

  ngOnInit() {
    this.activatedRoute.params.subscribe(param => {                       //activatedRoute es lo que recibe del html (dato que se le pasa desde navbar.component.ts)
      console.log(param['termino']);
      this.heroes = this._heroesService.buscarHeroes(param['termino']);
    })
  }

}
