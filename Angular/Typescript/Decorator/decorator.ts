function Student(config) {
    return function (target) {  /*Esto es una funcion que se le pasa al decorator, si no tuviera 
        una funcion y nada mas Object Student(target), la clase de person se anotaria como @Student  */
        Object.defineProperty(target.prototype, 'course', {value: () => config.course})
        /*Object.defineProperty --> agrega una funcion "course" en la clase que decora "target.prototype"
        "()=> config.course" es lo que regresa */
    }
}


/*Los decoradores no estan disponibles en ES6, recordar que typescript es 
una mejor a es6 */
/*Un decorador es esencialmente una funcion */
@Student({
    course: "angular3"      /*config.course de la funcion de arriba */
})
class Person {
    constructor(private firstName, private lastName) {
    }

    public name() {
        return `${this.firstName} ${this.lastName}`;
    }

    protected whoAreYou() {
        return `Hi i'm ${this.name()}`;
    }
}

let asim = new Person("Asim", "Hussain");
//noinspection TypeScriptUnresolvedFunction
console.log(asim.course());           /*Ver que course() lo esta tomando por el decorador */     
/*tsc --experimentalDecorators decorator.ts para remover los warnings y compilar al mismo tiempo (aun manda 
    error que no existe course, pero aun asi compila*/
/*Para ejecutar lo que se ha compilado se pone node archivo.js */