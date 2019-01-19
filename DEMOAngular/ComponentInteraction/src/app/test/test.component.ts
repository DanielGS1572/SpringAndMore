import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `
  <h2>{{"Hello " + name}}</h2>
  <button (click)="fireEvent()">Enviar</button>
  `,
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {
  /*@Input()
  public parentData;          //la variable se llama igual que en el html del padre 
*/
  @Input('parentData')        //se hace uso de un alias para no tener que nombrar igual la variable
  public name;    

  @Output()
  public childEvent = new EventEmitter();
  constructor() { }

  ngOnInit() {
  }

  public fireEvent(){
    this.childEvent.emit('Mensaje del hijo');
  }

}
