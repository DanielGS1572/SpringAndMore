import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  loading:boolean = false;
  title = 'asincrono';

  ejecutarProceso(){
    this.loading = true;
    setTimeout( () => this.loading = false,1000);
  }
}


