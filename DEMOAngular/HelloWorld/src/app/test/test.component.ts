import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `

<!--                                                 DATA BINDING                                                            -->

      <h1>
        Welcome {{name}}                                                 <!-- Interpolation -->
      </h1>

      <h2>{{"Welcome " + name}}</h2>                                     <!-- String concatenation (ver que ya no se usan los dos curly braces -->

      <h2>{{2+2}}</h2>

      <h2>{{name.length}}</h2>                                           <!-- Se puede usar javascript entre los curly braces -->

      <h2>{{name.toUpperCase()}}</h2>                                    <!-- Se puede usar metodos de javascript -->
      
      <h2>{{greetUser()}}</h2>                                           <!-- Se pueden usar metodos definidos -->

      <!--
        NO SE PUEDE:
                <h2>{{a = 2 + 2}}</h2>                                   ...Hacer asignaciones
                <h2>{{window.location.href}}                             ...Acceder a variables globales de javascript como window, screen ... etc
                                                                         ...Lo que se puede hacer es hacer el binding de la clase hacia el template
      -->
      <h2>{{siteUrl}}</h2>



<!--                                                 HTML CLASES                                                             -->

      <h2 class="text-success">Texto 1</h2>                               <!-- De forma directa -->
      <h2 [class]="textSuccess">Texto 2</h2>                              <!-- De forma dinamica con class binding -->
      <!-- 
        NO SE PUEDE:
                <h2 class="text-special" [class]="successClass">Texto 3</h2>      ...No toma el hecho de mezclar class binding con el class normal
      -->
      <h2 [class.text-danger]="hasError">Texto 3</h2>                     <!-- Para aplicar estilo de acuerdo a una bandera -->
      <h2 [ngClass]="messageClasses">Texto 4</h2>                         <!-- Se usa el objeto messageClasses para definir los estilos -->


      <!--                                                 EVENT BINDING                                                            -->
      <button (click)="clicked($event)">Greet1</button>{{greeting1}}                          <!-- Dentro de parentesis se pone la funcion de javascript
                                                                          con $event se obtiene todas las propiedades de los eventos del DOM
                                                                          en javascript sería algo así:
                                                                          document.getElementById("myBtn").addEventListener("click", myFunction);-->
     <button (click)="greeting2='Hello'">Greet2</button>{{greeting2}}

      <br>
      <br>
<!--                                                 TEMPLATE REFERENCE VARIABLES                                                            -->
        <input #myInput type="text">                                        <!-- Template reference variable se asignan con # -->
        <button (click)="logClick(myInput.value)">Log</button>


<!--                                                 STRUCTURAL DIRECTIVES                                                                   -->
        
<!-- ngIf primer caso-->
        <h2 *ngIf="display; else elseBlock">ngIf 1</h2>

        <ng-template #elseBlock>                                            <!-- Para hacer la funcion del else en el if se debe usar ng-template y referenciar en *ngIf-->
          <h2>ngIf 2</h2>
        </ng-template>

<!-- ngIf segundo caso-->

        <div *ngIf="display; then thenSegment; else elseSegment"></div>

        <ng-template #thenSegment>                                          
          <h2>ngIf 2</h2>
        </ng-template>
        
        <ng-template #elseSegment>                                          
          <h2>ngIf 2</h2>
        </ng-template>

<!-- ngSwitch -->
        <div [ngSwitch]="color">
            <div *ngSwitchCase="'red'">Red</div>
            <div *ngSwitchCase="'blue'">Blue</div>
            <div *ngSwitchCase="'green'">Green</div>
            <div *ngSwitchDefault>Pick again</div>
        </div>


<!-- ngFor -->
        <div *ngFor="let color of colors; index as i;first as f">             <!-- first indica con booleano si es el primer elemento o no (first,last, odd, even)-->
              <h2>{{f}} {{i+1}} {{color}}</h2>
        </div>
      `,
  styles: [`
        .text-success{
          color: green;
        }
        .text-danger{
          color: red;
        }
        .text-special{
          font-style: italic;
        }
  `]
})
export class TestComponent implements OnInit {
  name : string = "Daniel";
  public siteUrl = window.location.href;                                  //Si se declara la variable como private no se podrá ver en el template


  public textSuccess = "text-success";                                    //Binding de forma dinamica en HTML <h2 [class]="textSuccess">
  public hasError = true;


  /*Para aplicar varios estilos usando la directiva ng */
  public isSpecial = true;
  public messageClasses = {                                                //Creación del objeto para definir los estilos de Texto 4
    "text-success" : !this.hasError,
    "text-danger" : this.hasError,
    "text-special" : this.isSpecial
  }

  /*Event binding */
  public greeting1 : string = '';
  public greeting2 : string = '';

  /*Structural directives */
  /*ngIf*/
  public display = false;
  /*ngSwitch */
  public color = "na";
  /*ngFor */
  public colors = ["red","blue","green"];


  constructor() { }

  ngOnInit() {
  }

  greetUser(){
    return "Hello " + this.name
  }

  clicked(event){
    console.log(event);
    this.greeting1 = event.type;

  }

  logClick(value){
    window.alert(value);
  }

}
