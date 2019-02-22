import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CalculoRxjsComponent } from './calculo-rxjs.component';

describe('CalculoRxjsComponent', () => {
  let component: CalculoRxjsComponent;
  let fixture: ComponentFixture<CalculoRxjsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CalculoRxjsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CalculoRxjsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
