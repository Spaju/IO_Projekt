package hotel_project;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.IllegalFormatCodePointException;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Rule;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;

/**
 *
 * @author Robert
 */
@Category({Test_Control.class,Test_Entity.class})
public class TFabrykaTest {
        Danne dane = new Danne();
        
    @Rule
    public ExpectedException exception = ExpectedException.none();
    
    
    @Before
    public void SetUp(){
        dane.Danne();
    }
    
    @Test
    public void testCreate_user() {
        System.out.println("Create_user");
        TFabryka instance = new TFabryka();
        for(int i=0; i<6; i++){
            TUser result = instance.Create_user(dane.dane_user[i]);
            assertEquals(dane.user[i] ,result);
        }
        exception.expect(IllegalFormatCodePointException.class);
        exception.expectMessage("Code point = 0x0");
        instance.Create_user(dane.dane_user[6]);
    }

    
    /*@Test
    public void testCreate_pokoj() {
        System.out.println("Create_pokoj");
        String[] data = null;
        THotel Hotel = null;
        TFabryka instance = new TFabryka();
        TPokoj expResult = null;
        TPokoj result = instance.Create_pokoj(data, Hotel);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testCreate_hotel() {
        System.out.println("Create_hotel");
        String[] data = null;
        TFabryka instance = new TFabryka();
        THotel expResult = null;
        THotel result = instance.Create_hotel(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    @Test
    public void testCreate_rezerwacja() {
        System.out.println("Create_rezerwacja");
        String[] data = null;
        TUser User = null;
        TPokoj Pokoj = null;
        TFabryka instance = new TFabryka();
        TRezerwacja expResult = null;
        TRezerwacja result = instance.Create_rezerwacja(data, User, Pokoj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
