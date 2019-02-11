import { Directive, ElementRef,HostListener, Input } from '@angular/core';
//El ejemplo de la directiva se puede ver en app.component y se le pasa parametro
//HostListener --> para escuchar lo que pasa a un elemento (no es necesario hacer el llamado en el constructor)
//Input        --> el Input es para pasar como parametro en la directiva dentro de app.component
@Directive({
  selector: '[appResaltado]'
})
export class ResaltadoDirective {

  constructor(private el:ElementRef) { 
    console.log("directiva llamada")
  }

  @Input("appResaltado") nuevoColor:string;     //nuevoColor es un alias

  @HostListener('mouseenter') mouseEntro(){
    //console.log(this.nuevoColor);
    this.resaltar( this.nuevoColor || 'yellow');    //ya no se pone or si viene nulo pues ya esta "inicializado"
    //this.el.nativeElement.style.backgroundColor = "yellow";
  }
  @HostListener('mouseleave') mouseSalio(){
    this.resaltar(null);
    //this.el.nativeElement.style.backgroundColor = null;
  }

  private resaltar( color:string/*="yellow"*/ ){
    this.el.nativeElement.style.backgroundColor = color;
  }
}
