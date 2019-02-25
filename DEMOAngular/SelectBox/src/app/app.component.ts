import { Component, OnInit } from '@angular/core';
import { InfoService } from './info.service';
import { elementHostAttrs } from '@angular/core/src/render3';

/** @title Select with 2-way value binding */
@Component({
  selector: 'app-component',
  templateUrl: 'app.component.html',
  styleUrls: ['app.component.css'],
})

export class AppComponent implements OnInit {
  modelo_title;
  modeloTitleList = [];
  info: string[];
  marca_level: string;
  elementos;
  constructor(private infoService: InfoService) {

  }

  ngOnInit(): void {
    this.infoService.cast.subscribe(info => this.info = info);
  }

  marcaList: any = [
    {
      'marca': 'Chevrolet',
      modeloTitleList: [
        'Aveo', 'Camaro', 'Captiva', 'Cruze', 'Malibu', 'Trax'
      ]
    },
    {
      'marca': 'Ferrari',
      modeloTitleList: [
        '488 GTB', 'California T', 'Portofino', 'Purosangue'
      ]
    },
    {
      'marca': 'BMW',
      modeloTitleList: [
        'Serie 1', 'Serie 2', 'Serie 3', 'Serie 4'
      ]
    }
  ];




  educationLevelChangeAction(marca) {
    this.modelo_title = "";
    let dropDownData = this.marcaList.find((data: any) => data.marca === marca);
    if (dropDownData) {
      this.modeloTitleList = dropDownData.modeloTitleList;


    } else {
      this.modeloTitleList = [];
    }
    this.changed();

  }
  changed() {
    this.elementos = new Array();
    this.elementos.push(this.marca_level, this.modelo_title);
    console.log("changed");
    this.infoService.editInfo(this.elementos);
  }


}