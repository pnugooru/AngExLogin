import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SetUpMFAComponent } from './set-up-mfa.component';

describe('SetUpMFAComponent', () => {
  let component: SetUpMFAComponent;
  let fixture: ComponentFixture<SetUpMFAComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SetUpMFAComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SetUpMFAComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
