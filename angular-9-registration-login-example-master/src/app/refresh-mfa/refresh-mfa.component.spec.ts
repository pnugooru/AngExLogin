import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RefreshMfaComponent } from './refresh-mfa.component';

describe('RefreshMfaComponent', () => {
  let component: RefreshMfaComponent;
  let fixture: ComponentFixture<RefreshMfaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RefreshMfaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RefreshMfaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
