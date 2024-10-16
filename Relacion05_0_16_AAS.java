import java.util.Random;

public class Relacion05_0_16_AAS {

    // Devuelve un string del array generado
    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int num : array) {
            sb.append(num).append(" ");
        }
        return sb.toString().trim();  // Se quitan espacios extra al final
    }

    // Devuelve un string del array con los números resaltados
    public static String arrayResaltadoToString(int[] array, int opcion) {
        StringBuilder sb = new StringBuilder();
        for (int num : array) {
            if ((opcion == 1 && num % 5 == 0) || (opcion == 2 && num % 7 == 0)) {
                sb.append("[").append(num).append("] ");
            } else {
                sb.append(num).append(" ");
            }
        }
        return sb.toString().trim();  // Se quitan espacios extra al final
    }

    // Genera un array de números aleatorios
    public static int[] generarArray() {
        int[] numeros = new int[20];
        Random rand = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(401);
        }
        return numeros;
    }

    // Valida si un número es múltiplo de 5
    public static boolean esMultiploDe5(int num) {
        return num % 5 == 0;
    }

    // Valida si un número es múltiplo de 7
    public static boolean esMultiploDe7(int num) {
        return num % 7 == 0;
    }

    public static void main(String[] args) {

        // Generar array
        int[] numeros = generarArray();

        // Mostrar el array generado
        System.out.println("Array generado:");
        System.out.println(arrayToString(numeros));

        // Escoger opción del usuario (1 o 2)
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("¿Qué números quiere resaltar? (1 - los múltiplos de 5, 2 - los múltiplos de 7): ");
        int opcion = sc.nextInt();

        // Mostrar array resaltado
        System.out.println("Array con los números resaltados:");
        System.out.println(arrayResaltadoToString(numeros, opcion));

        sc.close();
    }
}
