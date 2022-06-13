let cont=0;
let cuadrado=null;
let cuadrado1 = null;
const cuadrado_usado1 = [];
const cuadrado_usado2 = [];

function cambiar(boton){
    
    let cuadrado = document.getElementById(boton); 
    let cuadrado1=boton;  
    let cont1 = 0;
    cont1 = cont%2;
    
    if(cont1==0){
            if(cuadrado_usado1.includes(cuadrado1) || cuadrado_usado2.includes(cuadrado1)){
                console.log("Ya esta agregado manin");
            }
            else{
                cuadrado.style.backgroundColor = "orange";  
                cuadrado_usado1.push(cuadrado1); 
                console.log("Se agrega naranja:  " + cuadrado_usado1);
                console.log(" ");
                cont++;
            }
        
    }

    else if(cont1==1){
        if(cuadrado_usado2.includes(cuadrado1) || cuadrado_usado1.includes(cuadrado1)){
            console.log("Ya esta agregado manin"); 
        }
        else{
            cuadrado.style.backgroundColor = "#31363a";
            cuadrado_usado2.push(cuadrado1); 
            console.log("SE AGREGA NEGRO: " + cuadrado_usado2);
            console.log(" ");
            cont++;
        }
    }  
    ganador();
}


function ganador(){
    if (cuadrado_usado1.includes(1) && cuadrado_usado1.includes(2) && cuadrado_usado1.includes(3) || cuadrado_usado2.includes(1) && cuadrado_usado2.includes(2) && cuadrado_usado2.includes(3)) {
        alert("El jugador 1 es el ganador manin!");}
    else if (cuadrado_usado1.includes(1) && cuadrado_usado1.includes(4) && cuadrado_usado1.includes(7) || cuadrado_usado2.includes(1) && cuadrado_usado2.includes(2) && cuadrado_usado2.includes(3)) {
        alert("El jugador 1 es el ganador manin!");}
    else if (cuadrado_usado1.includes(2) && cuadrado_usado1.includes(5) && cuadrado_usado1.includes(8) || cuadrado_usado2.includes(1) && cuadrado_usado2.includes(2) && cuadrado_usado2.includes(3)) {
        alert("El jugador 1 es el ganador manin!");}
    else if (cuadrado_usado1.includes(3) && cuadrado_usado1.includes(6) && cuadrado_usado1.includes(9) || cuadrado_usado2.includes(1) && cuadrado_usado2.includes(2) && cuadrado_usado2.includes(3)) {
        alert("El jugador 1 es el ganador manin!");}
    else if (cuadrado_usado1.includes(4) && cuadrado_usado1.includes(5) && cuadrado_usado1.includes(6) || cuadrado_usado2.includes(1) && cuadrado_usado2.includes(2) && cuadrado_usado2.includes(3)) {
        alert("El jugador 1 es el ganador manin!");}
    else if (cuadrado_usado1.includes(7) && cuadrado_usado1.includes(8) && cuadrado_usado1.includes(9) || cuadrado_usado2.includes(1) && cuadrado_usado2.includes(2) && cuadrado_usado2.includes(3)) {
        alert("El jugador 1 es el ganador manin!");}
    else if (cuadrado_usado1.includes(1) && cuadrado_usado1.includes(5) && cuadrado_usado1.includes(9) || cuadrado_usado2.includes(1) && cuadrado_usado2.includes(2) && cuadrado_usado2.includes(3)) {
        alert("El jugador 1 es el ganador manin!");}
    else if (cuadrado_usado1.includes(3) && cuadrado_usado1.includes(5) && cuadrado_usado1.includes(7) || cuadrado_usado2.includes(1) && cuadrado_usado2.includes(2) && cuadrado_usado2.includes(3)) {
        alert("El jugador 1 es el ganador manin!");}
    
    if(cuadrado_usado2.includes(1) && cuadrado_usado2.includes(2) && cuadrado_usado2.includes(3)){
        alert("El jugador 2 es el ganador manin!");}
    else if(cuadrado_usado2.includes(1) && cuadrado_usado2.includes(4) && cuadrado_usado2.includes(7)){
        alert("El jugador 2 es el ganador manin!");}
    else if(cuadrado_usado2.includes(3) && cuadrado_usado2.includes(6) && cuadrado_usado2.includes(9)){
        alert("El jugador 2 es el ganador manin!");}
    else if(cuadrado_usado2.includes(4) && cuadrado_usado2.includes(5) && cuadrado_usado2.includes(6)){
        alert("El jugador 2 es el ganador manin!");}
    else if(cuadrado_usado2.includes(7) && cuadrado_usado2.includes(8) && cuadrado_usado2.includes(9)){
        alert("El jugador 2 es el ganador manin!");}
    else if(cuadrado_usado2.includes(2) && cuadrado_usado2.includes(5) && cuadrado_usado2.includes(8)){
        alert("El jugador 2 es el ganador manin!");}
    else if(cuadrado_usado2.includes(1) && cuadrado_usado2.includes(5) && cuadrado_usado2.includes(9)){
        alert("El jugador 2 es el ganador manin!");}
    else if(cuadrado_usado2.includes(3) && cuadrado_usado2.includes(5) && cuadrado_usado2.includes(7)){
        alert("El jugador 2 es el ganador manin!");}
}


function reiniciar(boton){
    let botonardo = document.getElementById(boton); 
    let botonardo1 = boton; 

    for (let i = 0; i < cuadrado_usado1.length; i++) {
        var id_cuadrado = document.getElementById(1);
        id_cuadrado.style.backgroundColor = null;  
    }
    for (let i = 0; i < cuadrado_usado2.length; i++) {
        var id_cuadrado = document.getElementById(i+1);
        id_cuadrado.style.backgroundColor = null;  
    }
}


//function jugar_de_nuevo(boton){}

