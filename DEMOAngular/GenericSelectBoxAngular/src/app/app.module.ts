import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";

import { ComboBoxComponentComponent } from './combo-box-component/combo-box-component.component';


//import ngx-translate
import {TranslateLoader, TranslateModule} from '@ngx-translate/core';
import {TranslateHttpLoader} from '@ngx-translate/http-loader';
import {HttpClient, HttpClientModule} from '@angular/common/http';
import { CalculoComponent } from './calculo/calculo.component';
import { CalculoRenderer2Component } from './calculo-renderer2/calculo-renderer2.component';
import { CalculoRxjsComponent } from './calculo-rxjs/calculo-rxjs.component';
import { RadioButtonComponentComponent } from './radio-button-component/radio-button-component.component';
import { CheckBoxComponentComponent } from './check-box-component/check-box-component.component';
import { MatFormFieldModule, MatInputModule,MatSelectModule  } from '@angular/material';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { DropDownsModule } from '@progress/kendo-angular-dropdowns';
import { ButtonsModule } from '@progress/kendo-angular-buttons';




@NgModule({
  declarations: [
    AppComponent,
    ReactiveFormComponent,
    ComboBoxComponentComponent,
    CalculoComponent,
    CalculoRenderer2Component,
    CalculoRxjsComponent,
    RadioButtonComponentComponent,
    CheckBoxComponentComponent
  ],
  imports: [
    FormsModule,
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,MatFormFieldModule, MatInputModule,BrowserAnimationsModule,MatSelectModule,
    //ngx-translate
    HttpClientModule,
    TranslateModule.forRoot({
      loader: {
        provide: TranslateLoader,
        useFactory: HttpLoaderFactory,
        deps: [HttpClient]
      }
    }),
    DropDownsModule,
    ButtonsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

// required for AOT compilation
export function HttpLoaderFactory(http: HttpClient) {
  return new TranslateHttpLoader(http);
}
