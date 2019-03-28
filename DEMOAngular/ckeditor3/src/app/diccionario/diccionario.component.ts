import { Component, OnInit, ViewChild } from '@angular/core';
import {DataService} from '../service/data.service';
import { Observable } from 'rxjs';
import { DatosGeneralesComponent } from '../datos-generales/datos-generales.component';

@Component({
  selector: 'app-diccionario',
  templateUrl: './diccionario.component.html',
  styleUrls: ['./diccionario.component.css']
})
export class DiccionarioComponent implements OnInit {
public diccionario = [];
  @ViewChild(DatosGeneralesComponent) datosGenerales : DatosGeneralesComponent;

  constructor(private data: DataService) { }

  ngOnInit() {
    this.data.getDiccionario().subscribe(resp =>{
      console.log("resp " , resp);
    });
    
   

  }
  

  
}
