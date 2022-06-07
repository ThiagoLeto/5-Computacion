function cambiar(boton){
    var cuadrado = document.getElementById(boton);
    for (let i = 0; i < 10; i++) {
        var messi=11;
        messi=messi%2;
       
        if(messi==0){
            cuadrado.style.backgroundColor = "orange";
        }
        else if(messi==1){
            cuadrado.style.backgroundColor = "green";
        }    
    }
}
