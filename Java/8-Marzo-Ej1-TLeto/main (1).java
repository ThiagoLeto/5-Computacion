
import java.util.Scanner;

public class main {

    public static void cambio(Persona p1) {

        System.out.println("Quiere cambiar algun valor?");
        System.out.println("1 para el nombre");
        System.out.println("2 para el edad");
        System.out.println("3 para el dni");
        System.out.println("4 para el telefono");
        System.out.println("5 para el direccion");
        System.out.println("6 para salir");

        Scanner ingreso9 = new Scanner(System.in);
        int opcion = ingreso9.nextInt();
        switch (opcion) {
            case 1: {
                System.out.println("Ingrese el nuevo nombre");


                Scanner ingreso10 = new Scanner(System.in);
                String direccion = ingreso10.nextLine();
                p1.setNombre(direccion);
                p1.mostrar();
                cambio(p1);
            } break;

            case 2: {
                System.out.println("Ingrese la nueva edad");


                Scanner ingreso11 = new Scanner(System.in);
                int direccion = ingreso11.nextInt();
                p1.setEdad(direccion);
                p1.mostrar();
                cambio(p1);

            } break;

            case 3: {
                System.out.println("Ingrese el nuevo dni");




                Scanner ingreso12 = new Scanner(System.in);
                int dni = ingreso12.nextInt();
                p1.setDni(dni);
                p1.mostrar();
                cambio(p1);

            } break;

            case 4: {
                System.out.println("Ingrese la nueva telefono");



                Scanner ingreso13 = new Scanner(System.in);
                int telefono = ingreso13.nextInt();
                p1.setTelefono(telefono);
                p1.mostrar();
                cambio(p1);


            } break;

            case 5: {
                System.out.println("Ingrese la nueva direccion");



                Scanner ingreso14 = new Scanner(System.in);
                String direccion = ingreso14.nextLine();
                p1.setDireccion(direccion);
                p1.mostrar();
                cambio(p1);


            } break;


            case 6: {
            } break;

        }


    }


    public static void main(String[] args) {

        System.out.println("Ingrese un nombre");
        Scanner ingreso1 = new Scanner(System.in);
        String nombre = ingreso1.nextLine();
        System.out.println("El nombre ingresado es:" + nombre);

        System.out.println("Ingrese la edad");
        Scanner ingreso2 = new Scanner(System.in);
        int edad = ingreso2.nextInt();
        System.out.println("El número ingresado es:" + edad);

        System.out.println("Ingrese un dni");
        Scanner ingreso3 = new Scanner(System.in);
        int dni = ingreso3.nextInt();
        System.out.println("El nombre ingresado es:" + dni);

        System.out.println("Ingrese un telefono");
        Scanner ingreso4 = new Scanner(System.in);
        int telefono = ingreso4.nextInt();
        System.out.println("El número ingresado es:" + telefono);

        System.out.println("Ingrese un direccion");
        Scanner ingreso5 = new Scanner(System.in);
        String direccion = ingreso5.nextLine();
        System.out.println("El nombre ingresado es:" + direccion);

        Persona p1 = new Persona();
        p1.setNombre(nombre);
        p1.setEdad(edad);
        p1.setDni(dni);
        p1.setTelefono(telefono);
        p1.setDireccion(direccion);
        p1.mostrar();

        cambio(p1);


    }
    }