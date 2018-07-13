import { Component } from '@angular/core';
/*Para mayor conveniencia en plunkr se hizo casi la mayor parte de la configuracion en un solo archivo,
en este caso descompone el proyecto en varios archivos */

/*Este proyecto esta siendo "bootstraped"" con un solo component, que es el root component (que se llama AppComponent)*/
@Component({
  selector: 'app-root',               /*Si se ve index.html se verá una etiqueta que se llama app-root */
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app works!';
}
