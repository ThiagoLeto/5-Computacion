public class Main {
    public static void main(String[] args) {
        int suma;
        suma = 0;

        int matriz_org[][] = {{4,7,-5,4,9},{0,3,-2,6,-2},{1,2,4,1,1},{6,1,0,3,-4} } ;

        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <5 ; j++) {
                if (i!=j) {suma += matriz_org[i][j];}

            }
        }
        System.out.println("Resultado:");
        System.out.println(suma);

    }
}