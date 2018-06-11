import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtilidadesNullTest {
    private UtilidadesNull utils;

    @Before
    public void setUp() throws Exception {
        utils=new UtilidadesNull();
    }

    @Test
    public void damePersonaTest() {
        //Given
        // When
        Persona personaA = utils.damePersona("Carlos");
        Persona personaB = utils.damePersona("Sin nombre");

        // Then

        assertNotNull(personaA);
        assertNull(personaB);

        //assertNull("No es nulo", personaA);
        assertNotNull("Es nulo", personaB);

    }
}