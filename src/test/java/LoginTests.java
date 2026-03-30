import org.testng.annotations.*;

public class LoginTests {

    @BeforeGroups("smoke")
    public void setup(){
        System.out.println("LoginTests setup");
    }

    @AfterGroups("regression")
    public void tearDown(){
        System.out.println("LoginTests tearDown");

    }


    @Test(groups = "smoke")
    public void loginTest(){

    }

    @Test(groups = "regression")
    public void loginTestNonSmoke(){

    }
}
