package AutomationAssessment.TestCases;

import AutomationAssessment.BaseTest;
import org.example.HomePage;
import org.example.HotelsPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Set;

public class HotelsPageTest extends BaseTest {
 private HotelsPage hotelsPage;
 private HomePage homePage;

 private HotelsPageTest hotelsPageTest;




    @Test(dataProvider = "Check Date")
    public void ShouldBeAbleToSelectTolipHotel( String ValidCheckDate , String InvalidCheckDate){


        HomePage homePage = new HomePage(driver);
        HotelsPage hotelsPage = new HotelsPage(driver);
        SoftAssert softAssert = new SoftAssert();

        homePage.SelectPlace("Alexandria,Egypt");
        homePage.ClickOnClose();
        homePage.ClickOnCheckButton();
        homePage.ClickOnSwitchMonth();
        homePage.ClickOnCheckIn(ValidCheckDate);
        homePage.ClickOnCheckOut(InvalidCheckDate);
        homePage.ClickingOnSearch();
        String actual = driver.findElement
                (By.xpath("//button[text()='Sun, Oct 1' and 'Sat, Oct 14']")).getText();
        String expected = "Sun, Oct 1 Sat, Oct 14";
        softAssert.assertTrue(actual.contains(expected));
        hotelsPage.ClickingOnSwitchPageButtons();
        hotelsPage.ClickingOnSwitchPageButtons();
        hotelsPage.ClickingOnTolipHotelButton();





    }

}
