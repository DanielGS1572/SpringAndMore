export class Person {

  constructor(public id?: number,
              public name?: string,
              public lastName?: string,
              public rfc?: string,
              public email?: string,
              public telephone?: number) {
  }


}

export const PERSONS: Person[] = [
  {id: 1, name:'Felipe', lastName:'Pérez', rfc:'PEMF900204', email: 'lego@lego', telephone: 1111},
  {id: 2, name:'Daniel', lastName:'Gonzalí', rfc:'PEMF900204', email: 'lego@lego', telephone: 1111},
  {id: 3, name:'Hector', lastName:'Sosa', rfc:'PEMF900204', email: 'lego@lego', telephone: 1111},
  {id: 4, name:'Carlos', lastName:'de la Teja', rfc:'PEMF900204', email: 'lego@lego', telephone: 1111},
  {id: 5, name:'Ricardo', lastName:'Negrete', rfc:'PEMF900204', email: 'lego@lego', telephone: 1111}
];








