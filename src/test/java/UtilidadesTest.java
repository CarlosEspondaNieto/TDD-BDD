import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtilidadesTest {
    private Utilidades utils;

    @Before
    public void setUp() throws Exception {
    utils= new Utilidades();
    }
//Test para ver funcionamiento de assertEquals
    @Test
    public void getArrayStringsTest() throws Exception{

        //given
        String[] esperado = {"uno", "dos", "tres", "cero"};

        //When
        String[] resultado= utils.getArrayStrings("uno", "dos", "tres", "cero");

        //Then
        assertEquals(esperado, resultado);
        assertEquals(4,resultado.length);
        assertEquals(esperado.length, resultado.length);

        //Los elementos son iguales uno a uno
        assertEquals(esperado[0], resultado[0]);
        assertEquals(esperado[1], resultado[1]);

        assertNotEquals(esperado[2], resultado[0]);
//AssertArrayEquals  no es soportado por junit

    }

    @Test
    public void testAssertTrue(){
        boolean resultadoTrue = utils.esMayorque10(20);
        boolean resultadoFalse = utils.esMayorque10(5);
        assertTrue("La aserción ha fallado", resultadoTrue);
        assertFalse("La aserción ha fallado", resultadoFalse);

    }

}