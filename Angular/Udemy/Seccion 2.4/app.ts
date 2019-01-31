
//Función de flecha


 let miFuncion = function( a:string ){
     return a;
 }

 let miFuncionFlecha = (b:string) => b;
 let suma = (a:number, b: number) => a+b;

 console.log(miFuncion("normal"));
 console.log(miFuncionFlecha("flecha"));
 console.log(suma(3,2));


 let hulk = {
     nombre : "Bruce",
     smash(){
         console.log(this.nombre + " smash!!");
     }
 }

 hulk.smash();

 let hulk2 = {
    nombre : "Bruce",
    smash(){
        setTimeout(function(){
          //  console.log(this.nombre + " smash!!");              //En un timeout el this apuntara al objeto global, en este caso es window (no funcionará)

        },1500)
    }
}

let hulk3 = {
    nombre : "Bruce",
    smash(){
        console.log(this.nombre + " del hulk3");                              //this.nombre si apunta al del objeto
        setTimeout(() => console.log(this.nombre + " smash!!"),1500);        //Lo anterior se soluciona con una función de flecha

       
    }
}

hulk3.smash();
