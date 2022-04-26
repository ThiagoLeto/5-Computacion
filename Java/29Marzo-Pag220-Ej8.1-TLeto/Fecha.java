import java.util.ArrayList;
import java.util.Scanner;

public class Fecha {
    private int año;
    private int mes;
    private int dia;
    private int nro_fecha = 0;
    private ArrayList<Fecha> fechas = new ArrayList<>();
    int suma_dia = 0, suma_mes = 0, suma_año = 0;

    public Fecha(int año, int mes, int dia) {
        this.año = año;
        this.mes = mes;
        this.dia = dia;
    }

    public Fecha() {
        this.año = 0;
        this.mes = 0;
        this.dia = 0;
    }

    public int getAño() {
        return año;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getNro_fecha() {return nro_fecha;}

    public void setNro_fecha(int nro_fecha) {this.nro_fecha = nro_fecha;}

    public void menu(){
        System.out.println("Menu:");
        System.out.println("1 Para ingresar una fecha");
        System.out.println("2 Para reiniciar una fecha");
        System.out.println("3 Para adelantar alguna fecha");
        System.out.println("4 Para mostrar las fechas ingresadas");

        Scanner eleccion_menu = new Scanner(System.in);
        int opcion = eleccion_menu.nextInt();

        switch (opcion){
            case 1: {
                ingreso();
            }
            case 2: {
                reiniciar();
            }break;
            case 3: {
                adelantar();
            }
            case 4: {
                imprimir();
            }
        }
    }

    public void ingreso(){
        Fecha f1 = new Fecha();
        System.out.println("Ingrese el dia");
        Scanner ingreso_dia = new Scanner(System.in);
        int dia = ingreso_dia.nextInt();
        System.out.println("Ingrese el mes");
        Scanner ingreso_mes = new Scanner(System.in);
        int mes = ingreso_mes.nextInt();
        System.out.println("Ingese el año");
        Scanner ingreso_año = new Scanner(System.in);
        int año = ingreso_año.nextInt();
        f1.setDia(dia);
        f1.setMes(mes);
        f1.setAño(año);
        nro_fecha++;
        f1.setNro_fecha(nro_fecha);
        fechas.add(f1);
    }

    public void reiniciar(){
        System.out.println("Ingrese el numero de fecha");
        Scanner ingreso_reiniciar = new Scanner(System.in);
        int fecha_reiniciar = ingreso_reiniciar.nextInt();

        for(int i=0; i<fechas.size(); i++){
            if(fechas.get(i).getNro_fecha()==fecha_reiniciar){
                this.dia = 0;
                this.mes = 0;
                this.año = 0;
            }
        }
    }


    public void adelantar(Fecha f1){
        System.out.println("Ingrese el numero de fecha");
        Scanner ingreso_adelantar = new Scanner(System.in);
        int fecha_adelantar = ingreso_adelantar.nextInt();

        for(int i=0; i<fechas.size(); i++){
            if(fechas.get(i).getNro_fecha()==fecha_adelantar){
                System.out.println("Ingrese la cantidad de dias que quiere sumar");
                Scanner ingreso_sumadia = new Scanner(System.in);
                suma_dia = ingreso_sumadia.nextInt();
                System.out.println("Ingrese la cantidad de meses que quiere sumar");
                Scanner ingreso_sumames = new Scanner(System.in);
                suma_mes = ingreso_sumames.nextInt();
                System.out.println("Ingrese la cantidad de años que quiere sumar");
                Scanner ingreso_sumaaño = new Scanner(System.in);
                suma_año = ingreso_sumaaño.nextInt();

                this.dia += suma_dia;
                this.mes += suma_mes;
                this.año += suma_año;

                Fecha f2 = new Fecha(this.dia, this.mes, this.año);

                fechas.set(i, f2);
            }
        }
    }

    public int Dias_mes(){
        int retornar;
        switch(this.mes) {

            case 2: retornar = 28;break;
            case 4:retornar = 30;break;
            case 6:retornar = 30;break;
            case 9:retornar = 30;break;
            case 11:retornar = 30;break;
            default: retornar = 31;break;
        };
        return retornar;
    }
    public void normalizeition () {
        boolean seguir;
        seguir = true;
        int dias_del_mes;
        dias_del_mes = this.Dias_mes();

        while (seguir) {
            normalizar_dia(dias_del_mes);
        }
        seguir = true;
        while (seguir) {
            normalizar_mesardium();
        }

    }

    public boolean normalizar_dia(int dias_del_mes) { ;if (this.dia > dias_del_mes ) {this.dia = this.dia - dias_del_mes ; this.mes +=1; return true;};return false;}

    public boolean normalizar_mesardium () {if (this.mes > 12) {this.mes = this.mes-12; this.año +=1; return true; };return false;}

    public void imprimir(){
        System.out.println("Todas las personas: ");


        for (Fecha x: fechas) {

            System.out.println("Numero de fecha: " + this.getNro_fecha() + ", dia: " + this.getDia() + ", mes: " + this.getMes() + ", año: " + this.getAño());
            System.out.println(" ");
        }


    }



}


