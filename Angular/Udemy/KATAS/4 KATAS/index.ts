console.log("inicia");

let nombre="Pepito";

let hulk1 = {
    nombre : "hulk1",
    smash(){
        setTimeout( () => console.log(this.nombre + " smash1"),1500);
    }
}

let hulk2 = {
    nombre : "hulk2",
    smash:function(){
        setTimeout(function(){
            console.log(this.nombre + " smash2")
        },1500)
        }        
    }


hulk1.smash(); 
hulk2.smash();
