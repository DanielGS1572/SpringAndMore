import { Component } from '@angular/core';
import { TableDataService } from '../table-data.service';
@Component({
  selector: 'app-primero',
  template: `<kendo-grid  #var="kendoGrid"
  [data]="gridData"
  [height]="410"
  [kendoGridSelectBy]="selectedCallback"
    [selectedKeys]="mySelection"
    (change)="onSelection()"
    (cellClick)="onSelection()">
  <kendo-grid-checkbox-column [width]="100"></kendo-grid-checkbox-column>
    <kendo-grid-column *ngFor="let col of columns" [field]="col.field" [title]="col.title"></kendo-grid-column>
</kendo-grid>`,
  styleUrls: ['./primero.component.css']
})
export class PrimeroComponent {

  public columns: any[];
  public gridData: any;
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
