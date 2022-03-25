import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        ArrayList<Persona> lista = new ArrayList<>();
        Persona p1 =new Persona();
        SistemaDeRegistroDePersonas menu = new SistemaDeRegistroDePersonas();
        menu.menu(lista);
    }
}