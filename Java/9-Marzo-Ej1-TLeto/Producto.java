public class Producto {
    private String nombre;
    private float precio;

    public void Registro (String nombre, float precio) {

        this.nombre = nombre;
        this.precio = precio;
    }


    public float Importe_pagar () {
        return this.precio;
    }
}
