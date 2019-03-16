import { Component } from '@angular/core';
import { FormGroup} from '@angular/forms';

@Component({
  selector: 'app-parametros',
  templateUrl: './parametros.component.html',
  styleUrls: ['./parametros.component.css']
})
export class ParametrosComponent {
  form: FormGroup;
  parametros = [
    {id: 1, name: 'Configurable por usuario final'},
    {id: 2, name: 'Visible por usuario final'},
    {id: 3, name: 'Monto configurable'},
    {id: 4, name: 'Mostrar/Ocultar saldo disponible'},
    {id: 5, name: 'Notificación interna'},
    {id: 6, name: 'Cambia monto'}

  ];
  

  submit() {}
}
