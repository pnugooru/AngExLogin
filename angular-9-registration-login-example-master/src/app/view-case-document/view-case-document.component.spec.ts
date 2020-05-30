import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewCaseDocumentComponent } from './view-case-document.component';

describe('ViewCaseDocumentComponent', () => {
  let component: ViewCaseDocumentComponent;
  let fixture: ComponentFixture<ViewCaseDocumentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ViewCaseDocumentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewCaseDocumentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
