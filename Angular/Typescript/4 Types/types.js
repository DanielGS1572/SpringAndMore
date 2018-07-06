/*Cuando se hace la transpilación se le puede decir que haga check de los tipos de datos (para que el error no salga en runtime) */
var a; /*forza a que ya no se asigne otro tipo de valor */
a = 1;
//a = '2';          --> esto manda error
/* tsc -w nombre.ts --> -w es para watch, para ver si existe algun tipo de error*/
/*          TIPOS DE DATOS               */
var decimal = 6;
var flag = true;
var value = "valor";
/*Dos formas de asignar una lista */
var list1 = [1, 2, 3];
var list2 = [1, 2, 3]; /*Generico */
/*que una variable apunte a una funcion */
var fun = function () { return console.log("Hello"); };
/*Funcion que declara el tipo de retorno */
function returnNumber() {
    return 1;
}
/*      Enum     */
var Direction;
(function (Direction) {
    Direction[Direction["Up"] = 0] = "Up";
    Direction[Direction["Down"] = 1] = "Down";
    Direction[Direction["Left"] = 2] = "Left";
    Direction[Direction["Right"] = 3] = "Right";
})(Direction || (Direction = {}));
var go;
go = Direction.Down;
console.log(go);
/*  OBJETOS PROPIOS */
var Person = /** @class */ (function () {
    function Person() {
    }
    return Person;
}());
var per;
var people;
/*      Cualquier tipo de dato (any) */
var cualquiera = 1;
cualquiera = "test";
/*  void -> no type */
function returnNoting() {
    console.log("muuuu");
}
/*  Assertion */
var value2 = "string";
value2.length; /*A esto se le llama type assertion, que es saber con anterioridad el tipo de valor y "castearlo" */
/*  Genericos   */
var Audios = /** @class */ (function () {
    function Audios() {
    }
    return Audios;
}());
var Videos = /** @class */ (function () {
    function Videos() {
    }
    return Videos;
}());
var Links = /** @class */ (function () {
    function Links() {
    }
    return Links;
}());
var Texts = /** @class */ (function () {
    function Texts() {
    }
    return Texts;
}());
var Post = /** @class */ (function () {
    function Post() {
    }
    return Post;
}());
var videoPost;
/*Ambient Type Definition.- es un archivo que contiene metadata de como tratar los "tipos" de otras librerias */ 
