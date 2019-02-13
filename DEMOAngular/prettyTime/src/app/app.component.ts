import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'prettyTime';
  fechaActual : Date = new Date();

  now : Date = this.fechaActual;
  minusTen : Date = new Date();
  minusMonth : Date = new Date();

  
  constructor(){
    this.minusTen.setDate(this.minusTen.getDate() - 10);
    this.minusMonth.setDate(this.minusMonth.getDate() - 60);

  }
   
}
