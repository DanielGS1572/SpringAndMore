import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class TableDataService {
  private data = new BehaviorSubject<any[]>([]);
  cast = this.data.asObservable();
  constructor() { }

  editInfo(args: any[]) {
    this.data.next(args);
  }
}
