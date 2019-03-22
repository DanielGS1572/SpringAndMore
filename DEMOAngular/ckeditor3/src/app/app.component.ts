import { Component, ViewChild, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CKEditorComponent } from 'ng2-ckeditor';
import { HttpClient } from '@angular/common/http';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent{
  
 /*Corregir, meter donde corresponde */
 constructor(private http:HttpClient){

 }

 
}
