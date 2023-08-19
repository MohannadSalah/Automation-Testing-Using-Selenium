package org.example;

import org.example.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReservePage extends PageBase {

    public ReservePage(WebDriver driver) {
        super(driver);
    }

   private By Bed = By.xpath("(//input[@type=\"radio\" ])[2]");
    private WebElement BedSelect;

    private By Amount = By.xpath("(//select[@data-testid=\\\"select-room-trigger\\\"])[1]");
    private WebElement AmountSelect;

    private By Reserve = By.xpath("//button[@data-title=\\\"Select your accommodations first\\\"]");
    private WebElement ClickOnIwillReserve;


    public void SelectingBeds(){
        BedSelect = driver.findElement(Bed);
        Clicking(BedSelect);
    }

    public void SelectingAmount(){
        AmountSelect= driver.findElement(Amount);
        Selecting(AmountSelect);
    }
    public void ClickOnReserve(){
        ClickOnIwillReserve= driver.findElement(Reserve);
        Clicking(ClickOnIwillReserve);
    }

}
