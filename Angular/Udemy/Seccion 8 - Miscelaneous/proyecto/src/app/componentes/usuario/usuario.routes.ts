import {  Routes } from '@angular/router';

import { UsuarioNuevoComponent } from './usuario-nuevo.component';
import { UsuarioEditarComponent } from './usuario-editar.component';
import { UsuarioDetalleComponent } from './usuario-detalle.component';
//este archivo es para darle mantenimiento a las rutas hijas
export const USUARIO_ROUTES: Routes = [
    { path: 'nuevo', component: UsuarioNuevoComponent },          //el path es lo que le sigue a usuario/id/[path]
            { path: 'editar', component: UsuarioEditarComponent },
            { path: 'detalle', component: UsuarioDetalleComponent },
            { path: '**', pathMatch: 'full', redirectTo: 'nuevo' }         //carga "nuevo" cuando le den a usuario
        
];
