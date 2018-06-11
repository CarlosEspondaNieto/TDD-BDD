import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtilidadesSameTest {

    private UtilidadesSame utils;

    @Before
    public void setUp() throws Exception {
        utils = new UtilidadesSame();
    }

    @Test
    public void testSame() {
        // Given
        Persona p = new Persona("Carlos", "Esponda");

        //When
        Persona resultado = utils.devuelveObjeto(p);

        //Then
        Assert.assertSame(p, resultado); // assertSame se refiere a que un objeto tenga una misma ubicación de memoria.
        Assert.assertEquals(p, resultado);
    }

    @Test
    public void testNotSame() {
        // Given
        Persona p = new Persona("Lorde", "Yelich");

        //When
        Persona resultado = utils.devuelveObjeto(p);

        //Then
        Assert.assertNotSame(p, resultado); // assertSame se refiere a que un objeto tenga una misma ubicación de memoria.
        Assert.assertNotEquals(p, resultado);
    }

    @Test
    public void testNotSame2() {
        // Given
        Persona p = new Persona("Patti", "Smith");

        //When
        Persona resultado = utils.devuelveObjeto(p);

        //Then
        Assert.assertNotSame(p, resultado); // assertSame se refiere a que un objeto tenga una misma ubicación de memoria.
        Assert.assertEquals(p, resultado);
    }
}