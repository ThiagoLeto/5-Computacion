import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    static SistemaProyectores sistemaso = new SistemaProyectores();

    public static void menu(){
        System.out.println("");
        System.out.println("MENU: ");
        System.out.println("Presione 1, para ingresar una nueva reserva");
        System.out.println("Presione 2, para mostrar las reservaciones");
        System.out.println("Presione 3, para salir");
        System.out.println("");
    }

    public static  void reservar(){

        System.out.println("Ingrese la fecha de la reserva");
        System.out.println("Ingrese el año");
        Scanner ingreso_año = new Scanner(System.in);
        int año = ingreso_año.nextInt();
        System.out.println("Ingrese el mes");
        Scanner ingreso_mes = new Scanner(System.in);
        int mes = ingreso_mes.nextInt();
        System.out.println("Ingrese el dia");
        Scanner ingreso_dia = new Scanner(System.in);
        int dia = ingreso_dia.nextInt();
        System.out.println("Ingrese el bloque");
        Scanner ingreso_bloque = new Scanner(System.in);
        int bloque = ingreso_bloque.nextInt();

        LocalDate crearFecha = LocalDate.of(año,mes,dia);
        Fecha fecha = new Fecha(crearFecha, bloque);

        System.out.println(" ");
        System.out.println("Ingrese el status del reservador:");
        Scanner ingreso_status= new Scanner(System.in);
        String status = ingreso_status.nextLine();
        System.out.println("Ingrese el nombre del reservador:");
        Scanner ingreso_nombre = new Scanner(System.in);
        String nombre = ingreso_nombre.nextLine();
        System.out.println("Ingrese el dni del reservador");
        Scanner ingreso_dni = new Scanner(System.in);
        int dni = ingreso_dni.nextInt();
        System.out.println("Ingrese la prioridad de la persona:");
        Scanner ingreso_prioridad = new Scanner(System.in);
        int prioridad = ingreso_prioridad.nextInt();

        Personas persona =  new Personas(status, nombre, dni, prioridad);

        sistemaso.guardar(fecha, persona);
    }

    public static void mostrar(){
        System.out.println("Los vakires sonso: " + sistemaso.getFechasXpersonas());
    }
    public static void main(String[] args){
        boolean jorge = true;
        while(jorge){
            menu();
            Scanner ingreso_menu = new Scanner(System.in);
            int menu = ingreso_menu.nextInt();
            switch (menu){
                case 1: {
                    reservar();
                }break;
                case 2: {
                    mostrar();
                }break;
                case 3: {
                    jorge = !jorge; //bro
                }break;
            }
        }

    }
}
