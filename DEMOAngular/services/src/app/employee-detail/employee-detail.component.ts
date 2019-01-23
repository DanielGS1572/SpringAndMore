import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-employee-detail',
  template: `
    <h2>Employee Detail</h2>
    
    <ul *ngFor="let employee of employees">
      <li>{{employee.id}}. {{employee.name}} - {{employee.age}}</li>
    </ul>

    <h2>Employee From service</h2>
    <h3>{{errorMsg}}</h3>
    <ul *ngFor="let employee2 of employeesFromService">
      <li>{{employee2.id}}. {{employee2.name}} - {{employee2.age}}</li>
    </ul>
  `,
  styleUrls: ['./employee-detail.component.css']
})
export class EmployeeDetailComponent implements OnInit {
  public employees = [];
  public employeesFromService = [];
  public errorMsg;
  constructor(private _employeeService : EmployeeService) { }

  ngOnInit() {
    this.employees = this._employeeService.getEmployees();
    this._employeeService.getEmployeesFromServer().subscribe(data => this.employeesFromService = data,
                                                              error => this.errorMsg = error) ;
  }

}
