var mensaje = "hola"; //forma en la que se declaran variables noralmente en javascript
var mensaje2 = "hola2"; //let es typescript y respeta el scope
var OPCIONES = "todas"; //las constantes deben ser inicializadas cuan
if (true) {
    var mensaje = "adios";
    var mensaje2_1 = "adios2";
    var OPCIONES_1 = "todas2";
}
console.log(mensaje);
console.log(mensaje2);
console.log(OPCIONES); //Fuera del scope se comporta como las variables tipo LET
