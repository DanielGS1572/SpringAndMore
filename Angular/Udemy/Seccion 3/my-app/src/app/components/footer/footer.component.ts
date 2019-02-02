import { Component } from '@angular/core';

@Component({
  selector: 'app-footer',
  templateUrl: './footer.component.html',
  styleUrls: ['./footer.component.css']
})
export class FooterComponent  {
  anio : number;
//  anio = new Date().getFullYear();        la variable se puede definir aqui pero lo correcto es que se haga en el constructor
  constructor(){
    this.anio = new Date().getFullYear();
  }
  
}
