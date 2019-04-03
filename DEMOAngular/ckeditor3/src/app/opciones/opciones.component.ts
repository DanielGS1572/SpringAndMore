import { Component,  Input, ViewChild, OnInit, Inject, AfterViewInit } from '@angular/core';
import {  DataService } from '../service/data.service';
import { DatosGeneralesComponent } from '../datos-generales/datos-generales.component';
import { LsComboBoxComponent } from '../ls-combobox/ls-combobox.component';
import {MatDialog, MatDialogRef, MAT_DIALOG_DATA} from '@angular/material';

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
  cuerpo: string;
  json;
  json2;

  @Input() displayType:string="none";
  private datack:string;
  public constructor(private data: DataService,public dialog: MatDialog) { 
    this.data.observable.subscribe((data) => this.datack = data);
  }
  @ViewChild('template') cmbTemplate: LsComboBoxComponent = new LsComboBoxComponent();
  
 
  previsualizar(){
    //  this.json2={"template":btoa(this.datack),"nameTemplate":"","listDatos":{}}
    //  this.json2={"template":"PGh0bWw+CiA8aGVhZD4gCiAgPHRpdGxlPjwvdGl0bGU+IAogIDxtZXRhIGNoYXJzZXQ9IlVURi04Ij4gCiA8L2hlYWQ+IAogPGJvZHk+IAogIDxwPnd3dy5tdWx0aXZhLmNvbS5teDwvcD4gCiAgPHA+PHNwYW4+W2hveV08L3NwYW4+PC9wPiAKICA8cD5SZXByZXNlbnRhZG8gcG9yIGVsKGxvcykgc2XDsW9yZShlcyk6IFBydWViYTxicj4gUHJlc2VudGUuPC9wPiAKICA8cD4mbmJzcDs8L3A+IAogIDxwPk11bHRpdmEgYWdyYWRlY2Ugc3UgcHJlZmVyZW5jaWEgeSBjb25maWFuemEgcG9yIGVsZWdpcm5vcyBjb21vIHN1IEJhbmNvLjxicj4gPGJyPiBBZGp1bnRvIGVuY29udHJhcsOhIGVsIENvbnRyYXRvIE1hcmNvICB5L28gZWwobG9zKSBDb250cmF0byhzKSBBbmV4byhzKSA8c3Bhbj5bYW5leG9zaW5jb250cmF0b108L3NwYW4+LCBwYWdhcmUgeSB0YWJsYSBkZSBwYWdvcy4gQWjDrSBlbmNvbnRyYXLDoSB0b2RhIGxhIGluZm9ybWFjacOzbiByZWxhY2lvbmFkYSBjb24gbGEgb3BlcmFjacOzbiBkZSBwcsOpc3RhbW8gY2VsZWJyYWRhIGNvbiBub3NvdHJvcy4gU29icmUgw6lzdGEgcXVlcmVtb3MgYXByb3ZlY2hhciBsYSBvcG9ydHVuaWRhZCBwYXJhIHJlY29yZGFybGUgYWxndW5vcyBwdW50b3MgaW1wb3J0YW50ZXM6PC9wPiAKICAKICA8dWw+IAogICA8bGk+U3Ugc2lndWllbnRlIHBhZ28gc2Vyw6EgZWwgcHLDs3hpbW8gcHJ1ZWJhLCBwcnVlYmEgeSBzdXMgcGFnb3Mgc3Vic2VjdWVudGVzIHNlcsOhbiBsb3MgZMOtYXMgcHJ1ZWJhIGRlIGNhZGEgbWVzLiBQYXJhIGVsbG8gcmVjdWVyZGUgcXVlIGRlYmUgZGVwb3NpdGFyIGxhcyByZW50YXMgYSBub21icmUgZGUg4oCcTXVsdGEgR3J1cG8gRmluYW5jaWVybyBTQSBkZSBDVuKAnSwgYSBsYSBjdWVudGEgbsO6bWVybyA4ODg4ODg4LCBjbGFiZSBpbnRlcmJhbmNhcmlhIDk5OTk5IGNvbiBsYSBSRUZFUkVOQ0lBIE5vLiA8c3Bhbj5bcmVmZXJlbmNpYWJhbmNhcmlhXTwvc3Bhbj4uPC9saT4gCiAgPC91bD4gCiAgPHA+Jm5ic3A7PC9wPiAKICA8cD4mbmJzcDs8L3A+IAogIDxwPlBvbmVtb3MgdGFtYmnDqW4gYSBzdSBkaXNwb3NpY2nDs24gbG9zIGRlbcOhcyBwcm9kdWN0b3MgZGVsIEdydXBvIGNvbW86PC9wPiAKICA8cD4mbmJzcDs8L3A+IAogIDx1bD4gCiAgIDxsaT5GaWR1Y2lhcmlvIHkgRm9uZG9zPC9saT4gCiAgIDxsaT5NZXJjYWRvIGRlIGRpbmVybzwvbGk+IAogICA8bGk+SW52ZXJzaW9uZXMgYSBwbGF6bzwvbGk+IAogIDwvdWw+IAogIDxwPiZuYnNwOzwvcD4gCiAgPHA+Jm5ic3A7PC9wPiAKICA8cD5MZSByZWNvcmRhbW9zIHF1ZSBzdSBlamVjdXRpdm8gZGUgY3VlbnRhIHkgZWwgZGVwYXJ0YW1lbnRvIGRlIGF0ZW5jacOzbiBhIGNsaWVudGVzIGVzdMOhbiBhIHN1cyDDs3JkZW5lcy4gRW4gY2FzbyBkZSBjdWFscXVpZXIgZHVkYSBubyBkZWplIGRlIGNvbnRhY3Rhcmxvczo8L3A+IAogIDxwPiI8L3A+IAogIDxwPiZuYnNwOzwvcD4gCiAgPHRhYmxlIGJvcmRlcj0iMSI+IAogICA8dGJvZHk+IAogICAgPHRyPiAKICAgICA8dGQ+IDxwPjxzcGFuPltwcm9tb3Rvcl08L3NwYW4+PC9wPiA8L3RkPiAKICAgICA8dGQ+IDxwPkF0ZW5jacOzbiBhIGNsaWVudGVzPC9wPiA8L3RkPiAKICAgIDwvdHI+IAogICAgPHRyPiAKICAgICA8dGQ+IDxwPlRlbC4gNTIgOTkgOTkgOTk8L3A+IDwvdGQ+IAogICAgIDx0ZD4gPHA+VGVscy4gNTIgOTkgOTkgOTkgeSA1OSA5OSA5OSA5OSBEaXJlY3RvczwvcD4gPC90ZD4gCiAgICA8L3RyPiAKICAgIDx0cj4gCiAgICAgPHRkPiA8cD5FLU1haWw6IHBydWViYTwvcD4gPC90ZD4gCiAgICAgPHRkPiA8cD5FLU1haWw6IGF0ZW5jaW9uYWNsaWVudGVzQG11bHRpdmEuY29tLm14PC9wPiA8L3RkPiAKICAgIDwvdHI+IAogICA8L3Rib2R5PiAKICA8L3RhYmxlPiAKICA8cD5FbiBNdWx0aXZhIG5vcyBwcmVvY3VwYW1vcyBwb3Igc3UgZW50ZXJhIHNhdGlzZmFjY2nDs24gcG9yIGxvIHF1ZSBsZSBhZ3JhZGVjZXJlbW9zIGN1YWxxdWllciBjb21lbnRhcmlvIG8gc3VnZXJlbmNpYSBwYXJhIG1lam9yYXIgbnVlc3RybyBzZXJ2aWNpby48YnI+IDxicj4gUGFyYSBub3NvdHJvcyBlcyB1biBwbGFjZXIgYXRlbmRlcmxlIDopLCBwb3IgbG8gcXVlIG5vcyByZWl0ZXJhbW9zIGEgc3VzIMOzcmRlbmVzLjwvcD4gCiAgPHA+RklSTUEgUFJPTU9UT1I8L3A+ICAgCiA8L2JvZHk+CjwvaHRtbD4=",
    //  "nameTemplate":"",
    //  "listDatos":{"referenciabancaria":"abc","anexosincontrato":"prueba"}};
      console.log('Consume servicio');
      //this.data.post("http://192.168.20.84:7000/o/lskit-osgi-documents-rest/documentosRest/viewTemplate",this.json2).subscribe(res => console.log(res + " res"));
      
      const dialogRef = this.dialog.open(DialogOverviewExampleDialog, {
        width: '800px', height: '1000px',
        data: {cuerpo:this.cuerpo }
      });
      dialogRef.afterClosed().subscribe(result => {
        console.log('The dialog was closed');
      });
  
    }
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
@Component({
  selector: 'preview',
  templateUrl: 'preview.html'
})
export class DialogOverviewExampleDialog  {
  

  constructor(
    public dialogRef: MatDialogRef<DialogOverviewExampleDialog>,
    @Inject(MAT_DIALOG_DATA) public data: DialogData) {}

  onNoClick(): void {
    this.dialogRef.close(false);
  }

}

export interface DialogData {
  cuerpo: string;
}