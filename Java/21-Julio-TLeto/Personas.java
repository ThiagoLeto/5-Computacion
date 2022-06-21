public class Personas {
    private String status;
    private String nombre;
    private int dni;
    private int prioridad;

    public Personas(String status, String nombre, int dni,int prioridad) {
        this.status = status;
        this.nombre = nombre;
        this.dni = dni;
        if(status=="alumno"){this.prioridad=0;}
        else{this.prioridad=prioridad;}

    }
    public Personas() {
        this.status = "status";
        this.nombre = "nombre";
        this.dni = 0;
        this.prioridad=0;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
}
