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

//el archivo README.md es lo que se pinta en el git dentro del proyecto y esta en formato markdown

//tsconfig le indica a que estandar trabaja la aplicación ES5 o ES6

//tslint.json es para configurar y escribir un codigo mas limpio, si el codigo manda algun error de tslint es porque esta respetando alguna regla configurada


//index.html --> app.component.ts (<app-root>)
//los archivos .spec.ts es para hacer pruebas automaticas

//en la carpeta assets van todos los contenidos estaticos (que con el .gitkeep la sube a git a pesar que esta vacia)

//main.ts es el primer codigo que ejecuta angular para correr la aplicación, angular puede correr en moviles pero al poner platformBrowserDynamic() lo hace web

//polyfill.ts ayuda a compatibilidades de navegadores web anteriores


//Para incluir bootstrap ver index.html

//Para usar los tags en el html se deben de dar de importar en app.module.ts y ponerlo en declarations

//Como al final de cuentas son etiquetas html los componenentes se le pueden aplicar clases <app-body class="container"></app-body> ver app.component.html (se aplica el container de bootstrap)


//para crear un nuevo componente se pone la carpeta destino (incluso si aun no existe, por ejemplo ng g c components/footer), ademas de que lo crea lo agrega al app.module.ts
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
