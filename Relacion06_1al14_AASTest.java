import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Relacion06_1al14_AASTest {

    @Test
    public void testEsCapicua() {
        assertTrue(Relacion06_1al14_AAS.esCapicua(121));  // Capicúa
        assertTrue(Relacion06_1al14_AAS.esCapicua(0));    // Capicúa (caso borde)
        assertFalse(Relacion06_1al14_AAS.esCapicua(123)); // No es capicúa
    }

    @Test
    public void testEsPrimo() {
        assertTrue(Relacion06_1al14_AAS.esPrimo(7));  // Primo
        assertFalse(Relacion06_1al14_AAS.esPrimo(4)); // No es primo
        assertFalse(Relacion06_1al14_AAS.esPrimo(1)); // 1 no es primo
        assertTrue(Relacion06_1al14_AAS.esPrimo(13)); // Primo
    }

    @Test
    public void testSiguientePrimo() {
        assertEquals(17, Relacion06_1al14_AAS.siguientePrimo(14)); // Siguiente primo
        assertEquals(2, Relacion06_1al14_AAS.siguientePrimo(1));   // Siguiente primo después de 1
    }

    @Test
    public void testPotencia() {
        assertEquals(9, Relacion06_1al14_AAS.potencia(3, 2));   // 3^2 = 9
        assertEquals(1, Relacion06_1al14_AAS.potencia(5, 0));   // Cualquier número elevado a 0 es 1
        assertEquals(16, Relacion06_1al14_AAS.potencia(2, 4));  // 2^4 = 16
    }

    @Test
    public void testDigitos() {
        assertEquals(3, Relacion06_1al14_AAS.digitos(123));   // 3 dígitos
        assertEquals(1, Relacion06_1al14_AAS.digitos(0));     // Caso borde: 1 dígito
        assertEquals(5, Relacion06_1al14_AAS.digitos(-54321)); // Los negativos también cuentan como 5 dígitos
    }

    @Test
    public void testVoltea() {
        assertEquals(54321, Relacion06_1al14_AAS.voltea(12345)); // Voltea correctamente
        assertEquals(-54321, Relacion06_1al14_AAS.voltea(-12345)); // Caso negativo
        assertEquals(1, Relacion06_1al14_AAS.voltea(1)); // Caso de un solo dígito
    }

    @Test
    public void testDigitoN() {
        assertEquals(3, Relacion06_1al14_AAS.digitoN(12345, 2)); // El dígito en la posición 2 es 3
        assertEquals(1, Relacion06_1al14_AAS.digitoN(54321, 4)); // El dígito en la posición 4 es 5
        assertEquals(-1, Relacion06_1al14_AAS.digitoN(12345, 10)); // Posición fuera de rango
    }

    @Test
    public void testPosicionDeDigito() {
        assertEquals(2, Relacion06_1al14_AAS.posicionDeDigito(12345, 3)); // La primera aparición de 3 es en la posición 2
        assertEquals(-1, Relacion06_1al14_AAS.posicionDeDigito(12345, 6)); // El dígito 6 no está presente
    }

    @Test
    public void testQuitaPorDetras() {
        assertEquals(12, Relacion06_1al14_AAS.quitaPorDetras(12345, 3)); // Quita los últimos 3 dígitos
        assertEquals(0, Relacion06_1al14_AAS.quitaPorDetras(123, 5)); // Si se quitan más dígitos de los que tiene, queda 0
    }

    @Test
    public void testQuitaPorDelante() {
        assertEquals(345, Relacion06_1al14_AAS.quitaPorDelante(12345, 2)); // Quita los primeros 2 dígitos
        assertEquals(0, Relacion06_1al14_AAS.quitaPorDelante(12345, 5)); // Si se quitan todos los dígitos, queda 0
    }

    @Test
    public void testPegaPorDetras() {
        assertEquals(123456, Relacion06_1al14_AAS.pegaPorDetras(12345, 6)); // Añade un dígito por detrás
    }

    @Test
    public void testPegaPorDelante() {
        assertEquals(612345, Relacion06_1al14_AAS.pegaPorDelante(12345, 6)); // Añade un dígito por delante
    }

    @Test
    public void testTrozoDeNumero() {
        assertEquals(234, Relacion06_1al14_AAS.trozoDeNumero(123456, 1, 3)); // Trozo del número de la posición 1 a la 3
        assertEquals(-1, Relacion06_1al14_AAS.trozoDeNumero(123456, 3, 1)); // Si el inicio es mayor que el fin, error
        assertEquals(-1, Relacion06_1al14_AAS.trozoDeNumero(123456, 1, 10)); // Si el fin está fuera de rango
    }

    @Test
    public void testJuntaNumeros() {
        assertEquals(123456, Relacion06_1al14_AAS.juntaNumeros(123, 456)); // Une dos números
    }
}
