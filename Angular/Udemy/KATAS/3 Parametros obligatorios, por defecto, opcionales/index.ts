

function metodo(quien: string,
    como: string = "como",
    cuando?: string) {
    if (cuando) {
        console.log(`${quien} - ${como} - ${cuando}`)
    } else {
        console.log(`${quien} - ${como}`)
    }
}

metodo("quien");
metodo("quien", "como2", "cuando2")
