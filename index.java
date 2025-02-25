# Matriz_Ale

import java.util.Random;

public class MatrizAleatoria {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        Random random = new Random();
        
        // Preenchendo a matriz com números aleatórios e imprimindo
        System.out.println("Matriz:");
        for (int i = 0; i < 5; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = random.nextInt(100) + 1;
                somaLinha += matriz[i][j];
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(" | Soma: " + somaLinha);
        }
    }
}
