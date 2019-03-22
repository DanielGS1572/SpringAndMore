import { Component,  Input, ViewChild, OnInit } from '@angular/core';
import {  DataService } from '../service/data.service';
import { DatosGeneralesComponent } from '../datos-generales/datos-generales.component';
import { LsComboBoxComponent } from '../ls-combobox/ls-combobox.component';
//import {MatDialog, MatDialogRef, MAT_DIALOG_DATA} from '@angular/material';

@Component({
  selector: 'app-opciones',
  templateUrl: './opciones.component.html',
  styleUrls: ['./opciones.component.css']
})
export class OpcionesComponent implements OnInit {
  ngOnInit(): void {

    this.cmbTemplate.caption = 'name';
    this.getPersons().forEach(o => {//TODO reemplazar por un servicio
			this.cmbTemplate.items.push(o);
    });
  }
 
  subject:string="";
  json;
  @Input() displayType:string="none";
  private datack:string;
  public constructor(private data: DataService) { 
    this.data.observable.subscribe((data) => this.datack = data);
  }
  @ViewChild('template') cmbTemplate: LsComboBoxComponent = new LsComboBoxComponent();
  
 
  /*

  previsualizar(){
    const dialogRef = this.dialog.open(DialogOverviewExampleDialog, {
      width: '250px',
      data: {name: this.name, animal: this.animal}
    });
  }*/
  guardar(){
    this.json={"template":this.datack,"nameTemplate":"abcd","listDatos":[]}

    
    this.data.mergeTemplate(this.json).subscribe(resp => console.log(resp,"res"),error => { console.log(error,"error")});
    console.log("Se envia data");

  }
  getPersons(): Person[]{//TODO reemplazar por un servicio
    console.log("Obteniendo Personas");
    return PERSONS;
  }

}

//TODO reemplazar por un servicio
export class Person {
constructor(public id?: number,
      public name?: string) {
}
}

export const PERSONS: Person[] = [
{id: 1, name:'Felipe' },
{id: 2, name:'Daniel' },
{id: 3, name:'Hector' },
{id: 4, name:'Carlos' },
{id: 5, name:'Ricardo'}
];