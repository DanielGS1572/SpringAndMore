import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-nav',
  templateUrl: './nav.component.html',
  styleUrls: ['./nav.component.sass']
})
export class NavComponent implements OnInit {

  appTitle: string = 'ms'; //1618

  constructor() { }

  ngOnInit() {
  }

}
