import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-student-detail',
  standalone: true,
  templateUrl: './student-detail.html',
  styleUrls: ['./student-detail.css']
})
export class StudentDetailComponent {
  studentId: string | null = null;

  constructor(private route: ActivatedRoute) {
    this.studentId = this.route.snapshot.paramMap.get('id');
  }
}
