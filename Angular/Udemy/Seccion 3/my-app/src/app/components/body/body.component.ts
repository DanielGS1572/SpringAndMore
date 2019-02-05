import { Component } from '@angular/core';

@Component({
    selector: 'app-body',
    templateUrl: './body.component.html'
})
export class BodyComponent {
    mostrar = true;             //El *ngIf se encarga de mostrar/ocultar elementos, 
    //esto lo hace a nivel del tag donde se encuentre la directiva
    personajes: string[] = ["Spiderman", "Venom", "Dr. Octopus"];   //ver que en el *ngFor se puede poner un index --> let i = index
    frase: any = {
        contenido: "Un gran poder conlleva una gran responsabilidad",
        autor: "Ben Parker"
    }


}