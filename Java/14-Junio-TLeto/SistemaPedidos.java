import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SistemaPedidos {
    private ArrayList<Plato> platos;
    private ArrayList<Mesa> mesas;
    private ArrayList<Pedido> pedidos;

    public SistemaPedidos(ArrayList<Plato> platos, ArrayList<Mesa> mesas, ArrayList<Pedido> pedidos) {
        this.platos = platos;
        this.mesas = mesas;
        this.pedidos = pedidos;
    }

    public SistemaPedidos() {
        this.platos = new ArrayList<>();
        this.mesas = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(ArrayList<Plato> platos) {
        this.platos = platos;
    }

    public ArrayList<Mesa> getMesas() {
        return mesas;
    }

    public void setMesas(ArrayList<Mesa> mesas) {
        this.mesas = mesas;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void plato_del_dia(){
        LocalDate fecha = LocalDate.now();
        LocalTime hora = LocalTime.of(0,0,0);
        LocalDateTime principioDeDia = LocalDateTime.of(fecha, hora);
        //ArrayList<Integer> lista_platos = new ArrayList<>();
        HashMap <Integer , Integer> map_platos = new HashMap<>();
        Integer mayor = -1, plato_vendidisimo = 0, plato_vendidisimont = 0;
        Integer nuevoMayor = 0, menor = 1000, nuevoMenor = 0;


        for (Pedido pedido : pedidos) {
            if(pedido.getFecha_pedido().isAfter(principioDeDia)){
                int platu = pedido.getPlato();
                Integer valor_platos = 0;

                if (map_platos.containsKey(platu)){
                    valor_platos = map_platos.get(platu);
                    valor_platos++;
                    map_platos.put(platu, valor_platos);
                }
                else{
                    valor_platos++;
                    map_platos.put(platu, valor_platos);
                }

            }
        }
        for (Map.Entry<Integer, Integer> entry : map_platos.entrySet()) {
            nuevoMayor = entry.getValue();
            if (nuevoMayor > mayor){
                mayor = nuevoMayor;
                plato_vendidisimo = entry.getKey();
            }
        }
        for (Map.Entry<Integer, Integer> entry : map_platos.entrySet()) {
            nuevoMenor = entry.getValue();
            if (nuevoMenor < menor){
                menor = nuevoMenor;
                plato_vendidisimont = entry.getKey();
            }
        }
        System.out.println("Ingrese 1 para ver el plato mas vendido");
        System.out.println("Ingrese 2 para ver el plato menos vendido");
        Scanner ingreso_masMenos = new Scanner(System.in);
        int masMenos = ingreso_masMenos.nextInt();
        switch (masMenos){
            case 1: {
                System.out.println("El plato mas vendido es el numero: " + plato_vendidisimo + ",  fue vendido: " + mayor);
            }break;
            case 2: {
                System.out.println("El plato menos vendido es el numero: " + plato_vendidisimont + ",  fue vendido: " + menor);
            }
        }

    }

}

