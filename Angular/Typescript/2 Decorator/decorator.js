var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
function Student(config) {
    return function (target) {
        Object.defineProperty(target.prototype, 'course', { value: function () { return config.course; } });
        /*Object.defineProperty --> agrega una funcion "course" en la clase que decora "target.prototype"
        "()=> config.course" es lo que regresa */
    };
}
/*Los decoradores no estan disponibles en ES6, recordar que typescript es
una mejor a es6 */
/*Un decorador es esencialmente una funcion */
var Person = /** @class */ (function () {
    function Person(firstName, lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    Person.prototype.name = function () {
        return this.firstName + " " + this.lastName;
    };
    Person.prototype.whoAreYou = function () {
        return "Hi i'm " + this.name();
    };
    Person = __decorate([
        Student({
            course: "angular3" /*config.course de la funcion de arriba */
        })
    ], Person);
    return Person;
}());
var asim = new Person("Asim", "Hussain");
//noinspection TypeScriptUnresolvedFunction
console.log(asim.course()); /*Ver que course() lo esta tomando por el decorador */
/*tsc --experimentalDecorators archivo.ts para remover los warnings */
/*Para ejecutar lo que se ha compilado se pone node archivo.js */ 
