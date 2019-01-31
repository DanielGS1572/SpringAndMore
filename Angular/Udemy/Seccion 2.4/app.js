"use strict";
//Función de flecha
var miFuncion = function (a) {
    return a;
};
var miFuncionFlecha = function (b) { return b; };
var suma = function (a, b) { return a + b; };
console.log(miFuncion("normal"));
console.log(miFuncionFlecha("flecha"));
console.log(suma(3, 2));
var hulk = {
    nombre: "Bruce",
    smash: function () {
        console.log(this.nombre + " smash!!");
    }
};
hulk.smash();
var hulk2 = {
    nombre: "Bruce",
    smash: function () {
        setTimeout(function () {
            //  console.log(this.nombre + " smash!!");              //En un timeout el this apuntara al objeto global, en este caso es window
        }, 1500);
    }
};
var hulk3 = {
    nombre: "Bruce",
    smash: function () {
        var _this = this;
        console.log(this.nombre + " del hulk3");
        setTimeout(function () { return console.log(_this.nombre + " smash!!"); }, 1500); //Lo anterior se soluciona con una función de flecha
    }
};
hulk3.smash();
