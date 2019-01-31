"use strict";
//Destructuración de objetos
//La destructuración es asignar en variables las propiedades de los objetos
var avenger = {
    nombre: "Steve",
    clave: "Capitan america",
    poder: "Droga"
};
//la destructuración de un objeto va entre {}, la de un arreglo va entre []
var aliasVariable = avenger.poder, nombre = avenger.nombre, clave = avenger.clave; //no se pone el tipo de dato si no que despues de los dos puntos va un alias 
//(le asigna el tipo de dato automaticamente)
//lo anterior es como se hiciera lo siguiente
//let nombre = avenger.nombre;      
//let poder = avenger.poder;
//let clave = avenger.clave;
console.log(aliasVariable, nombre, clave);
var avengers = ["Thor", "Steve", "Tony"];
var thor = avengers[0], capi = avengers[1], ironman = avengers[2];
console.log(thor, capi, ironman);
