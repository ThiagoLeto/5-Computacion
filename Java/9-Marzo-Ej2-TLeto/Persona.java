public class Persona {
    private String nombre;
    private int edad;
    private int dni;
    private int telefono;
    private String direccion;

    public Persona(){
        this.nombre = "Nombre";
        this.edad = 0;
        this.dni = 00000000;
        this.telefono = 00000000;
        this.direccion = "Lugar 0000";
    }

    public Persona(String nombre, int edad, int dni,int telefono,String direccion){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    public String getnombre (){
        return this.nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    public int getdni(){
        return this.dni;
    }
    public int getTelefono(){
        return this.telefono;
    }

    public String getdireccion(){
        return this.direccion;
    }


    public void setnombre (String nombre){
        this.nombre=nombre;
    }

    public void setEdad(int edad){
        this.edad=edad;
    }

    public void setdni(int dni){
        this.dni=dni;
    }
    public void setTelefono(int telefono){
        this.telefono=telefono;
    }

    public void setdireccion(String direccion){
        this.direccion=direccion;
    }

    public void mostrar(){
        System.out.println("nombre: " + this.getnombre()+", edad: "+this.getEdad()+", Dni: "+this.getdni()+", Telefono: " + this.getTelefono()+", Direccion: "+this.getdireccion());
    }

    public void PersonasMayores(){
        if (this.edad >= 18){
            System.out.println("nombre: " + this.getnombre()+", edad: "+this.getEdad()+", Dni: "+this.getdni()+", Telefono: " + this.getTelefono()+", Direccion: "+this.getdireccion());
        }
    }

}