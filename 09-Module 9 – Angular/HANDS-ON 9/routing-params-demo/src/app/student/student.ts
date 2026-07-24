import { Component } from '@angular/core';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-student',
  standalone: true,
  imports: [RouterLink],   // 👈 needed for [routerLink] in template
  templateUrl: './student.html',
  styleUrls: ['./student.css']
})
export class StudentComponent {}
