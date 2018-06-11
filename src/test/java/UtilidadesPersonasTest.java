import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtilidadesPersonasTest {
    private UtilidadesPersonas utils;

    @Before
    public void setUp() throws Exception {
    utils = new UtilidadesPersonas();
    }

    @Test
    public void getCarlos() throws Exception{

        // Given

        // when
        Persona carlos = utils.getCarlos();

        //Then
        assertEquals("error, diferente nombre","Carlos", carlos.getNombre());
        assertEquals("error, diferente nombre","Carlos", utils.getCarlos().getNombre());
        assertEquals("error, diferente apellido","Romero", carlos.getApellido());

    }

    @Test
    public void getJuan() {
        // Given

        // when
        Persona juan = utils.getJuan();

        //Then
        Assert.assertEquals("error, diferente nombre","Juan", juan.getNombre());
        Assert.assertEquals("error, diferente apellido","López", juan.getApellido());

    }

    @Test
    public void personasDiferentesTest(){
        Persona carlos = utils.getCarlos();
        Persona juan = utils.getJuan();
        assertNotEquals(carlos ,juan);
    }

}