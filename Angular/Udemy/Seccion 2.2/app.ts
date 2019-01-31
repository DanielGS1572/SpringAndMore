var mensaje = "hola";

if( true ){
    var mensaje = "adios";
}

console.log(mensaje);           //con var no respeta el scope de la variable y toma el último valor que se le fue asignado

//pero con let respeta el scope (esto es codigo de ES6 --> ES6 es ES2015)

let texto = "hola";

if( true ){
    let texto = "adios";
}

console.log(texto);    

let nombre = "Peter";            //Solo permitirá datos de tipo texto
let apellido:string = "Gonzalí"
let numero:number = 12.1
let booleano:boolean = true;
let hoy:Date = new Date();
hoy = new Date('2019-01-01');

let cualquiera:any;                     //acepta cualquier tipo de dato
cualquiera = nombre;
cualquiera = apellido;
cualquiera = booleano;
cualquiera = hoy;

let spiderman = {                       
    nombre : "Peter",
    edad : 20
}

spiderman = {
    nombre : "Daniel",
    edad : 20,
    //poder : "trepar"                 //si se declara una variable con let y lueg se intenta modificar agregando una nueva propiedad mandará error
}


//Template literal
let nombre2:string = "Juan"
let apellido2:string = "Perez"
let edad2:number = 32;

let texto1 = "Hola, " + nombre2 + " " + apellido2 + "(" + edad2 + ")";
let texto2:string = `Hola, ${ nombre2 } ${ apellido2 } (${ edad2 }) - Funcion javascript ${ getNombre() }`;                  //Template literal - se usan backticks - esto es de typescript
//lo que esta dentro de { } es codigo de javascript
console.log(texto1);
console.log(texto2);

function getNombre(){
    return "texto de nombre"
}
