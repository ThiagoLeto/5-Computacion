import java.time.LocalDate;

public class Fecha {
    private LocalDate reserva;
    private int bloque;

    public Fecha(LocalDate reserva, int bloque) {
        this.reserva = reserva;
        this.bloque = bloque;
    }
    public Fecha() {
        this.reserva = LocalDate.now();
        this.bloque = 0;
    }

    public LocalDate getReserva() {
        return reserva;
    }

    public void setReserva(LocalDate reserva) {
        this.reserva = reserva;
    }

    public int getBloque() {
        return bloque;
    }

    public void setBloque(int bloque) {
        this.bloque = bloque;
    }
}
