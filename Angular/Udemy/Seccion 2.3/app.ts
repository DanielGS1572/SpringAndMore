//Parametros opcionales, obligatorios y por defecto

function activar(
    quien:string,                            /*Este es un parámetro obligatorio */
    objeto:string = "batiseñal",             /*Este es un parametro por defecto, no pide el valor cuando se llama la función (no es requerido)*/
    momento?:string                         /*Parametro opcional, si se piensa enviar debe enviarse a fuerza el parametro por defecto*/
    //no se pueden tener parametros opcionales o por defecto al principio y al final uno requerido (los requeridos siempre van al principio)
    ){


    let mensaje:string;
    if( momento ){
        mensaje = `${ quien } activó la ${ objeto } en la ${ momento }`;
    }else{
        mensaje = `${ quien } activó la ${ objeto }`;
    }
    console.log(mensaje);


}

activar("Gordon", "batiseñal", "tarde");
activar("Gordon");
