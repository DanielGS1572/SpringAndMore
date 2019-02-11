import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NgStyleComponent } from './componentes/ng-style/ng-style.component';
import { CssComponent } from './componentes/css/css.component';
import { ClasesComponent } from './componentes/clases/clases.component';
import { ResaltadoDirective } from './directive/resaltado.directive';
import { NgSwitchComponent } from './componentes/ng-switch/ng-switch.component';
import { HomeComponent } from './componentes/home/home.component';
import { APP_ROUTING } from './app.routes';
import { UsuarioComponent } from './componentes/usuario/usuario.component';
import { UsuarioNuevoComponent } from './componentes/usuario/usuario-nuevo.component';
import { UsuarioEditarComponent } from './componentes/usuario/usuario-editar.component';
import { UsuarioDetalleComponent } from './componentes/usuario/usuario-detalle.component';
import { NavbarComponent } from './componentes/navbar/navbar.component';

@NgModule({
  declarations: [
    AppComponent,
    NgStyleComponent,
    CssComponent,
    ClasesComponent,
    ResaltadoDirective,
    NgSwitchComponent,
    HomeComponent,
    UsuarioComponent,
    UsuarioNuevoComponent,
    UsuarioEditarComponent,
    UsuarioDetalleComponent,
    NavbarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    APP_ROUTING
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
