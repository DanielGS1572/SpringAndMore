
console.log("inicia");
let nombre="Pepito";
let hulk={
    nombre:"Hulk1",
    smash(){            //Tambien se puede declarar como function smash:function(){}
        setTimeout( () => console.log(this.nombre + " smash!"), 1500)
    }
}


let hulk2={
    nombre:"Hulk2",
    smash(){
        setTimeout( function() {
            console.log(this.nombre + " smash!")
        }, 1500)            
//CUANDO HAY UN TIMEOUT EN UN OBJETO EL THIS APUNT A WINDOW
    }
}


hulk.smash();
hulk2.smash();