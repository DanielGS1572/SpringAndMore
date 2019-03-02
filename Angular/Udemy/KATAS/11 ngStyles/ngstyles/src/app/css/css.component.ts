import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-css',
  template: `
    <p>
      css works!
    </p>
  `,
  styles: [`p{
    color:red;
  }`]         //a pesar que se ponga un estilo en el archivo general de styles en este componente no se verá afectado
})
export class CssComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
