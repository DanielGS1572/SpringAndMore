import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CheckBoxComponentComponent } from './check-box-component.component';

describe('CheckBoxComponentComponent', () => {
  let component: CheckBoxComponentComponent;
  let fixture: ComponentFixture<CheckBoxComponentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CheckBoxComponentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CheckBoxComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
