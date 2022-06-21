import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    static int numero_pedido = 0;
    static HashSet<Plato> platos = new HashSet<>();
    static HashSet<Mesa> mesas = new HashSet<>();
    static HashSet<Pedido> pedidos = new HashSet<>();

    static SistemaPedidos sistemaso = new SistemaPedidos();


    public static void menu(){
        System.out.println("");
        System.out.println("MENU: ");
        System.out.println("Presione 1, para ingresar una nueva mesa");
        System.out.println("Presione 2, para ingresar un nuevo plato");
        System.out.println("Presione 3, para ingresar su pedido");
        System.out.println("Presione 4, para ver nuevas opciones");
        System.out.println("Presione 5, para ver las mesas, platos y pedidos ya hechos");
        System.out.println("Presione 6, para salir");
        System.out.println("");
    }

    public static  void agregar_mesa(){
        System.out.println("Ingrese el numero de mesa");
        Scanner ingreso_numero = new Scanner(System.in);
        int numero_mesa = ingreso_numero.nextInt();
        System.out.println("Ingrese la capacidad de la mesa");
        Scanner ingreso_capacidad = new Scanner(System.in);
        int capacidad = ingreso_capacidad.nextInt();

        Mesa mesa = new Mesa(numero_mesa, capacidad);

        mesas.add(mesa);
        sistemaso.getMesas().add(mesa);
    }

    public static void agregar_plato(){
        System.out.println("Ingrese el numero del plato");
        Scanner ingreso_numero = new Scanner(System.in);
        int numero_plato = ingreso_numero.nextInt();
        System.out.println("Ingrese el nombre del plato");
        Scanner ingreso_nombre = new Scanner(System.in);
        String nombre_plato = ingreso_nombre.nextLine();
        System.out.println("Ingrese el precio del plato");
        Scanner ingreso_precio = new Scanner(System.in);
        int precio_plato = ingreso_precio.nextInt();

        Plato plato = new Plato(numero_plato,nombre_plato,precio_plato);

        platos.add(plato);
        sistemaso.getPlatos().add(plato);
    }

    public static void agregar_pedido(){
        numero_pedido++;
        System.out.println("Ingrese el numero del plato pedido");
        Scanner ingreso_plato = new Scanner(System.in);
        int pedido_plato = ingreso_plato.nextInt();
        System.out.println("Ingrese el numero de mesa");
        Scanner ingreso_mesa = new Scanner(System.in);
        int pedido_mesa = ingreso_mesa.nextInt();

        LocalDateTime entregado = LocalDateTime.now();

        Pedido pedido = new Pedido(numero_pedido, pedido_plato, pedido_mesa, entregado);
        pedidos.add(pedido);
        sistemaso.getPedidos().add(pedido);
    }

    public static void mostrar(){
        System.out.println("Platos: ");
        for (Plato cadaplato : platos) {
            System.out.println("Numero del plato: " + cadaplato.getNumero_plato() + ",  Nombre del plato: " + cadaplato.getNombre_plato() + ",  Precio: " + cadaplato.getPrecio());
        }
        System.out.println("Mesas: ");
        for (Mesa cadamesa:mesas) {
            System.out.println("Numero de mesa: " + cadamesa.getNumero_mesa() + ",  Capacidad: " + cadamesa.getCapacidad());
        }
        System.out.println("Pedidos: ");
        for (Pedido cadapedido:pedidos) {
            System.out.println("Id del pedido: " + cadapedido.getId_pedido() + ",  Fecha del pedido: " + cadapedido.getFecha_pedido() + ",  Mesa en donde fue recibido: " + cadapedido.getMesa() + ",  Plato pedido: " + cadapedido.getPlato());
        }
    }


    public static void main(String[] args) {
        Plato plato1 = new Plato(1,"Milanesa con puré de papas", 950);
        Plato plato2 = new Plato(2,"Ravioles rellenos con carne", 800);
        Plato plato3 = new Plato(3,"Pizza a la Piedra", 1000);
        Plato plato4 = new Plato(4,"Polenta con salsa Fileto", 700);
        Plato plato5 = new Plato(5,"Arroz primavera", 700);
        platos.add(plato1);
        platos.add(plato2);
        platos.add(plato3);
        platos.add(plato4);
        platos.add(plato5);
        Mesa mesa1 = new Mesa(1 , 4);
        Mesa mesa2 = new Mesa(2 , 4);
        Mesa mesa3 = new Mesa(3 , 2);
        Mesa mesa4 = new Mesa(4 , 8);
        Mesa mesa5 = new Mesa(5 , 6);
        mesas.add(mesa1);
        mesas.add(mesa2);
        mesas.add(mesa3);
        mesas.add(mesa4);
        mesas.add(mesa5);

        Boolean terminar = false;
        while(terminar == false){
            menu();
            Scanner ingreso_opcion = new Scanner(System.in);
            int opcion = ingreso_opcion.nextInt();

            switch (opcion){
                case 1:{
                    agregar_mesa();
                } break;
                case 2: {
                    agregar_plato();
                } break;
                case 3:{
                    agregar_pedido();
                } break;
                case 4:{
                    System.out.println("");
                    System.out.println("Nuevas opciones: ");
                    System.out.println("Ingrese 1 para ver el plato mas pedido del dia");
                    Scanner ingreso_case4 = new Scanner(System.in);
                    int opcion_case4 = ingreso_case4.nextInt();
                    switch (opcion_case4){
                        case 1: {
                            sistemaso.plato_del_dia();
                            System.out.println("");
                        }break;
                    }break;
                }
                case 5:{
                    mostrar();
                } break;
                case 6:{
                    terminar = true;
                } break;
            }
        }
    }

}
