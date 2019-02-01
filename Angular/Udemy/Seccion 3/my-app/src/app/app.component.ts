//Los componentes son clases normales con un decorador especifico
//Las directivas estructurales son instrucciones en HTML *ngIf (si es falso ni lo mostrará en el HTML) - *ngFor
//Para correr en un puerto específico ng serve -p [numero puerto]
//ngServer -o abre el navegador una vez arrancado

//La carpeta e2e significa end to end para el manejo de las pruebas
//la carpeta node_modules son los paquetes que instala despues de hacer un new [project] que sirven para la parte de desarrollo como por ejemplo montar el server
                  //incluso se puede borrar y se recupera con npm install y se genera con base al package.json

//editorconfig es para realizar algunas configuraciones del editor
//angular.json indica como es que funciona la aplicación, lo más que se usará son assets, styles y scripts

//en package.json se tienen todos los paquetes que se estan usando, aqui se indica el tslint que es el que avisa si hay errores en la aplicacion

//el archivo README.md es lo que se pinta en el git dentro del proyecto


import { Component } from '@angular/core';

@Component({                        //El @Component es el decorador que indica que será inyectado en el HTML
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  nombre = 'Daniel';
  apellido = 'Gonzali';
}
