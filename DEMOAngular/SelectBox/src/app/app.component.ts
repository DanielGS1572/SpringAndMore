import { Component } from '@angular/core';

/** @title Select with 2-way value binding */
@Component({
  selector: 'app-component',
  templateUrl: 'app.component.html',
  styleUrls: ['app.component.css'],
})

export class AppComponent {
  marca_level;
  modelo_title;
  modeloTitleList = [];




  marcaList: any = [
    {
      'marca': 'Chevrolet',
      modeloTitleList: [
        'Aveo','Camaro','Captiva','Cruze','Malibu','Trax'
      ]
    },
    {
      'marca': 'Ferrari',
      modeloTitleList: [
        '488 GTB', 'California T','Portofino','Purosangue'
      ]
    },
    {
      'marca': 'BMW',
      modeloTitleList: [
        'Serie 1', 'Serie 2','Serie 3','Serie 4'
      ]
    }
  ];


  

  educationLevelChangeAction(marca) {
    this.modelo_title="";
    let dropDownData = this.marcaList.find((data: any) => data.marca === marca);
    if (dropDownData) {
      this.modeloTitleList = dropDownData.modeloTitleList;
      if(this.modeloTitleList){
        this.modelo_title=this.modeloTitleList[0];
      }
      
    } else {
      this.modeloTitleList = [];
    }

  }


}