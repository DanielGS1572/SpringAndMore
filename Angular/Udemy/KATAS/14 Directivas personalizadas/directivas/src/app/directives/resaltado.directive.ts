import { Directive, ElementRef, HostListener, Input } from '@angular/core';

@Directive({
  selector: '[appResaltado]'
})
export class ResaltadoDirective {

  constructor(private el: ElementRef) {
    console.log("Directiva llamada")
    el.nativeElement.style.backgroundColor = "red";
  }
  @Input() appResaltado: string;      //  @Input("appResaltado") nuevoColor: string;     --> se puede hacer así para usarlo como alias, el tema es que debe ser el 
  //mismo nombre del selector   

  @HostListener("mouseenter") funcionEntrar() {
    console.log(this.appResaltado);
    this.el.nativeElement.style.backgroundColor = "yellow";
  }

  @HostListener("mouseleave") funcionSalir() {
    this.el.nativeElement.style.backgroundColor = "green";
  }
}
