public class Mesa {
    private int numero_mesa;
    private int capacidad;

    public Mesa(int numero_mesa, int capacidad) {
        this.numero_mesa = numero_mesa;
        this.capacidad = capacidad;
    }
    public Mesa() {
        this.numero_mesa = 0;
        this.capacidad = 0;
    }

    public int getNumero_mesa() { return numero_mesa; }

    public void setNumero_mesa(int numero_mesa) { this.numero_mesa = numero_mesa; }

    public int getCapacidad() { return capacidad; }

    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }
}
