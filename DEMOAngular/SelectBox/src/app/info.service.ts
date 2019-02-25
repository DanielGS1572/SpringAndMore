import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class InfoService {
  private data = new BehaviorSubject<Array<string>>([]);
  cast = this.data.asObservable();
  constructor() { }

  editInfo(args:string[]){
    this.data.next(args);
  }
}
