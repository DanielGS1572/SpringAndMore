class Avenger{
    nombre: string = "";                                             //Si no se tiene el constructor manda error, pero si se inicializan ya no hay problema
    equipo: string = "equipo";
    nombreReal: string = "nr";
    puedePelear: boolean = false;
    peleasGanadas: number = 0;

    constructor(nombre:string, equipo:string, nombreReal:string,puedePelear:boolean,peleasGanadas?:number){
        this.nombre = nombre;
        this.equipo = equipo;
        this.nombreReal = nombreReal;
        this.puedePelear = puedePelear;
        this.peleasGanadas = peleasGanadas;
    }

    //No existe la sobrecarga de constructores
    /*
    Lo que se puede hacer es:
    Crear una función con otro nombre que reciba diferentes parámetros que termine llamando la función principal
     */
}

let antman:Avenger = new Avenger("Antman","equipo","nombre real", true,);           //Para 
console.log(antman);
