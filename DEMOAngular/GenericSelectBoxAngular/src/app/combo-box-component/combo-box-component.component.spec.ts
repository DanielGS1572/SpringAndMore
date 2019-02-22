import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ComboBoxComponentComponent } from './combo-box-component.component';

describe('ComboBoxComponentComponent', () => {
  let component: ComboBoxComponentComponent;
  let fixture: ComponentFixture<ComboBoxComponentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ComboBoxComponentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ComboBoxComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
