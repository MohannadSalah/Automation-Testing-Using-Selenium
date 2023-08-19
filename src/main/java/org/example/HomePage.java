package org.example;

import org.example.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;



public class HomePage extends PageBase {



    By Place = By.name("ss");
WebElement WritePlace;
By Alert = By.cssSelector("div[class=\"abcc616ec7 cc1b961f14 c180176d40 f11eccb5e8 ff74db973c\"] > button[aria-label=\"Dismiss sign-in info.\"]");
WebElement CloseAlert;
By CheckButton = By.xpath("//button[@data-testid=\"date-display-field-start\"]");
WebElement ClickOnCheck;
By SwitchMonth = By.cssSelector("div[class=\"a10b0e2d13 efea941f13\"] > button[type=\"button\"]");
WebElement SwitchMonthPage;
By CheckIn = By.xpath("//span[@data-date=\"2023-10-01\"]");
    WebElement SelectCheckInDate;

By CheckOut = By.xpath("//span[@data-date=\"2023-10-14\"]");
    WebElement SelectCheckOutDate;
By SearchButton = By.xpath("//button[@type=\"submit\"]");
WebElement ClickOnSearch;




    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void SelectPlace(String text){
        WritePlace = driver.findElement(Place);
        SendText(WritePlace ,text );

    }
    public void ClickOnClose(){
        CloseAlert = driver.findElement(Alert);
        Clicking(CloseAlert);
    }

    public void ClickOnCheckButton(){
        ClickOnCheck = driver.findElement(CheckButton);
        Clicking(ClickOnCheck);

    }
    public void ClickOnSwitchMonth(){
        SwitchMonthPage = driver.findElement(SwitchMonth);
        Clicking(SwitchMonthPage);

    }
    public void ClickOnCheckIn(String text){
         SelectCheckInDate= driver.findElement(CheckIn);
        Clicking(SelectCheckInDate);
        SendText(SelectCheckInDate ,text);



    }
    public void ClickOnCheckOut(String text){
        SelectCheckOutDate = driver.findElement(CheckOut);
        Clicking(SelectCheckOutDate);
        SendText(SelectCheckOutDate ,text );


    }
    public void ClickingOnSearch(){
        ClickOnSearch = driver.findElement(SearchButton);
        Clicking(ClickOnSearch);

    }



}

