import java.util.Random;
import java.util.Scanner;

public class Relacion05_0_15_AAS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] mesas = new int[10];

        for (int i = 0; i < mesas.length; i++) {
            mesas[i] = random.nextInt(5);
        }

        while (true) {
            System.out.println("\nMesa no    1  2  3  4  5  6  7  8  9  10");
            System.out.print("Ocupación ");
            for (int mesa : mesas) {
                System.out.print(" " + mesa + " ");
            }
            System.out.println();

            System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
            int clientes = scanner.nextInt();
            if (clientes == -1) {
                System.out.println("Gracias por usar el sistema de asignación de mesas. ¡Hasta luego!");
                break;
            }
            if (clientes > 4) {
                System.out.println("Lo siento, no admitimos grupos de " + clientes + ". Haga grupos de 4 personas como máximo e intente de nuevo.");
                continue;
            }

            boolean mesaAsignada = false;
            for (int i = 0; i < mesas.length; i++) {
                if (mesas[i] == 0) {
                    mesas[i] = clientes;
                    System.out.println("Por favor, siéntense en la mesa número " + (i + 1) + ".");
                    mesaAsignada = true;
                    break;
                }
            }

            if (!mesaAsignada) {
                for (int i = 0; i < mesas.length; i++) {
                    if (mesas[i] + clientes <= 4) {
                        mesas[i] += clientes;
                        System.out.println("Tendrán que compartir mesa. Por favor, siéntense en la mesa número " + (i + 1) + ".");
                        mesaAsignada = true;
                        break;
                    }
                }
            }

            if (!mesaAsignada) {
                System.out.println("Lo siento, en estos momentos no queda sitio.");
            }
        }
    }
}