import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { AboutComponent } from './components/about/about.component';
import { HeroesComponent } from './components/heroes/heroes.component';
import { HeroeComponent } from './components/heroe/heroe.component';
import { ResultadosComponent } from './components/resultados/resultados.component';



const ROUTES: Routes = [
  {path:'home', component: HomeComponent},
  {path:'about', component: AboutComponent},  
  {path:'heroes', component: HeroesComponent},   
  {path:'heroe/:id', component: HeroeComponent},   
  {path:'resultados/:termino', component: ResultadosComponent},      
     
  {path: '**',pathMatch:'full', redirectTo:'home'}
];

@NgModule({
  imports: [RouterModule.forRoot(ROUTES/*, {useHash:true} para el routing con hash*/)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
