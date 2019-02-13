import { Pipe, PipeTransform } from '@angular/core';
import { DatePipe } from '@angular/common';
@Pipe({
  name: 'prettyTime'
})
export class PrettyTimePipe implements PipeTransform {
  transform(value: string) {
     
     var _value = Number(value);
     
     var dif = Math.floor( ( (Date.now() - _value) / 1000 ) / 86400 );
     return convertToNiceDate(value);
     
    /* if ( dif < 30 ){
          return convertToNiceDate(value);
     }
     else{
         var datePipe = new DatePipe("en-US");
         value = datePipe.transform(value, 'MMM-dd-yyyy');
         return value;
     }*/
  }
}

function convertToNiceDate(time: string) {
  var date = new Date(time),
      diff = (((new Date()).getTime() - date.getTime()) / 1000),
      daydiff = Math.floor(diff / 86400);
console.log("daydiff " + daydiff);
  if (isNaN(daydiff) || daydiff < 0)
      return '';

  return daydiff == 0 && (
      diff < 60 && "Justo ahora" ||
      diff < 120 && "hace 1 minuto" ||
      diff < 3600 && Math.floor(diff / 60) + " hace unos minutos" ||
      diff < 7200 && "hace una hora" ||
      diff < 86400 && "hace " + Math.floor(diff / 3600) + " horas") ||
      daydiff == 1 && "Ayer" ||
      daydiff < 7 &&  "hace " + daydiff + " días" ||
      daydiff < 30 &&  "hace " + Math.ceil(daydiff / 7) + " semanas" ||
      daydiff >= 30 &&  "hace " + Math.ceil(daydiff / 30) + " meses";
}
