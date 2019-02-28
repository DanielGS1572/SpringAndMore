import { Component, Directive, Input, Renderer2 } from '@angular/core';
import { products } from './products';
import { GridComponent,GridDataResult, DataStateChangeEvent, PageChangeEvent, RowArgs } from '@progress/kendo-angular-grid';
import { Observable } from 'rxjs';
import { CategoriesService } from './northwind.service';
import { process,State } from '@progress/kendo-data-query';
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
                        <label class="k-radio-label" for="array">Tabla 1</label>
                      <!--  <input [(ngModel)]="bindingType" type="radio" name="datamode" id="gridDataResult" value="gridDataResult" class="k-radio"
                        (change)="changeBindingType($event)">
                        <label class="k-radio-label" for="gridDataResult">GridDataResult object</label>-->
                        <input [(ngModel)]="bindingType" type="radio" name="datamode" id="async" value="async" class="k-radio"
                        (change)="changeBindingType($event)">
                        <label class="k-radio-label" for="async">Fuente asíncrona</label>
                    </div>
                  </fieldset>
              </div>
          </div>
        </div>

        <kendo-grid  #var="kendoGrid"
          [data]="gridData"
          [height]="410"
          [selectable]="selectableSettings"
       
          [sortable]="true"
          [filterable]="true"
          [kendoGridSelectBy]="selectedCallback"
          [selectedKeys]="mySelection"
          (change)="onSelection()"
          (cellClick)="onSelection()"
          (dataStateChange)="dataStateChange($event)"
         >

          <kendo-grid-checkbox-column [width]="100"></kendo-grid-checkbox-column>
            <kendo-grid-column *ngFor="let col of columns" [field]="col.field" [title]="col.title"></kendo-grid-column>
        </kendo-grid>

        <table>
        <div *ngFor="let element of elements; let i = index" >
          <tr>
            <div *ngFor="let arr of arreglo; let j = index">
                <td align="right">{{arreglo[j][1]}}:</td><td align="right"> <input  type="text" [(value)]="element[arreglo[j][0]]"/></td>
            </div>
          </tr>
          <br>
        </div>
        </table>
    `
})

export class AppComponent {
  public columns: any[] = [{ field: "ProductID",  title:"ID"  }, { field: "ProductName",  title:"Nombre del producto" }, { field: "QuantityPerUnit",  title:"Cantidades por unidad" }];
  public bindingType: String = 'array';
  public view: Observable<GridDataResult>;

public state: State = {
  
};

  public gridData: GridDataResult  = process(products, this.state);
  public selectableSettings: SelectableSettings;
  public arreglo:string[][] = [["ProductName","Nombre Producto"],["QuantityPerUnit","Cantidad"]];
  public mySelection: number[] = [];
  public elements: any[] = []


  public checkboxOnly = false;
    public mode:any = 'multiple';

  constructor(private service: CategoriesService) {
    this.setSelectableSettings();
  
  }
  public setSelectableSettings(): void {
    this.selectableSettings = {
        checkboxOnly: this.checkboxOnly,
        mode: this.mode
    };
}
public onSelection(){
 this.elements=JSON.parse(JSON.stringify(this.mySelection));
 
 this.mySelection
 console.log(this.elements);
  
  return this.mySelection;
}
public selectedCallback = (args) =>{
  return  args.dataItem;
} 

public dataStateChange(state: DataStateChangeEvent): void {
  this.state = state;
  console.log("testst")
  this.gridData = process(products, this.state);
}
  changeBindingType(e) {
    switch (this.bindingType) {
      case 'array': {
        this.columns = [{ field: "ProductID" }, { field: "ProductName" }, { field: "QuantityPerUnit" }];
        
        break;
        
      }
    
    }
  }
}
