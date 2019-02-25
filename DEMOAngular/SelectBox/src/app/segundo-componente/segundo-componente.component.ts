import { Component, OnInit } from '@angular/core';
import { InfoService } from '../info.service';

@Component({
  selector: 'app-segundo-componente',
  templateUrl: './segundo-componente.component.html',
  styleUrls: ['./segundo-componente.component.css']
})
export class SegundoComponenteComponent implements OnInit {
  info:string[];

  constructor(private infoService:InfoService){

  }
  
 ngOnInit(): void {
  this.infoService.cast.subscribe(info => this.info = info);
}

}
