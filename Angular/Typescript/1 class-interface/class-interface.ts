/*Si se transpila a ES5 la clase la pone como una variable pues las clases apenas existen en ES6 */
/*Hay tres tipos de modificadores de acceso
        -public (default(que es public))
        -private
        -protected
 */
interface Human {
  firstName: string;
  lastName: string;
  name?: Function;              /*Funcion opcional, se puede poner en el constructor o no */
  isLate?(time: Date): Function;
}

class Person implements Human {
  constructor(public firstName, public lastName) {
  }

  public name() {
    return `${this.firstName} ${this.lastName}`;
  }

  protected whoAreYou() {
    return `Hi i'm ${this.name()}`;
  }
}

class Student extends Person {
  constructor(public firstName, public lastName, public course) {           /*Ver como no se define una variable course en la clase,
                                                                            si no nada mas en el constructor, esto es porque al tener 
                                                                            el modificador de acceso por detras declara las variable
                                                                            y asigna this.firstname = firstname, si se compila ya se veria */
    super(firstName, lastName);
  }

  whoAreYou() {             /*Se hace override del metodo definido en person */
    return `${super.whoAreYou()} and i'm studying ${this.course}`;  /*super manda llamar el whoAreYou de Person */
  }
}

let asim = new Student("Asim", "Hussain", "typescript");
console.log(asim.whoAreYou());