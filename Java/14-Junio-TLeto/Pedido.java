import java.time.LocalDate;
import java.time.LocalDateTime;

public class Pedido {
    private int id_pedido;
    private int plato;
    private int mesa;
    private LocalDateTime fecha_pedido;

    public Pedido(int id_pedido, int plato, int mesa, LocalDateTime fecha_pedido) {
        this.id_pedido = id_pedido;
        this.plato = plato;
        this.mesa = mesa;
        this.fecha_pedido = fecha_pedido;
    }

    public Pedido() {
        this.id_pedido = 0;
        this.plato = 0;
        this.mesa = 0;
        this.fecha_pedido = LocalDateTime.now();
    }

    public int getId_pedido() {return id_pedido;}

    public void setId_pedido(int id_pedido) {this.id_pedido = id_pedido;}

    public int getPlato() {return plato;}

    public void setPlato(int plato) {this.plato = plato;}

    public LocalDateTime getFecha_pedido() {return fecha_pedido;}

    public void setFecha_pedido(LocalDateTime fecha_pedido) {this.fecha_pedido = fecha_pedido;}

    public int getMesa() {return mesa;}

    public void setMesa(int mesa) {this.mesa = mesa;}
}

