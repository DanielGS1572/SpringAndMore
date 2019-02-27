import { Component, OnInit } from '@angular/core';
import { TableDataService } from '../table-data.service';

@Component({
  selector: 'detalle-component',
  templateUrl: './detalle.component.html'
})
export class DetalleComponent implements OnInit {
  info: any[];
  public arreglo: string[][] = [["ProductName", "Nombre Producto"], ["QuantityPerUnit", "Cantidad"]];
  constructor(private service:TableDataService) { }

  ngOnInit() {
    this.service.cast.subscribe(info => this.info = info);
  }

}
