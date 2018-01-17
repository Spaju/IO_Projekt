/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_project;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@Category({Test_Entity.class})
@RunWith(Parameterized.class)
public class TPokojTest {
    Danne dane = new Danne();

    @Before
    public void SetUp(){
        dane.Danne();
    }
    
    @Parameterized.Parameter
    public int numerek;
    
    @Parameterized.Parameters
    public static Collection<Object[]>data(){
        Object[][] data1 = new Object[][]{{0},{1},{2},{3},{4},{5}};
        return Arrays.asList(data1);
    }

    @Test
    public void testEquals() {
        System.out.println("equals");
        for(int i = numerek; i<6; i++){
            if(numerek==i)
                assertTrue(dane.pokoje[numerek].equals(dane.pokoje[i]));
            else
                assertFalse(dane.pokoje[numerek].equals(dane.pokoje[i]));
        }     
    }
    
    @Test
    public void testGetCena() {
        System.out.println("setCena");
        float result1 = dane.pokoje[numerek].getCena();
        float result2 = dane.pokoje_cena[numerek];
        assertEquals(result1, result2, 0F);
    }
}
    
    /*
    @Test
    public void testTPokoj_6args() {
        System.out.println("TPokoj");
        int Numer = 0;
        int Il_miejsc = 0;
        THotel Hotel = null;
        String Klasa = "";
        float Cena = 0.0F;
        String Stan = "";
        TPokoj instance = new TPokoj();
        instance.TPokoj(Numer, Il_miejsc, Hotel, Klasa, Cena, Stan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testTPokoj_StringArr_THotel() {
        System.out.println("TPokoj");
        String[] data = null;
        THotel Hotel = null;
        TPokoj instance = new TPokoj();
        instance.TPokoj(data, Hotel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testToString() {
        System.out.println("toString");
        TPokoj instance = new TPokoj();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testGetNumer() {
        System.out.println("getNumer");
        TPokoj instance = new TPokoj();
        int expResult = 0;
        int result = instance.getNumer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testSetNumer() {
        System.out.println("setNumer");
        int Numer = 0;
        TPokoj instance = new TPokoj();
        instance.setNumer(Numer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testGetIl_miejsc() {
        System.out.println("getIl_miejsc");
        TPokoj instance = new TPokoj();
        int expResult = 0;
        int result = instance.getIl_miejsc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testSetIl_miejsc() {
        System.out.println("setIl_miejsc");
        int Il_miejsc = 0;
        TPokoj instance = new TPokoj();
        instance.setIl_miejsc(Il_miejsc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testGetHotel() {
        System.out.println("getHotel");
        TPokoj instance = new TPokoj();
        String expResult = "";
        String result = instance.getHotel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testSetHotel() {
        System.out.println("setHotel");
        THotel Hotel = null;
        TPokoj instance = new TPokoj();
        instance.setHotel(Hotel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testGetKlasa() {
        System.out.println("getKlasa");
        TPokoj instance = new TPokoj();
        String expResult = "";
        String result = instance.getKlasa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testSetKlasa() {
        System.out.println("setKlasa");
        String Klasa = "";
        TPokoj instance = new TPokoj();
        instance.setKlasa(Klasa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testGetCena() {
        System.out.println("getCena");
        TPokoj instance = new TPokoj();
        float expResult = 0.0F;
        float result = instance.getCena();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testGetStan() {
        System.out.println("getStan");
        TPokoj instance = new TPokoj();
        String expResult = "";
        String result = instance.getStan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testSetStan() {
        System.out.println("setStan");
        String Stan = "";
        TPokoj instance = new TPokoj();
        instance.setStan(Stan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
