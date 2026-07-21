import { Component, OnInit } from '@angular/core';
import { ReactiveFormsModule, FormBuilder, Validators, FormGroup } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [ReactiveFormsModule, CommonModule],
  templateUrl: './app.html',
  styleUrls: ['./app.css']
})
export class AppComponent implements OnInit {
  studentForm!: FormGroup;

  constructor(private fb: FormBuilder) {}

  ngOnInit() {
    this.studentForm = this.fb.group({
      name: ['', [Validators.required, Validators.minLength(3)]],
      email: ['', [Validators.required, Validators.email]],
      age: [null, [Validators.required, Validators.min(18)]]
    });
  }

  onSubmit() {
    if (this.studentForm.valid) {
      alert(`Form submitted!\n${JSON.stringify(this.studentForm.value, null, 2)}`);
    } else {
      alert('Please fill all fields correctly before submitting.');
    }
  }
}
