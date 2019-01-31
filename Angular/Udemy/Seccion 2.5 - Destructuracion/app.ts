//Destructuración de objetos
//La destructuración es asignar en variables las propiedades de los objetos

let avenger = {
    nombre : "Steve",
    clave: "Capitan america",
    poder: "Droga"
}
//la destructuración de un objeto va entre {}, la de un arreglo va entre []
let { poder:aliasVariable, nombre, clave } = avenger;           //no se pone el tipo de dato si no que despues de los dos puntos va un alias 
                                                                //(le asigna el tipo de dato automaticamente)

//lo anterior es como se hiciera lo siguiente
//let nombre = avenger.nombre;      
//let poder = avenger.poder;
//let clave = avenger.clave;
console.log(aliasVariable, nombre, clave );

//la destructuración en arreglos SI importa el ORDEN
let avengers:string[] = ["Thor","Steve","Tony"];
let [thor, ,ironman] = avengers;        //SE BRINCA LA SEGUNDA POSICIÓN
console.log(thor,ironman);
