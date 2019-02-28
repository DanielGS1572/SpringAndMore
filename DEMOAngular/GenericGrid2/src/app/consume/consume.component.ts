import { Component, OnInit, ViewChild } from '@angular/core';
import { GridComponent } from '../grid/grid.component';
import { products } from '../products';
import { TableDataService } from '../table-data.service';

@Component({
  selector: 'consume-component',
  templateUrl: './consume.component.html'
})
export class ConsumeComponent implements OnInit {
  tableDataService: TableDataService;
  @ViewChild(GridComponent) gridComponent: GridComponent;


  constructor() { }

  ngOnInit() {
    this.gridComponent.columns = [{ field: "ProductID", title: "ID" },
    { field: "ProductName", title: "Nombre del producto" },
    { field: "QuantityPerUnit", title: "Cantidades por unidad" }];
    this.gridComponent.gridData = products;

   
  }

}
