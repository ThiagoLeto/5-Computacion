public class Persona {
    private String nombre;
    private int edad;
    private int dni;
    private int telefono;
    private String direccion;

    public Persona() {
        this.nombre = "Johnny";
        this.edad = 96;
        this.dni = 11033847;
        this.telefono = 44104321;
        this.direccion = "Constituyentes 6234";
    }

    public Persona(String nombre, int edad, int dni, int telefono, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {

        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public int getDni() {
        return this.dni;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public String getDireccion() {
        return this.direccion;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void mostrar(){
        System.out.println(this.getNombre()+"  "+this.getEdad()+"  "+this.getDni()+"  " + this.getTelefono()+"  "+this.getDireccion());
    }
}
