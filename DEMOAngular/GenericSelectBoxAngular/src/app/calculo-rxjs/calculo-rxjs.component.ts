import { Component, OnInit } from '@angular/core';
import {fromEvent} from "rxjs";

@Component({
  selector: 'app-calculo-rxjs',
  templateUrl: './calculo-rxjs.component.html',
  styleUrls: ['./calculo-rxjs.component.css']
})
export class CalculoRxjsComponent implements OnInit {

  constructor() { }

  ngOnInit() {
    this.events();
  }

  events(){
    const event = fromEvent(document, 'keydown.enter');
    event.subscribe(evt => console.log(evt));
  }

}
