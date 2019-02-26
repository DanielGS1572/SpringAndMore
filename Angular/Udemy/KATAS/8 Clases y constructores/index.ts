
class Avenger{
   // nombre:string="Nombre Default"
   // puedePelear:boolean
    peleasGanadas:number

    constructor(public nombre:string,public puedePelear:boolean){
        //this.nombre = nombre;
        //this.puedePelear = puedePelear;
    }
}


let  avenger:Avenger = new Avenger("nombre",true);

console.log(avenger);