import { Component, ViewChild, AfterViewInit, OnInit, Input, ɵConsole, NgZone, OnDestroy, OnChanges, ElementRef, Output, EventEmitter } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CKEditorComponent } from 'ng2-ckeditor';
import { DataService } from '../service/data.service';
import { LsComboBoxComponent } from '../ls-combobox/ls-combobox.component';
import { InfoService } from '../service/infoservice.service';

@Component({
  selector: 'app-datos-generales',
  templateUrl: './datos-generales.component.html',
  styleUrls: ['./datos-generales.component.css']
})
export class DatosGeneralesComponent implements OnInit {
  dataSourceDicc : string[] = [];
  info:string;
  selectedValue: Diccionario;
  datosDiccionario: Diccionario[] = [
    { nombre: 'nombre1' , descripcion:'descripcion' },
    { nombre: 'nombre1' , descripcion:'descripcion' },
    { nombre: 'nombre1' , descripcion:'descripcion' }
  ];
  @Input()
  public items: Diccionario[] = [];
  @Output()
    public event = new EventEmitter();
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
     /* let nombreDiccionario : any[] = JSON.parse(JSON.stringify(dato.result));
      nombreDiccionario.forEach(elemento => this.dataSourceDicc.push(elemento));
      console.log(this.dataSourceDicc);
      this.cmbDiccionario.caption = "nombre";
      this.cmbDiccionario.items = this.getDiccionario();
      console.log("xxxxxxxxxxxxxxxxxxx" + this.cmbDiccionario.value);
*/
      
    });


    
  }

  public changed(obj : Diccionario){
    this.infoService.cast.subscribe(info => {console.log(info); this.info = info});
    console.log("CAMBIE",this.selectedValue.nombre);
    console.log('select',this.selectedValue);
    this.event.emit(this.selectedValue);

  }
  public title = 'ckeditor';
  ckeditorContent: string = `Lorem ipsum dolor sit amet, <p>consectetur</p> adipiscing elit. Fusce arcu arcu, tincidunt sed augue et, ultrices laoreet odio. Aliquam suscipit in sem ac sodales. Nullam vel tortor dapibus nibh pulvinar eleifend nec nec lacus. Suspendisse eget metus vitae nulla dictum maximus. Fusce mollis lectus nibh, nec porttitor lectus consectetur dictum. Nam dignissim odio tortor, sed congue elit faucibus eu. Sed egestas efficitur mauris non feugiat.
    Nulla facilisi. Fusce quis bibendum erat. Vestibulum tincidunt odio nec erat scelerisque hendrerit. Pellentesque finibus dolor non ligula condimentum varius. Suspendisse vitae sagittis magna. Maecenas est mauris, congue ornare purus facilisis, pharetra gravida dui. Aliquam erat volutpat. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Cras porta sem ipsum, non rutrum massa commodo ut. `;
  public contenido: string = this.ckeditorContent;   //TODO
  private nombreNotificacion: string;
  ckeditorContent2: string = `TEST`;
  @ViewChild('ckEditorSMS') ckEditorSMS;
  @ViewChild('ckEditorMAIL') ckEditorMAIL = new CKEditorComponent(this.zone);

  //@ViewChild('diccionarioDatos') cmbDiccionario: LsComboBoxComponent = new LsComboBoxComponent(this.elementref);
  @ViewChild('canalMultiva') cmbCanalMultiva: LsComboBoxComponent = new LsComboBoxComponent(this.elementref);
  public datosGenerales: DatosGenerales = {
    NombreNotificacion: "NombreNotificacion",
    DicionarioDatos: "DicionarioDatos",
    CanalMultiva: "CanalMultiva"
  };

  

  public constructor(private data: DataService, private zone: NgZone,protected elementref:ElementRef, private infoService: InfoService) {
    this.ckEditorSMS = new CKEditorComponent(this.zone);

  }
ngAfterViewInit(): void {
 
  
}
  

  getDiccionario(): Diccionario[] {
    return this.datosDiccionario;
  }

  previsualizar() {
    alert('test');
  }
 

  
}


export interface DatosGenerales {
  NombreNotificacion: string,
  DicionarioDatos: string,
  CanalMultiva: string
}




export interface Diccionario{
  "nombre": string,
  "descripcion": string
}