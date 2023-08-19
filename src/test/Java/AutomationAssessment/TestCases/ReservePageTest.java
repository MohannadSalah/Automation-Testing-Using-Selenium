package AutomationAssessment.TestCases;

import AutomationAssessment.BaseTest;
import org.example.HomePage;
import org.example.HotelsPage;
import org.example.ReservePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.Set;

public class ReservePageTest extends BaseTest {

    private HomePage homePage;
    private HotelsPage hotelsPage;
    private ReservePageTest reservePageTest;

    private ReservePage reservePage;







    @Test(dataProvider  = "Check Date")
    public void ShouldBeAbleToCompleteReserving (  String ValidCheckDate , String InvalidCheckDate){

        HomePage homePage = new HomePage(driver);
        HotelsPage hotelsPage = new HotelsPage(driver);
        ReservePage reservePage = new ReservePage(driver);
        SoftAssert softAssert = new SoftAssert();
        homePage.SelectPlace("Alexandria,Egypt");
        homePage.ClickOnClose();
        homePage.ClickOnCheckButton();
        homePage.ClickOnSwitchMonth();
        homePage.ClickOnCheckIn(ValidCheckDate);
        homePage.ClickOnCheckOut(InvalidCheckDate);
        homePage.ClickingOnSearch();
        hotelsPage.ClickingOnSwitchPageButtons();
        new WebDriverWait(driver,Duration.ofSeconds(15));
        String First = driver.getWindowHandle();
        hotelsPage.ClickingOnSwitchPageButtons();
        String Second = driver.getWindowHandle();
        new WebDriverWait(driver,Duration.ofSeconds(15));
        hotelsPage.ClickingOnTolipHotelButton();
        String Tolip = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        for (String Next : allWindows){

            if (!Next.equals(First)) {
                driver.switchTo().window(Tolip);
            }
            else {
                break;
            }
        }
String expected ="Tolip Hotel Alexandria";
       String actual = driver.findElement(By.xpath("//div[@data-capla-component-boundary=\"b-property-web-property-page/PropertyHeaderName\"]")).getText();
       softAssert.assertTrue(actual.contains(expected));
        reservePage.SelectingBeds();
        reservePage.SelectingAmount();
        reservePage.ClickOnReserve();





    }


}
