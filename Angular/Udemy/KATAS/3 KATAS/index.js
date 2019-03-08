function fun(quien, como, cuando) {
    if (como === void 0) { como = "como"; }
    if (cuando) {
        console.log(quien + " " + como + " " + cuando);
    }
    else {
        console.log(quien + " " + como);
    }
}
fun("quien", "como", "Cuando");
fun("quien");
