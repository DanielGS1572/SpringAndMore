import {Component, OnInit, Renderer2, ViewChild} from '@angular/core';

@Component({
  selector: 'app-calculo-renderer2',
  templateUrl: './calculo-renderer2.component.html',
  styleUrls: ['./calculo-renderer2.component.css']
})
export class CalculoRenderer2Component implements OnInit {

  @ViewChild('monto') monto;
  @ViewChild('iva') iva;
  @ViewChild('montoIva') montoIva;
  @ViewChild('total') total;

  constructor(private renderer: Renderer2) { }

  ngOnInit() {
    this.listeners();
  }

  listeners(){
    let listMonto = this.renderer.listen(this.monto.nativeElement, 'keydown.enter', (evt) => {
      if(this.iva.nativeElement.value !== undefined && this.iva.nativeElement.value !== '')
        this.calculo();
    });

    let listIva = this.renderer.listen(this.iva.nativeElement, 'keydown.enter', (evt) => {
      if(this.monto.nativeElement.value !== undefined && this.monto.nativeElement.value !== '')
        this.calculo();
    });
  }

  calculo(){
    let i = this.iva.nativeElement.value / 100;
    this.montoIva.nativeElement.value = i * this.monto.nativeElement.value;
    this.total.nativeElement.value = parseInt(this.montoIva.nativeElement.value) +
      parseInt(this.monto.nativeElement.value);
  }

}
