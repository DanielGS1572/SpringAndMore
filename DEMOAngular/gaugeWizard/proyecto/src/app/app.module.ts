import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GaugesModule } from '@progress/kendo-angular-gauges';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatStepperModule, MatInputModule, MatButtonModule, MatAutocompleteModule } from '@angular/material';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';



@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    MatStepperModule,
        MatInputModule,
        MatButtonModule,
        MatAutocompleteModule,  
    BrowserModule,
    AppRoutingModule,
    GaugesModule,
    BrowserAnimationsModule,
    FormsModule, ReactiveFormsModule 
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
