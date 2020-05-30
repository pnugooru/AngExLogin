import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MFATokenComponent } from './mfa-token.component';

describe('MFATokenComponent', () => {
  let component: MFATokenComponent;
  let fixture: ComponentFixture<MFATokenComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MFATokenComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MFATokenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
