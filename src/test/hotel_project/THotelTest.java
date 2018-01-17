/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;

@Category({Test_Entity.class})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(Parameterized.class)
public class THotelTest {
    static Danne dane = new Danne();
    static THotel instances[];
    
    @Parameterized.Parameter
    public TPokoj[][] pokoje;
    
    @Parameterized.Parameters
    public static Collection<Object[][][]>data(){
        Object[][][][] data1 = new TPokoj[][][][]{{
                {
                { Danne.pokoje[0], Danne.pokoje[1], Danne.pokoje[2] },
                { Danne.pokoje[3], Danne.pokoje[4], Danne.pokoje[5] }
                }
        }
        };
    return Arrays.asList(data1);
    }
    
    @BeforeClass
    public static void SetUp(){
        instances = new THotel[2];
        instances[0] = new THotel();
        instances[1] = new THotel();
        dane.Danne();
    }

    @Test
    public void testAddPokoj() {
        System.out.println("addPokoj");
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                instances[i].addPokoj(pokoje[i][j]);
                TPokoj pokoj1 = instances[i].Pokoje.get(j);
                assertSame(pokoj1, pokoje[i][j]);
            }
            int size1 = instances[i].Pokoje.size();
            int ile = instances[i].Pokoje.get(0).Numer;
            instances[i].addPokoj(pokoje[i][0]);
            assertEquals(size1, instances[i].Pokoje.size());
            assertEquals(instances[i].Pokoje.get(0).Numer, ile);
        }
    }

    @Test
    public void testGetNazwa(){
        System.out.println("GetNazwa");
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                assertEquals(dane.hotele_cena[i][j],instances[i].Pokoje.get(j).Cena, 0F);
            }
        }
    }
}
