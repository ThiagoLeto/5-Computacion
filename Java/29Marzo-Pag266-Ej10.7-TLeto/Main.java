import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int col,fil;
        col=3;
        fil = 5;

        int matriz [][] = new int [col][fil] ;

        int matriz_transpuesta [][] = new int [fil] [col];

        int matriz_aux[][] = {
                {4,7,1,3,5},
                {2,0,6,9,7},
                {3,1,2,6,4}
        };
        matriz = matriz_aux;

        for (int i = 0; i < col ; i++) {

            for (int j = 0; j < fil ; j++) {
                matriz_transpuesta[j][i] = matriz[i][j];
            }
        }
        for (int h = 0; h < fil ; h++) {
            System.out.println("/ /");
            for (int l = 0; l < col ; l++) {
                System.out.println(matriz_transpuesta[h][l]);
            }
        }

    }
}
