import { Component } from '@angular/core';
import { products } from './products';
import { GridDataResult, DataStateChangeEvent } from '@progress/kendo-angular-grid';
import { Observable } from 'rxjs';
import { CategoriesService } from './northwind.service';
import { State } from '@progress/kendo-data-query';

@Component({
    selector: 'my-app',
    template: `
        <div style="margin: 10px">
          <div class="card">
              <div class="card-block k-form">
                  <fieldset>
                    <legend>Binding types</legend>
                    <div class="k-form-field">
                        <span>Bind the data to:</span>
                        <input [(ngModel)]="bindingType" type="radio" name="mode" id="array" value="array" class="k-radio"
                        (change)="changeBindingType($event)">
                        <label class="k-radio-label" for="array">Array object</label>
                        <input [(ngModel)]="bindingType" type="radio" name="mode" id="gridDataResult" value="gridDataResult" class="k-radio"
                        (change)="changeBindingType($event)">
                        <label class="k-radio-label" for="gridDataResult">GridDataResult object</label>
                        <input [(ngModel)]="bindingType" type="radio" name="mode" id="async" value="async" class="k-radio"
                        (change)="changeBindingType($event)">
                        <label class="k-radio-label" for="async">Asynchronous source</label>
                    </div>
                  </fieldset>
              </div>
          </div>
        </div>

        <kendo-grid
          [data]="gridData"
          [height]="410"
          [loading]="view.loading"
          >
            <kendo-grid-column *ngFor="let col of columns" [field]="col.field"></kendo-grid-column>
        </kendo-grid>
    `
})
export class AppComponent {
    public columns: any[] = [{field: "ProductID"}, {field: "ProductName"}, {field: "QuantityPerUnit"}];
    public bindingType: String = 'array';
    public view: Observable<GridDataResult>;
    public gridData: any = products;
    public gridDataResult: GridDataResult = {data: products, total: products.length};

    constructor(private service: CategoriesService) {
      this.view = service;
    }

    changeBindingType(e) {
      switch (this.bindingType) {
        case 'array' : {
          this.columns = [{field: "ProductID"}, {field: "ProductName"}, {field: "QuantityPerUnit"}];
          this.gridData = products;
          break;
        }
        case 'gridDataResult' : {
          this.columns = [{field: "ProductID"}, {field: "ProductName"}, {field: "QuantityPerUnit"}];
          this.gridData = this.gridDataResult;
          break;
        }
        case 'async' : {
          const state: State = {skip: 0, take: 100};
          this.columns = [{field: "CategoryID"}, {field: "CategoryName"}, {field: "Description"}];
          this.service.query(state);
          this.view.subscribe(res => {
            this.gridData = res;
            });
          break;
        }
      }
    }
}
