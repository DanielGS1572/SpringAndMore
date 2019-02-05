import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';           //Para cachar un elemento de la URL se usa activatedRoute
import { HeroesService,Heroe  } from '../../servicios/heroes.service';

@Component({
  selector: 'app-heroe',
  templateUrl: './heroe.component.html' 
})
export class HeroeComponent implements OnInit {
  heroe:any={};
  constructor(private activatedRoute : ActivatedRoute,
              private _heroesService : HeroesService
  ) { 
    this.activatedRoute.params.subscribe(params => {
      console.log(params['id']);    //para obtener el id que esta dentro de params, esto esta dentro de [app.routing.ts --> heroe/:id]
      this.heroe = this._heroesService.getHeroe(params['id']); 
      console.log(this.heroe);
     })
  }

  ngOnInit() {
  }

}
