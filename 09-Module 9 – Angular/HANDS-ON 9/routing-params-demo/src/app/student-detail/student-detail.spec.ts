import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StudentDetail } from './student-detail';

describe('StudentDetail', () => {
  let component: StudentDetail;
  let fixture: ComponentFixture<StudentDetail>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [StudentDetail],
    }).compileComponents();

    fixture = TestBed.createComponent(StudentDetail);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
