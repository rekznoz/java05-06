import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Relacion05_0_16_Test {

    @Test
    public void testArrayToString() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals("1 2 3 4 5", Relacion05_0_16_AAS.arrayToString(array));
    }

    @Test
    public void testArrayResaltadoToString_MultiploDe5() {
        int[] array = {10, 7, 20, 14, 5};
        assertEquals("[10] 7 [20] 14 [5]", Relacion05_0_16_AAS.arrayResaltadoToString(array, 1));
    }

    @Test
    public void testArrayResaltadoToString_MultiploDe7() {
        int[] array = {10, 7, 20, 14, 5};
        assertEquals("10 [7] 20 [14] 5", Relacion05_0_16_AAS.arrayResaltadoToString(array, 2));
    }

    @Test
    public void testEsMultiploDe5() {
        assertTrue(Relacion05_0_16_AAS.esMultiploDe5(10));
        assertFalse(Relacion05_0_16_AAS.esMultiploDe5(7));
    }

    @Test
    public void testEsMultiploDe7() {
        assertTrue(Relacion05_0_16_AAS.esMultiploDe7(14));
        assertFalse(Relacion05_0_16_AAS.esMultiploDe7(10));
    }
}
