import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { IEmployee } from './employee';
import { Observable } from 'rxjs';
import { throwError } from 'rxjs';
import { catchError } from 'rxjs/operators';


@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  private _url: string = "/assets/data/employees2.json";          //--> /assets/data/employees2.json"
  constructor(private http: HttpClient) { }

getEmployeesFromServer(): Observable<IEmployee[]>{
  return this.http.get<IEmployee[]>(this._url).pipe(catchError(this.errorHandler));
}

  getEmployees(){
    return [
      {"id":1, "name":"Andrew","age":30},
      {"id":2, "name":"Brandon","age":30},
      {"id":3, "name":"Christina","age":30},
      {"id":4, "name":"Elena","age":30},
  
    ];
  }

  errorHandler(error:HttpErrorResponse){
    return throwError(error.message || "Server error");
  }
}
