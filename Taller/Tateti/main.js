let cont=0;
let cuadrado=null;
let valor_cuadrado1 = null;
const cuadrado_usado1 = [];
const cuadrado_usado2 = [];
let jugar_nuevamente = 0;

let cuadrado1 = document.getElementById('1');
let cuadrado2 = document.getElementById('2');
let cuadrado3 = document.getElementById('3');
let cuadrado4 = document.getElementById('4');
let cuadrado5 = document.getElementById('5');
let cuadrado6 = document.getElementById('6');
let cuadrado7 = document.getElementById('7');
let cuadrado8 = document.getElementById('8');
let cuadrado9 = document.getElementById('9');

let victorias1 = 0;
let victorias2 = 0;

document.getElementById('victorias1').innerHTML = victorias1;
document.getElementById('victorias2').innerHTML = victorias2;

function cambiar(boton){
    
    let cuadrado = document.getElementById(boton); 
    let valor_cuadrado1=boton;  
    let cont1 = 0;
    let cont2 = 0;

    cont2 = jugar_nuevamente+cont; 
    cont1 = cont2%2;
    
    if(cont1==0){
            if(cuadrado_usado1.includes(valor_cuadrado1) || cuadrado_usado2.includes(valor_cuadrado1)){
                console.log("Ya esta agregado manin");
            }
            else{
                cuadrado.style.backgroundColor = "orange";  
                cuadrado_usado1.push(valor_cuadrado1); 
                console.log("se agrega naranja:  " + cuadrado_usado1);
                console.log(" ");
                cont++;
            }
        
    }

    else if(cont1==1){
        if(cuadrado_usado2.includes(valor_cuadrado1) || cuadrado_usado1.includes(valor_cuadrado1)){
            console.log("Ya esta agregado manin"); 
        }
        else{
            cuadrado.style.backgroundColor = "#31363a";
            cuadrado_usado2.push(valor_cuadrado1); 
            console.log("SE AGREGA NEGRO: " + cuadrado_usado2);
            console.log(" ");
            cont++;
        }
    }  
    ganador();
}




let yagano = false;

function ganador(){
    if (cuadrado_usado1.includes(1) && cuadrado_usado1.includes(2) && cuadrado_usado1.includes(3) && yagano == false) {
        alert("El jugador 1 es el ganador manin!"); yagano = true; victorias1++; document.getElementById('victorias1').innerHTML = victorias1;}
    else if (cuadrado_usado1.includes(1) && cuadrado_usado1.includes(4) && cuadrado_usado1.includes(7) && yagano == false) {
        alert("El jugador 1 es el ganador manin!"); yagano = true; victorias1++; document.getElementById('victorias1').innerHTML = victorias1;}
    else if (cuadrado_usado1.includes(2) && cuadrado_usado1.includes(5) && cuadrado_usado1.includes(8) && yagano == false) {
        alert("El jugador 1 es el ganador manin!"); yagano = true; victorias1++; document.getElementById('victorias1').innerHTML = victorias1;}
    else if (cuadrado_usado1.includes(3) && cuadrado_usado1.includes(6) && cuadrado_usado1.includes(9) && yagano == false) {
        alert("El jugador 1 es el ganador manin!"); yagano = true; victorias1++; document.getElementById('victorias1').innerHTML = victorias1;}
    else if (cuadrado_usado1.includes(4) && cuadrado_usado1.includes(5) && cuadrado_usado1.includes(6) && yagano == false) {
        alert("El jugador 1 es el ganador manin!"); yagano = true; victorias1++; document.getElementById('victorias1').innerHTML = victorias1;}
    else if (cuadrado_usado1.includes(7) && cuadrado_usado1.includes(8) && cuadrado_usado1.includes(9) && yagano == false) {
        alert("El jugador 1 es el ganador manin!"); yagano = true; victorias1++; document.getElementById('victorias1').innerHTML = victorias1;}
    else if (cuadrado_usado1.includes(1) && cuadrado_usado1.includes(5) && cuadrado_usado1.includes(9) && yagano == false) {
        alert("El jugador 1 es el ganador manin!"); yagano = true; victorias1++; document.getElementById('victorias1').innerHTML = victorias1;}
    else if (cuadrado_usado1.includes(3) && cuadrado_usado1.includes(5) && cuadrado_usado1.includes(7) && yagano == false) {
        alert("El jugador 1 es el ganador manin!"); yagano = true; victorias1++; document.getElementById('victorias1').innerHTML = victorias1;}
    
    if(cuadrado_usado2.includes(1) && cuadrado_usado2.includes(2) && cuadrado_usado2.includes(3) && yagano == false){
        alert("El jugador 2 es el ganador manin!"); yagano = true; victorias2++; document.getElementById('victorias2').innerHTML = victorias2;}
    else if(cuadrado_usado2.includes(1) && cuadrado_usado2.includes(4) && cuadrado_usado2.includes(7) && yagano == false){
        alert("El jugador 2 es el ganador manin!"); yagano = true; victorias2++; document.getElementById('victorias2').innerHTML = victorias2;}
    else if(cuadrado_usado2.includes(3) && cuadrado_usado2.includes(6) && cuadrado_usado2.includes(9) && yagano == false){
        alert("El jugador 2 es el ganador manin!"); yagano = true; victorias2++; document.getElementById('victorias2').innerHTML = victorias2;}
    else if(cuadrado_usado2.includes(4) && cuadrado_usado2.includes(5) && cuadrado_usado2.includes(6) && yagano == false){
        alert("El jugador 2 es el ganador manin!"); yagano = true; victorias2++; document.getElementById('victorias2').innerHTML = victorias2;}
    else if(cuadrado_usado2.includes(7) && cuadrado_usado2.includes(8) && cuadrado_usado2.includes(9) && yagano == false){
        alert("El jugador 2 es el ganador manin!"); yagano = true; victorias2++; document.getElementById('victorias2').innerHTML = victorias2;}
    else if(cuadrado_usado2.includes(2) && cuadrado_usado2.includes(5) && cuadrado_usado2.includes(8) && yagano == false){
        alert("El jugador 2 es el ganador manin!"); yagano = true; victorias2++; document.getElementById('victorias2').innerHTML = victorias2;}
    else if(cuadrado_usado2.includes(1) && cuadrado_usado2.includes(5) && cuadrado_usado2.includes(9) && yagano == false){
        alert("El jugador 2 es el ganador manin!"); yagano = true; victorias2++; document.getElementById('victorias2').innerHTML = victorias2;}
    else if(cuadrado_usado2.includes(3) && cuadrado_usado2.includes(5) && cuadrado_usado2.includes(7) && yagano == false){
        alert("El jugador 2 es el ganador manin!"); yagano = true; victorias2++; document.getElementById('victorias2').innerHTML = victorias2;}
}


function reiniciar(){
    cuadrado_usado1.splice(0, cuadrado_usado1.length);
    cuadrado_usado2.splice(0, cuadrado_usado2.length);

    yagano=false;
    cont=0;
    cuadrado=null;
    valor_cuadrado1 = null;
    victorias1 = 0;
    victorias2 = 0;
    document.getElementById('victorias1').innerHTML = victorias1;
    document.getElementById('victorias2').innerHTML = victorias2;


    cuadrado1.style.backgroundColor = null;
    cuadrado2.style.backgroundColor = null;
    cuadrado3.style.backgroundColor = null;
    cuadrado4.style.backgroundColor = null;
    cuadrado5.style.backgroundColor = null;
    cuadrado6.style.backgroundColor = null;
    cuadrado7.style.backgroundColor = null;
    cuadrado8.style.backgroundColor = null;
    cuadrado9.style.backgroundColor = null;
}


function jugar_de_nuevo(boton){
    cuadrado_usado1.splice(0, cuadrado_usado1.length);
    cuadrado_usado2.splice(0, cuadrado_usado2.length);

    yagano=false;
    cont=0;
    cuadrado=null;
    valor_cuadrado1 = null;

    jugar_nuevamente++;

    cuadrado1.style.backgroundColor = null;
    cuadrado2.style.backgroundColor = null;
    cuadrado3.style.backgroundColor = null;
    cuadrado4.style.backgroundColor = null;
    cuadrado5.style.backgroundColor = null;
    cuadrado6.style.backgroundColor = null;
    cuadrado7.style.backgroundColor = null;
    cuadrado8.style.backgroundColor = null;
    cuadrado9.style.backgroundColor = null;
}
