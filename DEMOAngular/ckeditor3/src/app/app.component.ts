import { Component, ViewChild, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CKEditorComponent } from 'ng2-ckeditor';
import { HttpClient } from '@angular/common/http';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  @ViewChild('datosGenerales') datosGenerales;
  @ViewChild('diccionarioDatos') diccionarioDatos;

  ngAfterViewChecked(): void {
    console.log(this.datosGenerales.datosDiccionario);
    
    console.log(this.datosGenerales.selectedValue);
    this.datosGenerales.event.subscribe((ref) => 
  {
    console.log(this.datosGenerales.selectedValue + " xxxxxxxxxa");
    this.diccionarioDatos.diccionario  = [
      'Diccionario1',
    'Diccionario2',
      'Diccionario3',
       'Diccionario4',
       'Diccionario5'
    ];
  
});
  }




 
}
