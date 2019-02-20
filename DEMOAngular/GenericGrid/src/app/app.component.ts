import { Component } from '@angular/core';
import { products } from './products';
import { GridDataResult, DataStateChangeEvent, PageChangeEvent, RowArgs } from '@progress/kendo-angular-grid';
import { Observable } from 'rxjs';
import { CategoriesService } from './northwind.service';
import { State } from '@progress/kendo-data-query';
import { SelectableSettings } from '@progress/kendo-angular-grid';


@Component({
  selector: 'my-app',
  template: ` <div style="margin: 10px">
    <div class="card">
        <div class="card-block k-form">
            <fieldset>
            <legend>Selection Settings</legend>
            <div class="k-form-field">
                <span>Mode</span>
                <input type="radio" name="mode" id="single" value="single" class="k-radio"
                    [(ngModel)]="mode" (change)="setSelectableSettings()">
                <label class="k-radio-label" for="single">Single</label>
                <input type="radio" name="mode" id="multiple" value="multiple" class="k-radio"
                    [(ngModel)]="mode" (change)="setSelectableSettings()">
                <label class="k-radio-label" for="multiple">Multiple</label>
            </div>

            <label class="k-form-field">
                <input
                    type="checkbox"
                    id="chkboxonly"
                    class="k-checkbox"
                    [(ngModel)]="checkboxOnly"
                    (change)="setSelectableSettings()">
                <label class="k-checkbox-label" for="chkboxonly">Use checkbox only selection</label>
            </label>
            </fieldset>
        </div>
    </div>
</div>



        <div style="margin: 10px">
          <div class="card">
              <div class="card-block k-form">
                  <fieldset>
                    <legend>Binding types</legend>
                    <div class="k-form-field">
                        <span>Bind the data to:</span>
                        <input [(ngModel)]="bindingType" type="radio" name="datamode" id="array" value="array" class="k-radio"
                        (change)="changeBindingType($event)">
                        <label class="k-radio-label" for="array">Array object</label>
                        <input [(ngModel)]="bindingType" type="radio" name="datamode" id="gridDataResult" value="gridDataResult" class="k-radio"
                        (change)="changeBindingType($event)">
                        <label class="k-radio-label" for="gridDataResult">GridDataResult object</label>
                        <input [(ngModel)]="bindingType" type="radio" name="datamode" id="async" value="async" class="k-radio"
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
          [selectable]="selectableSettings"
          [kendoGridSelectBy]="selectedCallback"
            [selectedKeys]="mySelection"
            (pageChange)="pageChange($event)"
         >
          <kendo-grid-checkbox-column [width]="100"></kendo-grid-checkbox-column>
            <kendo-grid-column *ngFor="let col of columns" [field]="col.field" [title]="col.title"></kendo-grid-column>
        </kendo-grid>
        <div kendo-grid></div>
        <pre>{{ mySelection | json }}</pre>
    `
})
export class AppComponent {
  public columns: any[] = [{ field: "ProductID",  title:"ID"  }, { field: "ProductName",  title:"Nombre del producto" }, { field: "QuantityPerUnit",  title:"Cantidades por unidad" }];
  public bindingType: String = 'array';
  public view: Observable<GridDataResult>;
  public gridData: any = products;
  public gridDataResult: GridDataResult = { data: products, total: products.length };
  public selectableSettings: SelectableSettings;
  public pageSize = 10;
  public skip = 0;
  public mySelection: number[] = [];

  public checkboxOnly = false;
    public mode:any = 'multiple';

  constructor(private service: CategoriesService) {
    this.view = service;
    this.setSelectableSettings();
  }
  public setSelectableSettings(): void {
    this.selectableSettings = {
        checkboxOnly: this.checkboxOnly,
        mode: this.mode
    };
}
public selectedCallback = (args) =>{
  return  args.dataItem;
} 
public pageChange(event: PageChangeEvent): void {
  this.skip = event.skip;
  this.loadItems();

  // Optionally, clear the selection when paging
  // this.mySelection = [];
}
private loadItems(): void {
  this.gridDataResult = {
      data: this.gridData.slice(this.skip, this.skip + this.pageSize),
      total: this.gridData.length
  };
}
selectedKeysChange(rows: any[]) {
  console.log(rows);
  //rows.forEach(function(value){
    //this.mySelection.push();
   // this.mySelection.push(products.find(i => i.ProductID == value));
  //});
  //console.log(products);

}
  changeBindingType(e) {
    switch (this.bindingType) {
      case 'array': {
        this.columns = [{ field: "ProductID" }, { field: "ProductName" }, { field: "QuantityPerUnit" }];
        this.gridData = products;
        break;
      }
      case 'gridDataResult': {
        this.columns = [{ field: "ProductID" }, { field: "ProductName" }, { field: "QuantityPerUnit" }];
        this.gridData = this.gridDataResult;
        break;
      }
      case 'async': {
        const state: State = { skip: 0, take: 100 };
        this.columns = [{ field: "CategoryID" }, { field: "CategoryName" }, { field: "Description" }];
        this.service.query(state);
        this.view.subscribe(res => {
          this.gridData = res;
        });
        break;
      }
    }
  }
}
