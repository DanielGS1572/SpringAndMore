import { Component } from '@angular/core';


@Component({
    selector: 'app-header', //se usa la palabra app para indicar que es algo personalizado
    templateUrl: './header.component.html' 
})
export class HeaderComponent{                   //el export es para que pueda ser usado por fuera, en este caso en app.modules para darlo de alta

}