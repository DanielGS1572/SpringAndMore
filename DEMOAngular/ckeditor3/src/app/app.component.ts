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
  ckeditorContent:string= `Lorem ipsum dolor sit amet, <p>consectetur</p> adipiscing elit. Fusce arcu arcu, tincidunt sed augue et, ultrices laoreet odio. Aliquam suscipit in sem ac sodales. Nullam vel tortor dapibus nibh pulvinar eleifend nec nec lacus. Suspendisse eget metus vitae nulla dictum maximus. Fusce mollis lectus nibh, nec porttitor lectus consectetur dictum. Nam dignissim odio tortor, sed congue elit faucibus eu. Sed egestas efficitur mauris non feugiat.

  Nulla facilisi. Fusce quis bibendum erat. Vestibulum tincidunt odio nec erat scelerisque hendrerit. Pellentesque finibus dolor non ligula condimentum varius. Suspendisse vitae sagittis magna. Maecenas est mauris, congue ornare purus facilisis, pharetra gravida dui. Aliquam erat volutpat. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Cras porta sem ipsum, non rutrum massa commodo ut. `
  @ViewChild(CKEditorComponent) ckEditor: CKEditorComponent;

  ngAfterViewChecked(){
    let editor = this.ckEditor.instance;
    editor.config.height = '400';
    editor.config.toolbarGroups = [
      /**/{ name:'document', groups: ['mode', 'document', 'doctools']},
      { name:'clipboard', groups: ['clipboard','undo']},
      { name:'editing', groups: ['find','selection','spellchecker','editing']},
      { name:'paragraph', groups: ['list','indent','blocks','align','bidi','paragraph']},
      { name:'insert', groups: ['insert','diccionario','valida']}
    ]
    //editor.config.extraPlugins = 'timestamp'
    editor.config.extraPlugins = 'diccionario,valida';
    
    editor.config.removeButton = 'Source, Save, Templates, Find, Replace, Scayt, SelectAll, Form, Radio';
  }
}
