import { BrowserModule } from '@angular/platform-browser';
import {platformBrowserDynamic} from '@angular/platform-browser-dynamic';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {   MatButtonModule,
  MatFormFieldModule,
  MatInputModule,
  MatRippleModule, MatOptionModule, MatSelectModule } from '@angular/material';
import { SegundoComponenteComponent } from './segundo-componente/segundo-componente.component';
import { InfoService } from './info.service';
@NgModule({
  declarations: [
    AppComponent,
    SegundoComponenteComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatFormFieldModule,
    MatInputModule,
    MatRippleModule, MatOptionModule, MatSelectModule
  ],
  providers: [InfoService],
  bootstrap: [AppComponent]
})
export class AppModule { }
