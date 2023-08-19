import AutomationAssessment.BaseTest;
import org.example.HomePage;
import org.example.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class HomeTest extends BaseTest  {
private HomePage homePage;

private PageBase pageBase;



    @Test(dataProvider = "Check Date")
    public void ShouldBeAbleToSearchSuccessfully( String ValidCheckDate , String InvalidCheckDate){
        HomePage homePage = new HomePage(driver);
        new WebDriverWait(driver , Duration.ofSeconds(20));
        homePage.SelectPlace("Alexandria,Egypt");
        new WebDriverWait(driver , Duration.ofSeconds(20));
        homePage.ClickOnClose();
        new WebDriverWait(driver , Duration.ofSeconds(20));
        homePage.ClickOnCheckButton();
        homePage.ClickOnSwitchMonth();
        homePage.ClickOnCheckIn(ValidCheckDate);
        homePage.ClickOnCheckOut(InvalidCheckDate);
        homePage.ClickingOnSearch();


    }

}
