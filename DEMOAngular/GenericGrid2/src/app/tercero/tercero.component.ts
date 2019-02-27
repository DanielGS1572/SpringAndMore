import { Component, OnInit, ViewChild } from '@angular/core';
import { PrimeroComponent } from '../primero/primero.component';
import { products } from '../products';
import { TableDataService } from '../table-data.service';

@Component({
  selector: 'app-tercero',
  templateUrl: './tercero.component.html',
  styleUrls: ['./tercero.component.css']
})
export class TerceroComponent implements OnInit {
  tableDataService:TableDataService;
  @ViewChild(PrimeroComponent) gridComponent: PrimeroComponent;


  constructor() { }

  ngOnInit() {
    this.gridComponent.columns = [{ field: "ProductID", title: "ID" }, 
    { field: "ProductName", title: "Nombre del producto" }, 
    { field: "QuantityPerUnit", title: "Cantidades por unidad" }];

    this.gridComponent.gridData = products;
  }

}
