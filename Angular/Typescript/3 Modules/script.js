"use strict";
exports.__esModule = true;
/*Para importar */
var Modules_1 = require("./Modules");
console.log(Modules_1.square(2));
Modules_1.cow();
/*

Para transpilar

        tsc Modules.ts script.ts                   -> los pasa a javascripts
        node script.js                             -> para correr el script


 */ 
