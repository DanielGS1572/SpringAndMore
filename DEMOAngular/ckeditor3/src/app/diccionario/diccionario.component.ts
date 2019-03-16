import { Component, OnInit } from '@angular/core';
import {DataService} from '../service/data.service';

@Component({
  selector: 'app-diccionario',
  templateUrl: './diccionario.component.html',
  styleUrls: ['./diccionario.component.css']
})
export class DiccionarioComponent implements OnInit {
 /* diccionario = [
    'Diccionario1',
  'Diccionario2',
    'Diccionario3',
     'Diccionario4',
     'Diccionario5'
  ];*/
  diccionario: Object;
  constructor(private data: DataService) { }

  ngOnInit() {
    this.data.getDiccionario().subscribe(data =>{
      this.diccionario = data;
      console.log(this.diccionario);
    })
  }

}
