import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HttpClientModule } from '@angular/common/http';

import { GridModule } from '@progress/kendo-angular-grid';

import { AppComponent } from './app.component';
import { DetalleComponent } from './detalle/detalle.component';
import { InputsModule } from '@progress/kendo-angular-inputs';
import { ConsumeComponent } from './consume/consume.component';
import { GridComponent } from './grid/grid.component';


@NgModule({
  imports: [ HttpClientModule, FormsModule, BrowserModule, BrowserAnimationsModule, GridModule, InputsModule ],
  declarations: [ AppComponent, DetalleComponent, ConsumeComponent, GridComponent ],
  providers: [  ],
  bootstrap: [ AppComponent ]
})

export class AppModule { }
