import org.testng.annotations.*;

public class SearchTests {

    @BeforeGroups("smoke")
    public void setup(){
        System.out.println("SearchTests setup");
    }

    @AfterGroups("regression")
    public void tearDown(){
        System.out.println("SearchTests tearDown");

    }

    @Test(groups = "smoke")
    public void searchTest(){

    }
    @Test(groups = "regression")
    public void searchTestNonSmoke(){

    }
}
