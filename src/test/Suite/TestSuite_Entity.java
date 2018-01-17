
package Suite;

import hotel_project.TAplikacjaTest;
import hotel_project.TFabrykaTest;
import hotel_project.THotelTest;
import hotel_project.TPokojTest;
import hotel_project.Test_Entity;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;

@Categories.SuiteClasses({TFabrykaTest.class, TAplikacjaTest.class, THotelTest.class,
TPokojTest.class})
@RunWith(Categories.class)
@Categories.IncludeCategory(Test_Entity.class)
public class TestSuite_Entity {
    
}
