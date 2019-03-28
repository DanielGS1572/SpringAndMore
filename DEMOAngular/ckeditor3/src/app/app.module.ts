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
import { OpcionesComponent } from './opciones/opciones.component';
import { LsCheckboxComponent } from './ls-checkbox/ls-checkbox.component';
import { LsComboBoxComponent } from './ls-combobox/ls-combobox.component';
import { CurrencyPipe } from "@angular/common";
import { DataService } from './service/data.service';




@NgModule({
  declarations: [
    AppComponent,
    ParametrosComponent,
    DiccionarioComponent,
    DatosGeneralesComponent,
    OpcionesComponent,
    LsCheckboxComponent,
    LsComboBoxComponent
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
  providers: [CurrencyPipe, DataService],
  bootstrap: [AppComponent]
})
export class AppModule { }
