import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

public class main {
    public static void menu(ArrayList<Producto> Array_productos){


        System.out.println("Opciones");
        System.out.println("1 Registro de Producto");
        System.out.println("2 Importe parcial");
        System.out.println("3 Finalizar registro");


        Scanner ingreso1 = new Scanner(System.in);
        int opcion1 = ingreso1.nextInt();
        switch (opcion1) {
                case 1: {
                    Registro_de_producto(Array_productos);
                    menu(Array_productos);
                }  break;

                case 2: {
                    System.out.println("Importe parcial");
                    System.out.println(Importe_pagar(Array_productos));
                    menu(Array_productos);
                } break;

                case 3: {
                    System.out.println("Importe total ");
                    System.out.println(Importe_pagar(Array_productos));
                } break;

            }

        }



    public static void Registro_de_producto(ArrayList<Producto> Array_productos) {
        Producto p1 = new Producto();
        System.out.println("Ingrese el nombre");
        Scanner ingresoNombre = new Scanner(System.in);
        String nombre = ingresoNombre.nextLine();

        System.out.println("Ingrese el precio");
        Scanner ingresoPrecio = new Scanner(System.in);
        Float precio = ingresoPrecio.nextFloat();

        p1.Registro(nombre, precio);
        Array_productos.add(p1);
    }

    public static float Importe_pagar (ArrayList<Producto> Array_productos) {
         float suma; suma = 0;
        for ( int i = 0; i < Array_productos.size(); i = i + 1) {
            suma = Array_productos.get(i).Importe_pagar() + suma ;}
        return suma;
    }



    public static void main(String[] args) {
        ArrayList <Producto> Array_de_registros = new ArrayList<>();
        menu(Array_de_registros);

    }
}
