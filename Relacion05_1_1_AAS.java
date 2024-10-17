public class Relacion05_1_1_AAS {
        public static String imprimirMatriz(int[][] num) {
            StringBuilder sb = new StringBuilder();
            sb.append("Array num      Columna 0   Columna 1   Columna 2   Columna 3   Columna 4   Columna 5\n");
            for (int i = 0; i < num.length; i++) {
                sb.append("  Fila ").append(i).append("     ");
                for (int j = 0; j < num[i].length; j++) {
                    sb.append("     ").append(num[i][j]).append("      ");
                }
                sb.append("\n");
            }
            return sb.toString();
        }

        public static void main(String[] args) {
            int[][] num = {
                    {0, 30, 2, 0, 0, 5},
                    {75, 0, 0, 0, 0, 0},
                    {0, 0, -2, 9, 0, 11}
            };
            System.out.print(imprimirMatriz(num));
        }
}