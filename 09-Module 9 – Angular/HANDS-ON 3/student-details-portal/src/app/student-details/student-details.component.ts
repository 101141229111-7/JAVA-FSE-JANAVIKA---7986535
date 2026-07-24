import { Component, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-student-details',
  standalone: true,
  templateUrl: './student-details.component.html',
  styleUrls: ['./student-details.css']
})
export class StudentDetailsComponent {
  @Input() studentName: string = '';
  @Output() notifyParent = new EventEmitter<string>();

  sendMessage() {
    this.notifyParent.emit(`Hello from ${this.studentName}!`);
  }
}
