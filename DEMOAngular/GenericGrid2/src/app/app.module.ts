import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HttpClientModule } from '@angular/common/http';

import { GridModule } from '@progress/kendo-angular-grid';

import { AppComponent } from './app.component';
import { SegundoComponent } from './segundo/segundo.component';
import { InputsModule } from '@progress/kendo-angular-inputs';
import { TerceroComponent } from './tercero/tercero.component';
import { PrimeroComponent } from './primero/primero.component';


@NgModule({
  imports: [ HttpClientModule, FormsModule, BrowserModule, BrowserAnimationsModule, GridModule, InputsModule ],
  declarations: [ AppComponent, SegundoComponent, TerceroComponent, PrimeroComponent ],
  providers: [  ],
  bootstrap: [ AppComponent ]
})

export class AppModule { }
