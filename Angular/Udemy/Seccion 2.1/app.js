"use strict";
//para compilar ts a js se usa tsc [archivoTypescript]
//para que funcione en modo observador para no estar ejecutando la linea anterior tsc [archivoTypescript] -w
//Para que tome los cambios de todo el proyecto y no nada más de un solo archivo se inicializa el proyecto con tsc -init (con esto genera un archivo
//                                                                                                        tsconfig.json)
//el tsconfig.json tiene la configuración del compilador de typescript:
//              - module: "commonjs"        es el tipo de importador de modulo
function saludar(nombre) {
    console.log("hola " + nombre);
}
var wolverine = {
    nombre: "Logan"
};
saludar(wolverine.nombre);
