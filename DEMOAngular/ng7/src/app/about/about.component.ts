import { Component, OnInit } from '@angular/core';
import {DataService} from '../data.service';
@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrls: ['./about.component.scss']
})
export class AboutComponent implements OnInit {

  users: Object;

  constructor(private data: DataService) { }     //para utilizar los servicios se usa Dependeny Injection en el constructor

  ngOnInit() {        //Este metodo se ejecuta cuando cargue el componente
    this.data.getUsers().subscribe(data =>{
      this.users = data;
      console.log(this.users);
    })
  }
 
}
