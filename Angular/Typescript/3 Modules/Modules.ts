 /*Module loader es tener la posibilidad de llamar funciones de otros archivos externos, Javascript no tiene dicha funcionalidad, pero 
 cuando se transpila de ES6 a ES5 se usa un common loader system --> usa la palabra required("./Modules.ts") */


 /*export*/ function square(x){             /*export default hace que cuando se haga el import en script ya no se tenga la necesidad de poner {}, sino simplemente quedaria como square, {cow} --> cow no tiene la palabra reservada default*/
     return Math.pow(x,2);
 }

 /*export*/ function cow(){
     console.log("Muuuuu!");
 }

 /*Para que las funciones anteriores esten disponibles en el mundo exterior se debe usar la palabra reservada EXPORT */

 export{cow, square};            
 /*cow:cow, square:square --> El primer elemento es un objeto : seguido de la funcion  */
 /*Haciendo destructuring queda mas simple */
 /*El export se puede hacer tambien antes de la declaracion de cada función */