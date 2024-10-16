import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Relacion05_1_2_Test {

    @Test
    public void testSumarFila() {
        int[] fila = {5, 10, 15, 20, 25};
        int resultado = Relacion05_1_2_AAS.sumarFila(fila);
        assertEquals(75, resultado);  // La suma esperada es 75
    }

    @Test
    public void testSumarColumna() {
        int[][] matriz = {
                {5, 10, 15, 20, 25},
                {30, 35, 40, 45, 50},
                {55, 60, 65, 70, 75},
                {80, 85, 90, 95, 100}
        };

        int resultado = Relacion05_1_2_AAS.sumarColumna(matriz, 0);
        assertEquals(170, resultado);

        resultado = Relacion05_1_2_AAS.sumarColumna(matriz, 1);
        assertEquals(190, resultado);
    }
}
