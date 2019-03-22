import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, Subject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DataService {
  observable: Observable<any>;
  private observableSubject = new Subject<any>();
  private prefix : string = `
  <html>
    <head>
      <meta charset="UTF-8">
    </head>
    
    <body>
  `;
  private sufix : string =  ` 
    </body>
  </html>`;

  url: String = "http://localhost:8080/o/lskit-osgi-documents-rest/documentosRest";
  constructor(private http: HttpClient) {
    this.observable = this.observableSubject.asObservable();
  }

  getDiccionario() {
    return this.http.get('https://reqres.in/api/users');
  }

  mergeTemplate(data) {
    return this.http.post(this.url + "/mergeTemplate", data);
  }

  getData(data){
    data = this.prefix + data + this.sufix;
    console.log(data);
    this.observableSubject.next(btoa(data));
  }
/*
  getNombreTemplate(data){
    this.observableSubject.next(data);
  }*/

}
