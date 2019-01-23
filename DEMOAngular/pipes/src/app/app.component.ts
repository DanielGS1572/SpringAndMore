import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: `
  <!-- El pipe operator solo transforma la información en el view y no afecta a la clase -->
  <!-- Formateo de texto -->

  <h1>{{ stringTest }}</h1>
  <h1>{{ stringTest | lowercase}}</h1>
  <h1>{{ stringTest | uppercase}}</h1>
  <h1>{{ stringTest | uppercase}}</h1>
  <h1>{{ stringTest | slice:3:5}}</h1>
  
  <h1>{{ person | json}}</h1>

  <!-- Formateo de numeros -->
  <h1>{{5.678 | number: '1.2-3'}}</h1>    <!--(numero minimo de enteros).(numero minimo de decimales)-(numero maximo de decimales [redondea])-->
  <h1>{{5.678 | number: '3.4-5'}}</h1>
  <h1>{{5.678 | number: '3.1-2'}}</h1>

  <!-- Porcentaje -->
  <h1>{{0.25 | percent }}</h1>

  <!-- Currency -->
  <h2>{{ 0.25 | currency }}</h2>                            <!-- por default son dolares -->
  <h2>{{ 0.25 | currency: 'GBP'}}</h2>                      <!-- https://www.currency-iso.org/dam/downloads/lists/list_one.xml -->
  <h2>{{ 0.25 | currency: 'GBP':'code'}}</h2>               <!-- Para imprimir el codigo en sí y no el simbolo -->

  <!-- Date -->
  <h2>{{date}}</h2>
  <h2>{{date | date:'short'}}</h2>                          <!-- Existe short, medium, long-->
  <h2>{{date | date:'shortDate'}}</h2>
  <h2>{{date | date:'shortTime'}}</h2>

  `,
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  stringTest = 'string TEST';
  public person = {
    "firstName": "John",
    "lastName": "Doe"
  }
  public date = new Date();
}
