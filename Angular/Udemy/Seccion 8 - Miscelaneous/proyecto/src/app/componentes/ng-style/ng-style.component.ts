import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-style',
  template: `
    <p [ngStyle]="{'font-size.px':tamano, 'color':'red'}">    <!--tambien puede ser [style.fontSize.px]-->
      ng-style works!
    </p>

    <button class="btn btn-primary separacion" (click)="tamano = tamano + 5">
        <i class= "fa fa-plus"></i>
    </button>

    <button class="btn btn-primary separacion" (click)="tamano = tamano - 5">
        <i class= "fa fa-minus"></i>
    </button>
  `,
  styles: []
})
export class NgStyleComponent implements OnInit {
  tamano:number=20;
  constructor() { }

  ngOnInit() {
  }

}
