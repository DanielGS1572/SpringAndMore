import { Component, Inject, ViewChild,  OnInit, Input, NgZone,  Output, EventEmitter } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CKEditorComponent } from 'ng2-ckeditor';
import { DataService } from '../service/data.service';
import { LsComboBoxComponent } from '../ls-combobox/ls-combobox.component';
import { InfoService } from '../service/infoservice.service';
import {MatDialog, MatDialogRef, MAT_DIALOG_DATA} from '@angular/material';


@Component({
  selector: 'app-datos-generales',
  templateUrl: './datos-generales.component.html'
})
export class DatosGeneralesComponent implements OnInit {
  dataSourceDicc: string[] = [];
  info: string;
  selectedValue: Diccionario;
  arr=[];
  cuerpo: string ;

  datosDiccionario: Diccionario[] = []/*[
    { nombre: 'nombre1' , descripcion:'descripcion' },
    { nombre: 'nombre1' , descripcion:'descripcion' },
    { nombre: 'nombre1' , descripcion:'descripcion' }
  ];*/
  @Input()
  public items: Diccionario[] = [];
  @Output()
  public event = new EventEmitter();
  disabled:Boolean=false;
  ngOnInit(): void {
    

    /* this.cmbDiccionario.caption = 'nombre';
     this.getDiccionario().forEach(o => {//TODO reemplazar por un servicio
       console.log("o ", o);
       this.cmbDiccionario.items.push(o);
     });
 */
    // this.cmbCanalMultiva.caption = 'name';
    // this.getPersons().forEach(o => {//TODO reemplazar por un servicio
    //   this.cmbCanalMultiva.items.push(o);
    // });

    this.data.obtenerdicc().subscribe(dato => {
      let nombreDiccionario: any[] = JSON.parse(JSON.stringify(dato.result));
      nombreDiccionario.forEach(elemento => this.datosDiccionario.push(elemento));
      /*   this.cmbDiccionario.caption = "nombre";
      this.cmbDiccionario.items = this.getDiccionario();
      console.log("xxxxxxxxxxxxxxxxxxx" + this.cmbDiccionario.value);
*/

    });



  }

  public changed(obj: Diccionario) {
    this.infoService.cast.subscribe(info => { console.log(info); this.info = info });
    
    this.event.emit(this.selectedValue);
    this.disabled=true;
  
    const dialogRef = this.dialog.open(DialogOverview, {
      width: '800px', height: '1000px',
      data: {cuerpo:this.cuerpo }
      

    });
    

  }
  public title = 'ckeditor';
  ckeditorContent: string = `Lorem ipsum dolor sit amet, <p>consectetur</p> adipiscing elit. Fusce arcu arcu, tincidunt sed augue et, ultrices laoreet odio. Aliquam suscipit in sem ac sodales. Nullam vel tortor dapibus nibh pulvinar eleifend nec nec lacus. Suspendisse eget metus vitae nulla dictum maximus. Fusce mollis lectus nibh, nec porttitor lectus consectetur dictum. Nam dignissim odio tortor, sed congue elit faucibus eu. Sed egestas efficitur mauris non feugiat.
    Nulla facilisi. Fusce quis bibendum erat. Vestibulum tincidunt odio nec erat scelerisque hendrerit. Pellentesque finibus dolor non ligula condimentum varius. Suspendisse vitae sagittis magna. Maecenas est mauris, congue ornare purus facilisis, pharetra gravida dui. Aliquam erat volutpat. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Cras porta sem ipsum, non rutrum massa commodo ut. `;
  public contenido: string = this.ckeditorContent;   //TODO
  private nombreNotificacion: string;
  ckeditorContent2: string = `TEST`;
  @ViewChild('ckEditorSMS') ckEditorSMS;
  @ViewChild('ckEditorMAIL') ckEditorMAIL;
  @ViewChild('ckEditorWEB') ckEditorWEB;

  //@ViewChild('diccionarioDatos') cmbDiccionario: LsComboBoxComponent = new LsComboBoxComponent(this.elementref);
  @ViewChild('canalMultiva') cmbCanalMultiva: LsComboBoxComponent = new LsComboBoxComponent();
  public datosGenerales: DatosGenerales = {
    NombreNotificacion: "NombreNotificacion",
    DicionarioDatos: "DicionarioDatos",
    CanalMultiva: "CanalMultiva"
  };



  public constructor(private data: DataService, private zone: NgZone, private infoService: InfoService,public dialog: MatDialog) {
     this.ckEditorSMS = new CKEditorComponent(this.zone);
    this.ckEditorMAIL = new CKEditorComponent(this.zone);
    this.ckEditorWEB = new CKEditorComponent(this.zone);

  }
  ngAfterViewInit(): void {

   

  }

  ngAfterViewChecked() {
   
    let editor = this.ckEditorSMS.instance;

    editor.config.height = '400';
    editor.config.toolbarGroups = [
          { name: 'insert', groups: ['diccionario', 'valida'] }
    ]
   
    editor.config.extraPlugins = 'diccionario,valida';
    editor.config.removeButton = 'Source, Save, Templates, Find, Replace, Scayt, SelectAll, Form, Radio';
    this.data.getData(editor.getData());





  }
  getDiccionario(): Diccionario[] {
    return this.datosDiccionario;
  }

 


}


export interface DatosGenerales {
  NombreNotificacion: string,
  DicionarioDatos: string,
  CanalMultiva: string
}




export interface Diccionario {
  "nombre": string,
  "descripcion": string
}


@Component({
  selector: 'confirmacion',
  templateUrl: 'confirmacion.html'
})
export class DialogOverview  {
  
  i = 0; 
  arr = [];
  texto:string;
  constructor(
    public dialogRef: MatDialogRef<DialogOverview>,
    @Inject(MAT_DIALOG_DATA) public data: DialogData) {}
ngAfterContentInit(): void { 
  var x;
  x = document.getElementsByClassName("valoresDiccionario");
  for (this.i = 0; this.i < x.length; this.i++) {
   
    this.arr.push(x[this.i].innerText);
  }
  this.texto = "hey";
  console.log(this.arr,"ARRRRRRRRRRRRR",x.length);
  
}
  
    btnOk(){
      this.dialogRef.close(false);
    }
    btnCancelar(){
      this.dialogRef.close(false);
      location.reload();
    }
}

export interface DialogData {
  cuerpo: string;
}