import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HttpClientModule } from '@angular/common/http';

import { GridModule } from '@progress/kendo-angular-grid';

import { AppComponent } from './app.component';
import { CategoriesService } from './northwind.service';

@NgModule({
  imports: [ HttpClientModule, FormsModule, BrowserModule, BrowserAnimationsModule, GridModule ],
  declarations: [ AppComponent ],
  providers: [ CategoriesService ],
  bootstrap: [ AppComponent ]
})

export class AppModule { }
