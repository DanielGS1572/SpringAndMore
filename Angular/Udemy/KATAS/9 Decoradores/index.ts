function consola( constructor:Function){
    console.log(constructor);                   //de esta forma el decorador se le pasa el constructor
}


@consola
class Clase{
    constructor(public nombre:string){
        console.log("muestra constructor");
    }
}