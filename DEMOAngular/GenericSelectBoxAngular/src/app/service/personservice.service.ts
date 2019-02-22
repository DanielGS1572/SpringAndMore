import { Injectable } from '@angular/core';
import {Person, PERSONS} from "../classes/person";

@Injectable({
  providedIn: 'root'
})
export class PersonserviceService {

  constructor() {


  }
  getPersons(): Person[]{
    return PERSONS;
  }
}
