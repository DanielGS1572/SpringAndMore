import { Component, Directive, Input, Renderer2 } from '@angular/core';


@Component({
  selector: 'my-app',
  template: `
<!-- 
        <table>
        <div *ngFor="let element of elementsSelected; let i = index" >
          <tr>
            <div *ngFor="let arr of arreglo; let j = index">
                <td align="right">{{arreglo[j][1]}}:</td><td align="right"> <input  type="text" [(value)]="element[arreglo[j][0]]"/></td>
            </div>
          </tr>
          <br>
        </div>
        </table>
-->
 <app-tercero></app-tercero>
    `
})

export class AppComponent {
  


}
