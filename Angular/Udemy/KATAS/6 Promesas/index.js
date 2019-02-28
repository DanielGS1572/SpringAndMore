"use strict";
exports.__esModule = true;
//una promesa recibe una funcion con dos parametros
var es6_promise_1 = require("es6-promise");
var prom1 = new es6_promise_1.Promise(function (resolve, reject) {
    setTimeout(function () {
        console.log("Promesa terminada");
        resolve();
    }, 1500);
});
console.log("Paso 1");
prom1.then(function () {
    console.log("todo sale bien");
}, function () {
    console.log("algo sale mal");
});
