"use strict";
var mensaje = "hola";
if (true) {
    var mensaje = "adios";
}
console.log(mensaje); //con var no respeta el scope de la variable y toma el último valor que se le fue asignado
//pero con let respeta el scope (esto es codigo de ES6 --> ES6 es ES2015)
var texto = "hola";
if (true) {
    var texto_1 = "adios";
}
console.log(texto);
var nombre = "Peter"; //Solo permitirá datos de tipo texto
var apellido = "Gonzalí";
var numero = 12.1;
var booleano = true;
var hoy = new Date();
hoy = new Date('2019-01-01');
var cualquiera; //acepta cualquier tipo de dato
cualquiera = nombre;
cualquiera = apellido;
cualquiera = booleano;
cualquiera = hoy;
var spiderman = {
    nombre: "Peter",
    edad: 20
};
spiderman = {
    nombre: "Daniel",
    edad: 20,
};
//Template literal
var nombre2 = "Juan";
var apellido2 = "Perez";
var edad2 = 32;
var texto1 = "Hola, " + nombre2 + " " + apellido2 + "(" + edad2 + ")";
var texto2 = "Hola, " + nombre2 + " " + apellido2 + " (" + edad2 + ") - texto de nombre " + getNombre(); //Template literal - se usan backticks - esto es de typescript
//lo que esta dentro de { } es codigo de javascript
console.log(texto1);
console.log(texto2);
function getNombre() {
    return "texto de nombre";
}
