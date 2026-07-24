import { Routes } from '@angular/router';
import { DashboardComponent } from './dashboard/dashboard';
import { ProfileComponent } from './dashboard/profile/profile';
import { SettingsComponent } from './dashboard/settings/settings';

export const routes: Routes = [
  {
    path: 'dashboard',
    component: DashboardComponent,
    children: [
      { path: 'profile', component: ProfileComponent },
      { path: 'settings', component: SettingsComponent }
    ]
  },
  { path: '', redirectTo: '/dashboard/profile', pathMatch: 'full' }
];
