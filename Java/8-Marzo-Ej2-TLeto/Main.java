public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();

        p1.setEdad(p1.getEdad()*2);

        p2.setTelefono(35836182);
        System.out.println(p3.getnombre()+"  "+p3.getEdad()+"  "+p3.getdni()+"  " + p3.getTelefono()+"  "+p3.getdireccion());
    }
}
