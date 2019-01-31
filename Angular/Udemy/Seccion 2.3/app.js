"use strict";
//Parametros opcionales, obligatorios y por defecto
function activar(quien, /*Este es un parámetro obligatorio */ objeto, /*Este es un parametro por defecto, no pide el valor cuando se llama la función (no es requerido)*/ momento /*Parametro opcional, si se piensa enviar debe enviarse a fuerza el parametro por defecto*/
//no se pueden tener parametros opcionales o por defecto al principio y al final uno requerido
) {
    if (objeto === void 0) { objeto = "batiseñal"; }
    var mensaje;
    if (momento) {
        mensaje = quien + " activ\u00F3 la " + objeto + " en la " + momento;
    }
    else {
        mensaje = quien + " activ\u00F3 la " + objeto;
    }
    console.log(mensaje);
}
activar("Gordon", "batiseñal", "tarde");
activar("Gordon");
