"use strict";
var Avenger = /** @class */ (function () {
    function Avenger(nombre, equipo, nombreReal, puedePelear, peleasGanadas) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.nombreReal = nombreReal;
        this.puedePelear = puedePelear;
        this.peleasGanadas = peleasGanadas;
    }
    return Avenger;
}());
var antman = new Avenger("Antman", "equipo", "nombre real", true, 8);
console.log(antman);
