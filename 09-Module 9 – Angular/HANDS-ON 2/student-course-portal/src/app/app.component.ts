import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [FormsModule],   // <-- important for ngModel
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  studentName: string = 'Janavika';
  message: string = '';

  showMessage() {
    this.message = 'Button clicked!';
  }
}
