import { Component, Directive, Input, Renderer2 } from '@angular/core';
import { GridDataResult } from '@progress/kendo-angular-grid';
import { Observable } from 'rxjs';
import { TableDataService } from './table-data.service';

@Component({
  selector: 'my-app',
  template: `<kendo-grid  #var="kendoGrid"
          [data]="gridData"
          [height]="410"
          [kendoGridSelectBy]="selectedCallback"
            [selectedKeys]="mySelection"
            (change)="onSelection()"
            (cellClick)="onSelection()">
          <kendo-grid-checkbox-column [width]="100"></kendo-grid-checkbox-column>
            <kendo-grid-column *ngFor="let col of columns" [field]="col.field" [title]="col.title"></kendo-grid-column>
        </kendo-grid>
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
  public columns: any[] = [{ field: "ProductID", title: "ID" }, { field: "ProductName", title: "Nombre del producto" }, { field: "QuantityPerUnit", title: "Cantidades por unidad" }];
  public gridData: any;
  public gridDataResult: GridDataResult;
  public arreglo: string[][] = [["ProductName", "Nombre Producto"], ["QuantityPerUnit", "Cantidad"]];
  public mySelection: number[] = [];
  public elementsSelected: any[] = []


  constructor(private service:TableDataService){

  }


  public onSelection() {
    this.elementsSelected = JSON.parse(JSON.stringify(this.mySelection));

    this.service.editInfo(this.elementsSelected);
    

    return this.mySelection;
  }
  public selectedCallback = (args) => {
    return args.dataItem;
  }



}
