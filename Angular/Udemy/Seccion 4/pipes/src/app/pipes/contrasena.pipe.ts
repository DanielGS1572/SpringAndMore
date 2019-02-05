import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'contrasena'
})
export class ContrasenaPipe implements PipeTransform {

  transform(value: any, args?: boolean  ): string {
    console.log('value ' + value);
    if(args){
      return '*****';
    }else{
      return value;
    }
  }

}
