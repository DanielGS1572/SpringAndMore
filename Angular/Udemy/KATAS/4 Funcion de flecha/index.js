console.log("inicia");
var nombre = "Pepito";
var hulk = {
    nombre: "Hulk",
    smash: function () {
        var _this = this;
        setTimeout(function () { console.log(_this.nombre + "smash!"); }, 1500);
    }
};
var hulk2 = {
    nombre: "Hulk",
    smash: function () {
        setTimeout(function () {
            console.log(this.nombre + "smash!");
        }, 1500);
        //CUANDO HAY UN TIMEOUT EN UN OBJETO EL THIS APUNT A WINDOW
    }
};
hulk.smash();
hulk2.smash();
