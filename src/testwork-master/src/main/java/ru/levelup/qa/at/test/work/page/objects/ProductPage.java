package ru.levelup.qa.at.test.work.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends AbstractPage {

    @FindBy (xpath = "//*[@id=\"convbidPrice\"]")

    private  WebElement secondPrice;


    public  ProductPage (WebDriver driver){
        super(driver);
    }

    public WebElement getSecondPrice() {
        return secondPrice;
    }
}

