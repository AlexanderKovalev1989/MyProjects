package ru.levelup.qa.at.test.work.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CatalogOfProductsPage extends  AbstractPage {


    public CatalogOfProductsPage(WebDriver driver) {
        super(driver);
    }


    @FindBy (css= "#item33dc179b54 > ul.lvprices.left.space-zero > li.lvprice.prc > span > span")
      private  WebElement firstPrise ;

    @FindBy (xpath = "//*[@id=\"item33dc179b54\"]/h3/a")
   private WebElement firstProduct;

    //private  String price = firstPrise.getText().substring(0,14);



    List<WebElement> elements = driver.findElements(By.className("prRange"));

    private  String price = elements.get(0).getText().substring(0,14);

    public List<WebElement> getElements() {
        return elements;
    }

    public void clickFirstProduct (){
        //System.out.println(element);

        firstProduct.click();
    }

    public WebElement getFirstPrise() {
        return firstPrise;
    }

    public String getElement() {
        return price;
    }
}
