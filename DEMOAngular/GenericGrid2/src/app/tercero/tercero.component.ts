import { Component, OnInit, ViewChild } from '@angular/core';
import { AppComponent } from '../app.component';
import { products } from '../products';
import { TableDataService } from '../table-data.service';

@Component({
  selector: 'app-tercero',
  templateUrl: './tercero.component.html',
  styleUrls: ['./tercero.component.css']
})
export class TerceroComponent implements OnInit {
  tableDataService:TableDataService;
  @ViewChild(AppComponent) gridComponent: AppComponent;


  constructor() { }

  ngOnInit() {
    this.gridComponent.gridData = products;
    this.gridComponent.gridDataResult = { data: products, total: products.length };
  }

}
