//En la interfaz solo se declaran los tipos
interface Xmen{
    nombre: string,
    poder: string
}

function enviarMision( xmen:Xmen){
    console.log("enviar misión a: " + xmen.nombre);
}

let wolverine : Xmen = {
    nombre: "wolverine",
    poder: "regeneración"
}

enviarMision(wolverine);