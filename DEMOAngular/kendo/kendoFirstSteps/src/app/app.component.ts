import { Component } from '@angular/core';
export interface Food {
  value: string;
  viewValue: string;
}

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})


export class AppComponent {
  
  title = 'kendoFirstSteps';
  data: Array<any> = [
    {
      text:'Fun'
    },{
      text:'Funner'
    },{
      text:'Funnest'
    }
  ];

  public data2: any[] = [
    {
      text: 'Furniture', items: [
        { text: 'Tables & Chairs' },
        { text: 'Sofas' },
        {
          text: 'Occasional Furniture', items: [{
            text: 'Decor', items: [
              { text: 'Bed Linen' },
              { text: 'Curtains & Blinds' }
            ]
          }]
        }
      ]
    },
    { text: 'Decor' },
    { text: 'Outdoors' }
];
public foods: Food[] = [
  {value: 'steak-0', viewValue: 'Steak'},
  {value: 'pizza-1', viewValue: 'Pizza'},
  {value: 'tacos-2', viewValue: 'Tacos'}
];

public listItems: Array<string> = ["Baseball", "Basketball", "Cricket", "Field Hockey", "Football", "Table Tennis", "Tennis", "Volleyball"];

  public onButtonItemClick(dataItem: any): void{
    console.log(`You choose ${dataItem.text}`);
  }
}
