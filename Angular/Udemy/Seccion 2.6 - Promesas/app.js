"use strict";
//Una promesa es del ES6, da la posibilidad de ejecutar una instrucción ó función cuando una tarea asincrona es terminada
let prom1 = new Promise(function (resolve, reject) {
    setTimeout(() => {
        console.log("Promesa terminada");
        //termina bien
        resolve();
        //termina mal
        //reject();
    }, 1500);
}); // resolve es la función que se ejecutara cuando se termina correctamente la promesa
// reject es cuando la promesa regresa un error
console.log("Paso 1");
prom1.then(function () {
    console.log("Se terminó correctamente");
}, function () {
    console.error("Con error");
});
console.log("Paso 2");
