import { Component, OnInit } from '@angular/core';
import { trigger,style,transition,animate,keyframes,query,stagger } from '@angular/animations';

import { DataService } from '../data.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss'],
  animations: [

    trigger('goals', [                                                        /* goals es el nombre del trigger */
      transition('* => *', [                                                  /* el asterisco significa any por lo que la instrucción representa "any (state) to any (state)" */

        query(':enter', style({ opacity: 0 }), { optional: true }),           /* cuando algo "entre" al DOM se le aplicará un estilo, algunas animaciones fallarán si no se pone el optional: true*/

        query(':enter', stagger('300ms', [                                    /* stagger toma una lista de elementos en el dom  */
          animate('.6s ease-in', keyframes([
            style({ opacity: 0, transform: 'translateY(-75%)', offset: 0 }),
            style({ opacity: .5, transform: 'translateY(35px)', offset: 0.3 }),
            style({ opacity: 1, transform: 'translateY(0)', offset: 1.0 }),
          ]))]), { optional: true })
        ,
        query(':leave', stagger('300ms', [
          animate('.6s ease-out', keyframes([
            style({ opacity: 1, transform: 'translateY(0)', offset: 0 }),
            style({ opacity: .5, transform: 'translateY(35px)', offset: 0.3 }),
            style({ opacity: 0, transform: 'translateY(-75%)', offset: 1.0 }),
          ]))]), { optional: true })
      ])
    ])

  ]
})
export class HomeComponent implements OnInit {

  itemCount: number = 2;
  btnText: string = 'Add an Item';
  goalText: string = 'My first life goal';
  goals = [];
  badGoal: boolean = false;

  constructor(private _data: DataService, private _router: Router) { }

  ngOnInit() {
   
    this._data.goal.subscribe(res => this.goals = res);               /*Se obtiene los datos a traves de un servicio de data service */
    this.itemCount = this.goals.length;
    this._data.changeGoal(this.goals);
  }

  addItem() {
    if (this.goalText == 'My first life goal' || this.goalText == '') {
      this.badGoal = true;
      return;
    } else {
      this.badGoal = false;
    }
    this.goals.push(this.goalText);                   //agrega elemento al arreglo
    this._data.setGoal(this.goalText);
    this.goalText = '';
    this.itemCount = this.goals.length;
    this._data.changeGoal(this.goals);
   // this._router.navigate(['thanks']);
  }

  removeItem(i) {
    this.goals.splice(i, 1);
    this.itemCount = this.goals.length;
    this._data.changeGoal(this.goals);
  }

}