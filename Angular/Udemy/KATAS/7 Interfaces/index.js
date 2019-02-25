function mision(personaje) {
    console.log("se manda a mision 0 " + personaje.nombre); //se tiene el riesgo que no tenga la propiedad
}
var wolverine = {
    nombre: "wolverine",
    edad: 28
};
function misionDos(personajeDos) {
    console.log("Ha mision 1 " + personajeDos.nombre); //se volvería tedioso con muchas propiedades
}
function misionTres(personajeDos) {
    console.log("Ha mision 2 " + personajeDos.nombre); //ya no hay problema pues mandaria error en codigo
}
mision(wolverine);
misionDos(wolverine);
misionTres(wolverine);
