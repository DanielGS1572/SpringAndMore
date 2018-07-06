"use strict";
/*Module loader es tener la posibilidad de llamar funciones de otros archivos externos, Javascript no tiene dicha funcionalidad, pero
cuando se transpila de ES6 a ES5 se usa un common loader system --> usa la palabra required("./Modules.ts") */
exports.__esModule = true;
function square(x) {
    return Math.pow(x, 2);
}
exports.square = square;
function cow() {
    console.log("Muuuuu!");
}
exports.cow = cow;
/*cow:cow, square:square --> El primer elemento es un objeto : seguido de la funcion  */
/*Haciendo destructuring queda mas simple */ 
