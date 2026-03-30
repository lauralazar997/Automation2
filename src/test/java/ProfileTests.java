import org.testng.annotations.*;

public class ProfileTests {


    @BeforeGroups("smoke")
    public void setup(){
        System.out.println("ProfileTests setup");
    }

    @AfterGroups("regression")
    public void tearDown(){
        System.out.println("ProfileTests tearDown");

    }

    @Test(groups = "smoke")
    public void profileTests(){
    }

    @Test(groups = "regression")
    public void profileTestNonSmoke(){

    }
}
