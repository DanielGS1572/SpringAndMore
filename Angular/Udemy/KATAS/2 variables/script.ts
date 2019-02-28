var mensaje = "hola"; //forma en la que se declaran variables noralmente en javascript
let mensaje2 = "hola2"  //let es typescript y respeta el scope
const OPCIONES = "todas";               //las constantes deben ser inicializadas cuan

if(true){
    var mensaje = "adios";
    let mensaje2= "adios2";
    const OPCIONES = "todas2";      
}

console.log(mensaje); 
console.log(mensaje2); 
console.log(OPCIONES);                  //Fuera del scope se comporta como las variables tipo LET