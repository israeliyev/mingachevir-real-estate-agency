import { Routes } from '@angular/router';
import {AppComponent} from './app.component';
import {HousesComponent} from './houses/houses.component';

export const routes: Routes = [
  {
    path: '',
    component: AppComponent,
    pathMatch: 'full',
  },
  {
    path: 'houses',
    component: HousesComponent,
    pathMatch: 'full',
  }
];
