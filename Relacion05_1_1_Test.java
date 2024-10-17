import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Relacion05_1_1_AASTest {

    @Test
    public void testImprimirMatriz() {
        int[][] num = {
                {0, 30, 2, 0, 0, 5},
                {75, 0, 0, 0, 0, 0},
                {0, 0, -2, 9, 0, 11}
        };

        String resultadoEsperado =
                "Array num      Columna 0   Columna 1   Columna 2   Columna 3   Columna 4   Columna 5\n" +
                        "  Fila 0          0           30           2           0           0           5      \n" +
                        "  Fila 1          75           0           0           0           0           0      \n" +
                        "  Fila 2          0           0           -2           9           0           11      \n";
        assertEquals(resultadoEsperado, Relacion05_1_1_AAS.imprimirMatriz(num));
    }
}
