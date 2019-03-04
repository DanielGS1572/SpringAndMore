import { RouterModule, Routes } from "@angular/router";
import { HomeComponent } from "./components/home/home.component";
import { UsuarioComponent } from "./components/usuario/usuario.component";
/*
import { UsuarionNuevoComponent } from "./components/usuario/usuarion-nuevo.component";
import { UsuarioDetalleComponent } from "./components/usuario/usuario-detalle.component";
import { UsuarioEditarComponent } from "./components/usuario/usuario-editar.component";
*/
import { USUARIO_ROUTES } from "./components/usuario/usuario.routes";
const ROUTES_ = [
    { path: "home", component: HomeComponent },
    {
        path: "usuario/:id",
        component: UsuarioComponent,
        children:USUARIO_ROUTES
        /*  [
           { path: 'nuevo', component: UsuarionNuevoComponent },
            { path: 'detalle', component: UsuarioDetalleComponent },
            { path: 'editar', component: UsuarioEditarComponent },
            { path: '**', pathMatch: 'full', redirectTo: "nuevo" }
            
        ]*/
    },
    { path: '**', pathMatch: 'full', redirectTo: "home" }
]

export const ROUTING = RouterModule.forRoot(ROUTES_);