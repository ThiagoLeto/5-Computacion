import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaDeRegistroDePersonas{

    private ArrayList registro = new ArrayList<>();

    public  void menu_modificar(Persona p1) {

        System.out.println(" Menu de persona   ");
        System.out.println("1 para el nombre");
        System.out.println("2 para el edad");
        System.out.println("3 para el dni");
        System.out.println("4 para el telefono");
        System.out.println("5 para el direccion");
        System.out.println("6 para volver al menu principal");

        Scanner ingreso9 = new Scanner(System.in);
        int opcion = ingreso9.nextInt();
        switch (opcion) {
            case 1: {
                System.out.println("Ingrese el nuevo nombre");

                Scanner ingreso10 = new Scanner(System.in);
                String direccion = ingreso10.nextLine();
                p1.setnombre(direccion);
                p1.mostrar();
                menu_modificar(p1);
            } break;

            case 2: {
                System.out.println("Ingrese la nueva edad");

                Scanner ingreso11 = new Scanner(System.in);
                int direccion = ingreso11.nextInt();
                p1.setEdad(direccion);
                p1.mostrar();
                menu_modificar(p1);

            } break;

            case 3: {
                System.out.println("Ingrese el nuevo dni");

                Scanner ingreso12 = new Scanner(System.in);
                int dni = ingreso12.nextInt();
                p1.setdni(dni);
                p1.mostrar();
                menu_modificar(p1);

            } break;

            case 4: {
                System.out.println("Ingrese la nueva telefono");

                Scanner ingreso13 = new Scanner(System.in);
                int telefono = ingreso13.nextInt();
                p1.setTelefono(telefono);
                p1.mostrar();
                menu_modificar(p1);


            } break;

            case 5: {
                System.out.println("Ingrese la nueva direccion");

                Scanner ingreso14 = new Scanner(System.in);
                String direccion = ingreso14.nextLine();
                p1.setdireccion(direccion);
                p1.mostrar();
                menu_modificar(p1);


            } break;


            case 6: {
                System.out.println("bye!");
            } break;

        }


    }


    public  void menu(ArrayList<Persona> lista) {

        System.out.println("    Menu    ");
        System.out.println("1 para agregar");
        System.out.println("2 para eliminar");
        System.out.println("3 para modificar datos ");
        System.out.println("4 para ver las personas que son mayor de edad");
        System.out.println("5 para ver todos");
        System.out.println("6 para salir");


        Scanner ingreso9 = new Scanner(System.in);
        int opcion = ingreso9.nextInt();
        switch (opcion) {
            case 1: {
                Persona p1 = new Persona();

                menu_modificar(p1);
                lista.add(p1);
                menu(lista);
            } break;

            case 2: {
                System.out.println("Ingrese el dni de la persona que quiere eliminar");


                Scanner ingreso11 = new Scanner(System.in);
                int dni_borrar = ingreso11.nextInt();

                for(int i=0;i<lista.size();i=i+1){if(lista.get(i).getdni()==dni_borrar){lista.remove(i);i=lista.size();} }
                menu(lista);
            } break;

            case 3: {
                System.out.println("Ingrese el dni de la persona que quiere modificar");


                Scanner ingreso12 = new Scanner(System.in);
                int dni = ingreso12.nextInt();

                for(int i=0;i<lista.size();i=i+1){if(lista.get(i).getdni()==dni){menu_modificar(lista.get(i));} }

                menu(lista);
            } break;

            case 4: {
                System.out.println("Personas mayores: ");


                for (Persona x: lista
                ) {

                    x.PersonasMayores();
                    System.out.println(" ");
                }
                menu(lista);
            } break;

            case 5: {
                System.out.println("Todas las personas: ");


                for (Persona x: lista
                ) {

                    x.mostrar();
                    System.out.println(" ");
                }
                menu(lista);

            } break;



            case 6: {
                System.out.println("bye!");
            } break;

        }

    }


}