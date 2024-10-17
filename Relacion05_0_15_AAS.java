import java.util.Random;
import java.util.Scanner;

public class Relacion05_0_15_AAS {
    public static String asignarMesa(int[] mesas, int clientes) {
        if (clientes == -1) {
            return "Gracias por usar el sistema de asignación de mesas. ¡Hasta luego!";
        }

        if (clientes > 4) {
            return "Lo siento, no admitimos grupos de " + clientes + ". Haga grupos de 4 personas como máximo e intente de nuevo.";
        }

        boolean mesaAsignada = false;
        for (int i = 0; i < mesas.length; i++) {
            if (mesas[i] == 0) {
                mesas[i] = clientes;
                return "Por favor, siéntense en la mesa número " + (i + 1) + ".";
            }
        }

        if (!mesaAsignada) {
            for (int i = 0; i < mesas.length; i++) {
                if (mesas[i] + clientes <= 4) {
                    mesas[i] += clientes;
                    return "Tendrán que compartir mesa. Por favor, siéntense en la mesa número " + (i + 1) + ".";
                }
            }
        }

        return "Lo siento, en estos momentos no queda sitio.";
    }

    // Método para generar ocupación de mesas aleatoria
    public static int[] generarMesas() {
        Random random = new Random();
        int[] mesas = new int[10];
        for (int i = 0; i < mesas.length; i++) {
            mesas[i] = random.nextInt(5);  // Ocupación entre 0 y 4 personas
        }
        return mesas;
    }

    // Método para imprimir la ocupación de las mesas
    public static void imprimirMesas(int[] mesas) {
        System.out.println("\nMesa no    1  2  3  4  5  6  7  8  9  10");
        System.out.print("Ocupación ");
        for (int mesa : mesas) {
            System.out.print(" " + mesa + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mesas = generarMesas();

        while (true) {
            imprimirMesas(mesas);  // Imprimir la ocupación actual de las mesas

            System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
            int clientes = scanner.nextInt();

            // Llamada al método asignarMesa que contiene la lógica de asignación
            String resultado = asignarMesa(mesas, clientes);
            System.out.println(resultado);

            // Si el usuario introdujo -1, el programa termina
            if (clientes == -1) {
                break;
            }
        }

        scanner.close();
    }
}