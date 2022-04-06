import java.util.ArrayList;

public class Hijo extends Persona{
    private String escuela;
    private String juego_favorito;

    public Hijo(String escuela, String juego_favorito) {
        this.escuela = escuela;
        this.juego_favorito = juego_favorito;
    }

    public Hijo(String nombre, int edad, int dni, int telefono, String direccion, String escuela, String juego_favorito) {
        super(nombre, edad, dni, telefono, direccion);
        this.escuela = escuela;
        this.juego_favorito = juego_favorito;

    }
}
