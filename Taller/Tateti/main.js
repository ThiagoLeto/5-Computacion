
var cuadrado1 = document.getElementById('cuadrado1');
var cuadrado2 = document.getElementById('cuadrado2');
var cuadrado3 = document.getElementById('cuadrado3');
var cuadrado4 = document.getElementById('cuadrado4');
var cuadrado5 = document.getElementById('cuadrado5');
var cuadrado6 = document.getElementById('cuadrado6');
var cuadrado7 = document.getElementById('cuadrado7');
var cuadrado8 = document.getElementById('cuadrado8');
var cuadrado9 = document.getElementById('cuadrado9');

var agregarCirculo = function(){

    var circulo_juego = document.createElement("div");
    circulo_juego.setAttribute("class","circulo-juego");
    document.getElementById("cuadrado1").appendChild("circulo_juego");
            

    //cuadrado1.setAttribute("class", "circulo-juego");
}
var agregarCruz = function(){
    cuadrado1.setAttribute("class", "cruz-juego");
}

cuadrado1.addEventListener("click", agregarCirculo);
cuadrado2.addEventListener("click", agregarCirculo);
cuadrado3.addEventListener("click", agregarCirculo);
cuadrado4.addEventListener("click", agregarCirculo);
cuadrado5.addEventListener("click", agregarCirculo);
cuadrado6.addEventListener("click", agregarCirculo);
cuadrado7.addEventListener("click", agregarCirculo);
cuadrado8.addEventListener("click", agregarCirculo);
cuadrado9.addEventListener("click", agregarCirculo);
