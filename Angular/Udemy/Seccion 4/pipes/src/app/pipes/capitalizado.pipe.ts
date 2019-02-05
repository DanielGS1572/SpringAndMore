import { Pipe, PipeTransform } from '@angular/core';
import { Type } from '@angular/compiler';

@Pipe({
    name: 'capitalizado'
})
export class CapitalizadoPipe implements PipeTransform {
    transform(value: string, todas: boolean = true/*, arg1,arg2,arg3*/): string {
        console.log(value);                                         //value es el valor antepuesto al pipe
        /* console.log(arg1);                                          //los argumentos son los parametros que de le pasan al pipe capitalizado:x1:x2:xn, 
                                                                     //otra forma de pasar argumentos es con ...args[]
         console.log(arg2);
         console.log(arg3);*/
        value = value.toLowerCase();
        let nombres = value.split(" ");
        if (todas) {
            for (let i in nombres) {
                nombres[i] = nombres[i][0].toUpperCase() + nombres[i].substr(1)
            }
        }
        return nombres.join(" ");
    }
}