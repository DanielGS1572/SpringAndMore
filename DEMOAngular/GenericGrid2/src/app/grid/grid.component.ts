import { Component } from '@angular/core';
import { TableDataService } from '../table-data.service';
@Component({
  selector: 'grid-component',
  templateUrl: './grid.component.html'
})
export class GridComponent {

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
