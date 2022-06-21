public class Plato {
    private int numero_plato;
    private String nombre_plato;
    private int precio;

    public Plato(int numero_plato, String nombre_plato, int precio) {
        this.numero_plato = numero_plato;
        this.nombre_plato = nombre_plato;
        this.precio = precio;
    }
    public Plato() {
        this.numero_plato = 0;
        this.nombre_plato = "nombre_plato";
        this.precio = 0;
    }

    public int getNumero_plato() {return numero_plato;}

    public void setNumero_plato(int numero_plato) {this.numero_plato = numero_plato;}

    public String getNombre_plato() {return nombre_plato;}

    public void setNombre_plato(String nombre_plato) {this.nombre_plato = nombre_plato;}

    public int getPrecio() {return precio;}

    public void setPrecio(int precio) {this.precio = precio;}
}
