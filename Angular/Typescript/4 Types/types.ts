/*Cuando se hace la transpilación se le puede decir que haga check de los tipos de datos (para que el error no salga en runtime) */
let a:number;   /*forza a que ya no se asigne otro tipo de valor */
a = 1;
//a = '2';          --> esto manda error


/* tsc -w nombre.ts --> -w es para watch, para ver si existe algun tipo de error*/

/*          TIPOS DE DATOS               */
let decimal: number = 6;
let flag: boolean = true;
let value: string = "valor";

/*Dos formas de asignar una lista */
let list1: number[] = [1,2,3];
let list2: Array<number> = [1,2,3];         /*Generico */ 

/*que una variable apunte a una funcion */
let fun: Function = () => console.log("Hello");

/*Funcion que declara el tipo de retorno */
function returnNumber():number  {           /*Fuerza a que regrese un numero, si no lleva nada podría regresar cualquier cosa */
    return 1;
}

/*      Enum     */
enum Direction{
    Up,
    Down,
    Left,
    Right
}
let go: Direction;
go = Direction.Down;
console.log(go);



/*  OBJETOS PROPIOS */
class Person{}
let per: Person;
let people: Person[];

/*      Cualquier tipo de dato (any) */
let cualquiera:any=1;
cualquiera="test";



/*  void -> no type */
function returnNoting(): void{
    console.log("muuuu");
}


/*  Assertion */
let value2:any="string";
(<string>value2).length;        /*A esto se le llama type assertion, que es saber con anterioridad el tipo de valor y "castearlo" */





/*  Genericos   */
class Audios{}
class Videos{}
class Links{}
class Texts{}

class Post<T>{
    content: T;
}

let videoPost:Post<Videos>;


/*Ambient Type Definition.- es un archivo que contiene metadata de como tratar los "tipos" de otras librerias */