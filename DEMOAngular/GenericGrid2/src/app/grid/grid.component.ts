import { Component, AfterViewInit, OnInit, Input } from '@angular/core';
import { TableDataService } from '../table-data.service';
import { GridDataResult, DataStateChangeEvent } from '@progress/kendo-angular-grid';
import { process, State } from '@progress/kendo-data-query';

@Component({
  selector: 'grid-component',
  templateUrl: './grid.component.html'
})
export class GridComponent implements AfterViewInit {
 
  
  public columns: any[] = [];
  public gridData: any[] = [];
  public mySelection: number[] = [];
  public elementsSelected: any[] = []


  public state: State = {};
  public gridDataResult: GridDataResult;

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

  public dataStateChange(state: DataStateChangeEvent): void {
    this.state = state;
    this.gridDataResult = process(this.gridData, this.state);
  }
 
  ngAfterViewInit(): void {
    this.gridDataResult  = process(this.gridData, this.state);
  }

}
