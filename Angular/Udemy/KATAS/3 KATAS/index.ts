
function fun(quien:string,como:string="como",cuando?:string){
    if(cuando){
        console.log(`${quien} ${como} ${cuando}` )
    }
    else{
        console.log(`${quien} ${como}` )
    }
}

fun("quien","como","Cuando");
fun("quien");
