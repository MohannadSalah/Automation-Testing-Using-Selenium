package AutomationAssessment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;

    @DataProvider(name = "Check Date")
    public static Object [][] Data (){

        return new Object[][]{
                {"//span[@data-date=\"2023-10-01\"]" , "//span[@data-date=\"2023-10-14\"]" },
               // {"//span[@data-date=\"2023-09-01\"]" , "//span[@data-date=\"2023-09-14\"]"}
        };
    };

    @BeforeTest
    public  void SetUp (){

        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.booking.com/");
    }



    /*@AfterTest
    public void Close(){
        driver.quit();
    }*/
}
