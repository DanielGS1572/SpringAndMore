
//una promesa recibe una funcion con dos parametros
import {Promise} from 'es6-promise';
let prom1 = new Promise(
    function (resolve:any, reject:any) {
        setTimeout(
            () => {
                console.log("Promesa terminada")
                resolve();
            }, 1500
        )
    }
)

console.log("Paso 1");
prom1.then(function () {
    console.log("todo sale bien");
},
    function () {
        console.log("algo sale mal");

    });