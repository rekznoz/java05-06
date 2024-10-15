public class Relacion05_1_1_AAS {
    public static void main(String[] args) {
        int[][] num = {
                {0, 30, 2, 0, 0, 5},
                {75, 0, 0, 0, 0, 0},
                {0, 0, -2, 9, 0, 11}
        };
        System.out.println("Array num      Columna 0   Columna 1   Columna 2   Columna 3   Columna 4   Columna 5");
        for (int i = 0; i < num.length; i++) {
            System.out.print("  Fila " + i + "     ");

            for (int j = 0; j < num[i].length; j++) {
                System.out.print("     " + num[i][j] + "      ");
            }
            System.out.println();
        }
    }
}