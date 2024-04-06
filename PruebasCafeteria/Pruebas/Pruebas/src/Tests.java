import org.junit.*;
import static org.junit.Assert.*;
public class Tests {
    //1
    @Test
    public void  simpleTest ()
    {
        String cadena = "Capuccino,1,2,3,4";
        assertTrue(Main.Cafeteria(cadena));
    }

    //2
    @Test
    public void  testNombreConNumeros ()
    {
        String cadena = "Capucc6ino,1,2,3,4";
        assertFalse(Main.Cafeteria(cadena));
    }

    //3
    @Test
    public void  testMenosDeDosCaracteresEnNombre ()
    {
        String cadena = "C,1,2,3,4";
        assertFalse(Main.Cafeteria(cadena));
    }

    //4
    @Test
    public void  testCeroCaracteresEnNombre ()
    {
        String cadena = ",1,2,3,4";
        assertFalse(Main.Cafeteria(cadena));
    }

    //5
    @Test
    public void  testPuntoEnNombre ()
    {
        String cadena = "Capuccino.,1,2,3,4";
        assertFalse(Main.Cafeteria(cadena));
    }

    //6
    @Test
    public void  testNombreMas15 ()
    {
        String cadena = "Capuccinozzzzzzzzzzzzzzzzzzzzzzzzzz,1,2,3,4";
        assertFalse(Main.Cafeteria(cadena));
    }

    //7
    @Test
    public void  testValorDeTamañoEsNumeroEntero ()
    {
        String cadena = "Capuccino,1,2,3,4";
        assertTrue(Main.Cafeteria(cadena));
    }

    //8
    @Test
    public void  testUnSoloTamaño ()
    {
        String cadena = "Capuccino,4";
        assertTrue(Main.Cafeteria(cadena));
    }

    //9
    @Test
    public void  testDosTamaños ()
    {
        String cadena = "Capuccino,4,6";
        assertTrue(Main.Cafeteria(cadena));
    }

    //10
    @Test
    public void  testTresTamaños ()
    {
        String cadena = "Capuccino,4,6,22";
        assertTrue(Main.Cafeteria(cadena));
    }

    //11
    @Test
    public void  testCuatroTamaños ()
    {
        String cadena = "Capuccino,4,6,22,23";
        assertTrue(Main.Cafeteria(cadena));
    }

    //12
    @Test
    public void  testCincoTamaños ()
    {
        String cadena = "Capuccino,4,6,22,23,40";
        assertTrue(Main.Cafeteria(cadena));
    }

    //13
    @Test
    public void  testTamañoMas48 ()
    {
        String cadena = "Capuccino,49,6,22";
        assertFalse(Main.Cafeteria(cadena));
    }

    //14
    @Test
    public void  testTamañoPrimero()
    {
        String cadena = "12, Capuccino";
        assertFalse(Main.Cafeteria(cadena));
    }

    //15
    @Test
    public void  testTamañoConLetra()
    {
        String cadena = "Capuccino, Grande";
        assertFalse(Main.Cafeteria(cadena));
    }

    //16
    @Test
    public void  testEspaciosEnBlancoEnNombre()
    {
        String cadena = "Gran Cafe,12";
        assertTrue(Main.Cafeteria(cadena));
    }

    //17
    @Test
    public void  testEspaciosEnBlancoEnTamaño()
    {
        String cadena = "GranCafe, 12 ";
        assertTrue(Main.Cafeteria(cadena));
    }

    //18
    @Test
    public void  testEspaciosEnBlancoEnDosTamaños()
    {
        String cadena = "GranCafe, 12 ,        23";
        assertTrue(Main.Cafeteria(cadena));
    }

    //19
    @Test
    public void  testTamañosDescendientes()
    {
        String cadena = "GranCafe,9,8,7,6,4";
        assertFalse(Main.Cafeteria(cadena));
    }


    //20
    @Test
    public void  testTamañosDecimal()
    {
        String cadena = "GranCafe, 2,3,4,9.2";
        assertFalse(Main.Cafeteria(cadena));
    }

    //21
    @Test
    public void  testDobleEspacioEnBlancoEnNombre()
    {
        String cadena = "Gran  Cafe,12";
        assertFalse(Main.Cafeteria(cadena));
    }

    //22
    @Test
    public void  testEspacioEnBlancoEnNombreYEnTamaño()
    {
        String cadena = "Gran Cafe, 12 ";
        assertTrue(Main.Cafeteria(cadena));
    }

    //23
    @Test
    public void  testTamañoCero()
    {
        String cadena = "Capuccino,0";
        assertFalse(Main.Cafeteria(cadena));
    }

    //24
    @Test
    public void  testTamañoSeparadoPorPunto()
    {
        String cadena = "Capuccino,2.6";
        assertFalse(Main.Cafeteria(cadena));
    }

    //25
    @Test
    public void  testTamañosAscendentes()
    {
        String cadena = "Capuccino,2,4,6";
        assertTrue(Main.Cafeteria(cadena));
    }


    //26
    @Test
    public void  testIgnorarEspaciosEnBlanco()
    {
        String cadena = "Capuccino,        2                          ,3                       ";
        assertTrue(Main.Cafeteria(cadena));
    }

    //27
    @Test
    public void  testNombreDeArticuloEnMedio()
    {
        String cadena = "3, 5, Capuccino, 6";
        assertFalse(Main.Cafeteria(cadena));
    }

    //28
    @Test
    public void  testNombreDeArticuloAlFinal()
    {
        String cadena = "3, 5, 6, 7, Capuccino";
        assertFalse(Main.Cafeteria(cadena));
    }

    //29
    @Test
    public void  testTamañoMayor48YMenorAUno()
    {
        String cadena = "Capuccino, 0, 70";
        assertFalse(Main.Cafeteria(cadena));
    }

    //30
    @Test
    public void  testTamañoNegativo()
    {
        String cadena = "Capuccino, -3, 30";
        assertFalse(Main.Cafeteria(cadena));
    }




}
