var Avenger = /** @class */ (function () {
    function Avenger(nombre, puedePelear) {
        this.nombre = "Nombre Default";
        this.nombre = nombre;
        this.puedePelear = puedePelear;
    }
    return Avenger;
}());
var avenger = new Avenger("nombre", true);
console.log(avenger);
