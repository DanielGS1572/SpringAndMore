import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CalculoRenderer2Component } from './calculo-renderer2.component';

describe('CalculoRenderer2Component', () => {
  let component: CalculoRenderer2Component;
  let fixture: ComponentFixture<CalculoRenderer2Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CalculoRenderer2Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CalculoRenderer2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
