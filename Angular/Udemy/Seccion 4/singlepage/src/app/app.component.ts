import { Component } from '@angular/core';
//al jalar la funcionalidad de bootstrap los scripts deben de ir antes del cierre del body (en index.html)
//El sistema de rutas se pone en app module (al igual que servicios y componentens,
// se pone una consante para hacer las llamadas
          //las rutas se configuran en app-routing.module.ts
//porque al declarar la constante de routes inmediatamente entra directo a localhost:4200/home (?)

//routerLink recibe un arreglo en el que cada elemento del arreglo es una separación por / de la ruta
//routerLinkActive debe ir arriba de un routerLink para que se escuche cuando se da click a un boton routerLink
          //lo que hace es que le va a aplicar una clase en particular
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'singlepage';
}
