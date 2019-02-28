//Destructuración de objetos
var avenger = {
    poder: "poder",
    persona: "persona",
    edad: 33
};
var aliasPoder = avenger.poder, persona = avenger.persona, edad = avenger.edad;
console.log(aliasPoder, persona, edad + 1);
//Destructuración de arreglos
var avengers = ["Thor", "Steve", "Tony"];
//Aqui si pueden tener nombres diferentes, solo se basa con la posicion
var thor = avengers[0], stark = avengers[2]; //se pueden dejar posiciones vacias
console.log(thor, stark);
