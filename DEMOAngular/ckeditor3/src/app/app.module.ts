import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CKEditorModule } from 'ng2-ckeditor';
import { ParametrosComponent } from './parametros/parametros.component';
import { DiccionarioComponent } from './diccionario/diccionario.component';
import { DatosGeneralesComponent } from './datos-generales/datos-generales.component';
import { LayoutModule } from '@progress/kendo-angular-layout';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HttpClientModule } from '@angular/common/http';




@NgModule({
  declarations: [
    AppComponent,
    ParametrosComponent,
    DiccionarioComponent,
    DatosGeneralesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    CKEditorModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule,
    LayoutModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
