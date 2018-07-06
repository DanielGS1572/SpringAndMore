/*Para importar */
import{square as sqr,cow} from "./Modules";                 /*as viene siendo un alias, igual se puede importar todo como 
import * as modules from "./Modules" --> y sería modules.square(x) */

console.log(sqr(2));
cow()

/*

Para transpilar

        tsc Modules.ts script.ts                   -> los pasa a javascripts
        node script.js                             -> para correr el script


 */