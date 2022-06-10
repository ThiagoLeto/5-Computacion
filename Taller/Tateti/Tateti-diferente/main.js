let cont=0;
let cuadrado=null;
let cuadrado1 = null;
const cuadrado_usado1 = [];
const cuadrado_usado2 = [];

function cambiar(boton){
    cont++;
    cuadrado = document.getElementById(boton); //tiene el objeto de html
    cuadrado1=boton;  //tiene el numero de id
    let usado = false;

    
    for (let i = 0; i < cuadrado_usado1[cuadrado_usado1.length-1]; i++) {
        
        if(cuadrado_usado1[i] == cuadrado1){
            usado=true;
            //console.log('llegue manin');  
        }
    }
   
    let cont1 = cont%2;
    if(cont1==0 && usado == false){
        cuadrado.style.backgroundColor = "orange";  
        //console.log('par');
        cuadrado_usado1.push(boton);
    }
    else if(cont1==1 && usado == false){
        cuadrado.style.backgroundColor = "#31363a";      
        //console.log('impar');
        cuadrado_usado2.push(boton);
    }

    console.log("Naranjas manin  "+cuadrado_usado1);
    console.log("Negros manito  "+cuadrado_usado2);

}
