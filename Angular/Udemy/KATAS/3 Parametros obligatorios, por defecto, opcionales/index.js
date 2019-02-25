function metodo(quien, como, cuando) {
    if (como === void 0) { como = "como"; }
    if (cuando) {
        console.log(quien + " - " + como + " - " + cuando);
    }
    else {
        console.log(quien + " - " + como);
    }
}
metodo("quien");
metodo("quien", "como2", "cuando2");
