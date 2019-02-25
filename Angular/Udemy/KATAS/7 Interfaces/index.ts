


function mision(personaje:any){
    console.log("se manda a mision 0 " + personaje.nombre);               //se tiene el riesgo que no tenga la propiedad
}

let wolverine:Xmen={                        //el tipo de dato wolverine cumple con la interfaz Xmen
    nombre:"wolverine",
    edad:28
}





function misionDos(personajeDos : {nombre:string}){
    console.log("Ha mision 1 " + personajeDos.nombre);                    //se volvería tedioso con muchas propiedades
}

function misionTres(personajeDos : Xmen){
    console.log("Ha mision 2 " + personajeDos.nombre);                    //ya no hay problema pues mandaria error en codigo
}

interface Xmen{
    nombre:string,
    edad:number
}

mision(wolverine);
misionDos(wolverine);
misionTres(wolverine);
