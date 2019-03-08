console.log("inicia");
var nombre = "Pepito";
var hulk1 = {
    nombre: "hulk1",
    smash: function () {
        var _this = this;
        setTimeout(function () { return console.log(_this.nombre + " smash1"); }, 1500);
    }
};
var hulk2 = {
    nombre: "hulk2",
    smash: function () {
        setTimeout(function () {
            console.log(this.nombre + " smash2");
        }, 1500);
    }
};
hulk1.smash();
hulk2.smash();
