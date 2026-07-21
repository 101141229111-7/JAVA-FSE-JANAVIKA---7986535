import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [FormsModule, CommonModule],
  templateUrl: './app.html',
  styleUrls: ['./app.css']
})
export class AppComponent {
  student = {
    name: '',
    email: '',
    age: null
  };

  onSubmit() {
    alert(`Form submitted!\nName: ${this.student.name}\nEmail: ${this.student.email}\nAge: ${this.student.age}`);
  }
}
