import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';   // ✅ Import CommonModule
import { FormsModule } from '@angular/forms';     // ✅ Needed for [(ngModel)]
import { HighlightDirective } from './highlight.directive'; // ✅ Your custom directive

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, FormsModule, HighlightDirective], // ✅ Add here
  templateUrl: './app.html',
  styleUrls: ['./app.css']
})
export class AppComponent {
  students = ['Janavika', 'Ravi', 'Priya', 'Kumar'];
  isHighlighted = false;

  toggleHighlight() {
    this.isHighlighted = !this.isHighlighted;
  }
}
