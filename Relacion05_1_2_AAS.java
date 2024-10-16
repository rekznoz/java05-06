import java.util.Scanner;

public class Relacion05_1_2_AAS {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] numeros = new int[4][5];

        System.out.println("Por favor, introduzca 20 números enteros:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Número para la posición [" + i + "][" + j + "]: ");
                numeros[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nHoja de cálculo con sumas parciales:");
        mostrarMatrizConSumas(numeros);

        sc.close();
    }

    public static void mostrarMatrizConSumas(int[][] matriz) {
        int sumaTotal = 0;

        for (int[] ints : matriz) {
            int sumaFila = sumarFila(ints);
            sumaTotal += sumaFila;
            for (int anInt : ints) {
                System.out.printf("%5d ", anInt);
            }
            System.out.printf("|%5d\n", sumaFila);
        }

        System.out.println("----------------------------");

        for (int j = 0; j < matriz[0].length; j++) {
            int sumaColumna = sumarColumna(matriz, j);
            sumaTotal += sumaColumna;
            System.out.printf("%5d ", sumaColumna);
        }

        System.out.printf("|%5d\n", sumaTotal);
    }

    public static int sumarFila(int[] fila) {
        int suma = 0;
        for (int num : fila) {
            suma += num;
        }
        return suma;
    }

    public static int sumarColumna(int[][] matriz, int columna) {
        int suma = 0;
        for (int[] fila : matriz) {
            suma += fila[columna];
        }
        return suma;
    }
}
