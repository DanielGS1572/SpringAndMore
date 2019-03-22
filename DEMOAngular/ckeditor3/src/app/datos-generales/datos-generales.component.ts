import { Component,  ViewChild, AfterViewInit, OnInit } from '@angular/core';
  import { FormsModule } from '@angular/forms';
  import { CKEditorComponent } from 'ng2-ckeditor';
import {  DataService } from '../service/data.service';
import { LsComboBoxComponent } from '../ls-combobox/ls-combobox.component';

@Component({
  selector: 'app-datos-generales',
  templateUrl: './datos-generales.component.html',
  styleUrls: ['./datos-generales.component.css']
})
export class DatosGeneralesComponent implements OnInit {
  ngOnInit(): void {

    this.cmbDiccionario.caption = 'name';
    this.getPersons().forEach(o => {//TODO reemplazar por un servicio
			this.cmbDiccionario.items.push(o);
    });
    
    this.cmbCanalMultiva.caption = 'name';
    this.getPersons().forEach(o => {//TODO reemplazar por un servicio
			this.cmbCanalMultiva.items.push(o);
    });
  }
  
  

    public title = 'ckeditor';
    ckeditorContent:string= `Lorem ipsum dolor sit amet, <p>consectetur</p> adipiscing elit. Fusce arcu arcu, tincidunt sed augue et, ultrices laoreet odio. Aliquam suscipit in sem ac sodales. Nullam vel tortor dapibus nibh pulvinar eleifend nec nec lacus. Suspendisse eget metus vitae nulla dictum maximus. Fusce mollis lectus nibh, nec porttitor lectus consectetur dictum. Nam dignissim odio tortor, sed congue elit faucibus eu. Sed egestas efficitur mauris non feugiat.
    Nulla facilisi. Fusce quis bibendum erat. Vestibulum tincidunt odio nec erat scelerisque hendrerit. Pellentesque finibus dolor non ligula condimentum varius. Suspendisse vitae sagittis magna. Maecenas est mauris, congue ornare purus facilisis, pharetra gravida dui. Aliquam erat volutpat. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Cras porta sem ipsum, non rutrum massa commodo ut. `;
    public contenido: string = this.ckeditorContent;   //TODO
    private nombreNotificacion:string;
    ckeditorContent2:string= `TEST`;
    @ViewChild(CKEditorComponent) ckEditor: CKEditorComponent;

    @ViewChild('diccionarioDatos') cmbDiccionario: LsComboBoxComponent = new LsComboBoxComponent();
    @ViewChild('canalMultiva') cmbCanalMultiva: LsComboBoxComponent = new LsComboBoxComponent();

    public constructor(private data:DataService ){
     
    }

    ngAfterViewChecked(){
       console.log("datos generales");
      let editor = this.ckEditor.instance;
      editor.config.height = '400';
      editor.config.toolbarGroups = [
        /*{ name:'document', groups: ['mode', 'document', 'doctools']},
        { name:'clipboard', groups: ['clipboard','undo']},
        { name:'editing', groups: ['find','selection','spellchecker','editing']},
        { name:'paragraph', groups: ['list','indent','blocks','align','bidi','paragraph']},
        */{ name:'insert', groups: [/*'insert',*/'diccionario','valida']}
      ]
      //editor.config.extraPlugins = 'timestamp'
      editor.config.extraPlugins = 'diccionario,valida';
      
      editor.config.removeButton = 'Source, Save, Templates, Find, Replace, Scayt, SelectAll, Form, Radio';
      this.data.getData(editor.getData());
      //this.data.getNombreTemplate(this.nombreNotificacion);


    }

    getPersons(): Person[]{//TODO reemplazar por un servicio
      console.log("Obteniendo Personas");
      return PERSONS;
    }

    previsualizar(){
      alert('test');
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