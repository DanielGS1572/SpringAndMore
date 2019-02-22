import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LSValidatorComponent } from './lsvalidator.component';

describe('LSValidatorComponent', () => {
  let component: LSValidatorComponent;
  let fixture: ComponentFixture<LSValidatorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LSValidatorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LSValidatorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
