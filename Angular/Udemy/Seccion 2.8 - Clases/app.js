// Ver sección 2 - lecture 24 - Exportación/importación de clases
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var Avenger = /** @class */ (function () {
    function Avenger(nombre, equipo, nombreReal, puedePelear, peleasGanadas) {
        this.nombre = ""; //Si no se tiene el constructor manda error, pero si se inicializan ya no hay problema
        this.equipo = "equipo";
        this.nombreReal = "nr";
        this.puedePelear = false;
        this.peleasGanadas = 0;
        this.nombre = nombre;
        this.equipo = equipo;
        this.nombreReal = nombreReal;
        this.puedePelear = puedePelear;
        this.peleasGanadas = peleasGanadas;
    }
    return Avenger;
}());
var antman = new Avenger("Antman", "equipo", "nombre real", true); //Para 
console.log(antman);
var VillanoUno = /** @class */ (function () {
    function VillanoUno(nombre) {
        this.nombre = nombre;
    }
    return VillanoUno;
}());
//Este codigo es lo mismo que el anterior, en lugar de hacer el seteo, simplemente se pone public y ya es como el código anterior
var VillanoDos = /** @class */ (function () {
    function VillanoDos(nombre) {
        this.nombre = nombre;
    }
    return VillanoDos;
}());
//              DECORADORES
//                  Un decorador es una simple función cualquiera que le pasa como parametro el constructor
function consola(constructor) {
    console.log(constructor);
}
var Villano = /** @class */ (function () {
    function Villano(nombre) {
        this.nombre = nombre;
    }
    Villano = __decorate([
        consola
    ], Villano);
    return Villano;
}());
