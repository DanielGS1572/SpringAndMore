import { Component } from '@angular/core';
import { EmployeeService } from './employee.service';

@Component({
  selector: 'app-root',
  template: `
    <h2>Employee list</h2>
    <ul *ngFor = "let emp of employees">
        <li>{{emp.name}}</li>
    </ul>
    <app-employee-detail></app-employee-detail>
  `,
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'services';
  public employees = [];
  constructor(private _employeeService : EmployeeService){

  }
  ngOnInit(){
      this.employees = this._employeeService.getEmployees();
  }
  
}
