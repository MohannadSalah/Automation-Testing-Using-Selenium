package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class PageBase {

    protected WebDriver driver;


    public PageBase(WebDriver driver){
        this.driver=driver;
    }

    public static void Clicking(WebElement element){
        element.click();
    }

    public static void SendText(WebElement element , String text){
        element.sendKeys(text);
    }

    public static void Selecting(WebElement amountSelect){Select select = new Select(amountSelect);

    }
}
