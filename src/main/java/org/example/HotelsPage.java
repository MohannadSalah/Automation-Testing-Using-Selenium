package org.example;

import org.example.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HotelsPage extends PageBase {


    public HotelsPage(WebDriver driver) {
        super(driver);
     }


    private By SwitchPage = By.xpath("//button[@aria-label=\"Next page\"]");
    private WebElement ClickOnSwitchPageButton;

private By TolipHotelSelect = By.xpath("//div[text()='Tolip Hotel Alexandria']");

private WebElement ClickOnTolipHotel;




   public void ClickingOnSwitchPageButtons(){
       ClickOnSwitchPageButton = driver.findElement(SwitchPage);
       Clicking(ClickOnSwitchPageButton);

   }
   public void ClickingOnTolipHotelButton(){
       ClickOnTolipHotel = driver.findElement(TolipHotelSelect);
       Clicking(ClickOnTolipHotel);
   }




}
