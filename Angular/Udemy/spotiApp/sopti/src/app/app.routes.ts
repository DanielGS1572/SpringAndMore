import { HomeComponent } from './components/home/home.component';
import { Routes } from '@angular/router';
import { SearchComponent } from './components/search/search.component';

export const ROUTES: Routes = [
    {path: 'home', component: HomeComponent},
    {path: 'search', component: SearchComponent},
    {path: '', pathMatch: 'full', redirectTo:'home'},           /**el path vacio es al que entra cuando se usa <router-outlet> */
    {path: '**', component: HomeComponent}



]