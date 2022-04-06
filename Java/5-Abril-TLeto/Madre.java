import java.util.ArrayList;

public class Madre extends Persona{
    private String empresa;
    private ArrayList <Hijo> hijos = new ArrayList<>();

    public Madre(String empresa, ArrayList<Hijo> hijos) {
        this.empresa = empresa;
        this.hijos = hijos;
    }

    public Madre(String nombre, int edad, int dni, int telefono, String direccion, String empresa, ArrayList<Hijo> hijos) {
        super(nombre, edad, dni, telefono, direccion);
        this.empresa = empresa;
        this.hijos = hijos;
    }

    public ArrayList <Hijo> menores(){
        ArrayList<Hijo>hijos_menores = new ArrayList<>();
        for (Hijo x: this.hijos
             ) {
            if(x.getEdad()<18) { hijos_menores.add(x); }
        }
    return hijos_menores;
    }
}
