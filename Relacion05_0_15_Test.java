import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Relacion05_0_15_Test {
    @Test
    public void testAsignarMesaClienteIndividual() {
        int[] mesas = {0, 2, 4, 0, 0, 1, 0, 0, 3, 4};
        String resultado = Relacion05_0_15_AAS.asignarMesa(mesas, 1);
        assertEquals("Por favor, siéntense en la mesa número 1.", resultado);
    }

    @Test
    public void testAsignarMesaGrupoGrande() {
        int[] mesas = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        String resultado = Relacion05_0_15_AAS.asignarMesa(mesas, 5);
        assertEquals("Lo siento, no admitimos grupos de 5. Haga grupos de 4 personas como máximo e intente de nuevo.", resultado);
    }

    @Test
    public void testAsignarMesaSinEspacio() {
        int[] mesas = {4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
        String resultado = Relacion05_0_15_AAS.asignarMesa(mesas, 2);
        assertEquals("Lo siento, en estos momentos no queda sitio.", resultado);
    }

    @Test
    public void testCompartirMesa() {
        int[] mesas = {4, 3, 4, 2, 3, 1, 2, 1, 3, 4};
        String resultado = Relacion05_0_15_AAS.asignarMesa(mesas, 1);
        assertEquals("Tendrán que compartir mesa. Por favor, siéntense en la mesa número 2.", resultado);
    }

    @Test
    public void testSalirPrograma() {
        int[] mesas = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        String resultado = Relacion05_0_15_AAS.asignarMesa(mesas, -1);
        assertEquals("Gracias por usar el sistema de asignación de mesas. ¡Hasta luego!", resultado);
    }

    @Test
    public void testMesaAsignadaCorrectamente() {
        int[] mesas = {0, 0, 4, 0, 0, 4, 0, 2, 0, 0};
        Relacion05_0_15_AAS.asignarMesa(mesas, 2);
        assertEquals(2, mesas[0]);  // Comprobar que se asignó a la primera mesa libre
    }
}
