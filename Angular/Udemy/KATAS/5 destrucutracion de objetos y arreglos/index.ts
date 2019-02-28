
//Destructuración de objetos
let avenger = {
    poder: "poder",
    persona: "persona",
    edad: 33
}


let { poder:aliasPoder , persona, edad} = avenger;
console.log(aliasPoder, persona, edad+1);

//Destructuración de arreglos
let avengers:string[]=["Thor","Steve","Tony"];
//Aqui si pueden tener nombres diferentes, solo se basa con la posicion
let[thor, , stark] = avengers;          //se pueden dejar posiciones vacias
console.log(thor, stark)