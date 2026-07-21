import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { StudentDetailsComponent } from './student-details/student-details.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [FormsModule, StudentDetailsComponent],
  templateUrl: './app.html',
  styleUrls: ['./app.css']
})
export class AppComponent {
  studentName: string = 'Janavika';
  messageFromChild: string = '';

  handleNotification(msg: string) {
    this.messageFromChild = msg;
  }
}
