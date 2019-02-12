import { Component, ViewChild } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CKEditorComponent } from 'ng2-ckeditor';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'ckeditor';
  ckeditorContent:string="<b>probando contenido</b>";
  @ViewChild(CKEditorComponent) ckEditor: CKEditorComponent;

  ngAfterViewChecked(){
    let editor = this.ckEditor.instance;
    editor.config.height = '400';
    editor.config.toolbarGroups = [
      /*{ name:'document', groups: ['mode', 'document', 'doctools']},
      { name:'clipboard', groups: ['clipboard','undo']},
      { name:'editing', groups: ['find','selection','spellchecker','editing']},
      { name:'paragraph', groups: ['list','indent','blocks','align','bidi','paragraph']},*/
      { name:'insert', groups: ['insert','timestamp']}
    ]
    //editor.config.extraPlugins = 'timestamp'
    editor.config.extraPlugins = 'timestamp';
    editor.config.removeButton = 'Source, Save, Templates, Find, Replace, Scayt, SelectAll, Form, Radio';
  }
}
