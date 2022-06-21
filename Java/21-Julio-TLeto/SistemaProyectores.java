import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class SistemaProyectores {
    private HashMap<Fecha,Personas> fechasXpersonas;
    private HashSet<Fecha> fechas;
    private HashSet<Personas> personas;

    public HashMap<Fecha, Personas> getFechasXpersonas() {
        return fechasXpersonas;
    }

    public void setFechasXpersonas(HashMap<Fecha, Personas> fechasXpersonas) {
        this.fechasXpersonas = fechasXpersonas;
    }

    public boolean guardar(Fecha reservacion, Personas reservador) {
        if(fechasXpersonas.size()>0){
        if (!fechasXpersonas.containsKey(reservacion.getReserva())) {
            fechasXpersonas.put(reservacion, reservador);
            return true;
        } else {
            if (reservador.getPrioridad() > fechasXpersonas.get(reservacion).getPrioridad()) {
                fechasXpersonas.put(reservacion, reservador);return true;
            }
        }
    }return false;
    }
}
