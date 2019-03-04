import { Routes } from '@angular/router';

import { UsuarionNuevoComponent } from "./usuarion-nuevo.component";
import { UsuarioDetalleComponent } from "./usuario-detalle.component";
import { UsuarioEditarComponent } from "./usuario-editar.component";

export const USUARIO_ROUTES = [
    { path: 'nuevo', component: UsuarionNuevoComponent },
    { path: 'detalle', component: UsuarioDetalleComponent },
    { path: 'editar', component: UsuarioEditarComponent },
    { path: '**', pathMatch: 'full', redirectTo: "nuevo" }
]