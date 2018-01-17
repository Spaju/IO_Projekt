/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_project;

import java.util.IllegalFormatCodePointException;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;
import org.junit.runners.MethodSorters;

@Category({Test_Control.class, Test_Entity.class})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TAplikacjaTest {
    static Danne dane = new Danne();
    static TAplikacja instance;
    
    @Rule
    public ExpectedException exception = ExpectedException.none();
    
    @BeforeClass
    public static void setUpClass() {
        instance = new TAplikacja();
        dane.Danne();
        for(int i=0; i<2; i++){
            instance.addHotel(dane.dane_hotelow[i]);
        }
    }
    
    @Test
    public void TestAddUser() {
        System.out.println("AddUser");
        for(int i=0; i<6; i++){
            TUser result = instance.addUser(dane.dane_user[i]);
            assertEquals(dane.user[i] ,result);
        }
        exception.expect(IllegalFormatCodePointException.class);
        exception.expectMessage("Code point = 0x0");
        instance.addUser(dane.dane_user[6]);
    }
    
    
    
    @Test
    public void testAddPokoj() {
        System.out.println("addPokoj");
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                instance.Hotele.get(i).addPokoj(dane.pokojeee[i][j]);
                TPokoj pokoj1 = instance.Hotele.get(i).Pokoje.get(j);
                assertSame(pokoj1, dane.pokojeee[i][j]);
            }
            int size1 = instance.Hotele.get(i).Pokoje.size();
            int ile = instance.Hotele.get(i).Pokoje.get(0).Numer;
            instance.Hotele.get(i).addPokoj(dane.pokojeee[i][0]);
            assertEquals(size1, instance.Hotele.get(i).Pokoje.size());
            assertEquals(instance.Hotele.get(i).Pokoje.get(0).Numer, ile);
        }
    }
    
    @Test
    public void testGetNazwa(){
        System.out.println("GetNazwa");
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                assertEquals(dane.hotele_cena[i][j], instance.Hotele.get(i).Pokoje.get(j).Cena, 0F);
            }
        }
    }
    
}
