import { Routes } from '@angular/router';
import { StudentComponent } from './student/student';
import { StudentDetailComponent } from './student-detail/student-detail';

export const routes: Routes = [
  { path: '', component: StudentComponent },
  { path: 'student/:id', component: StudentDetailComponent }
];
