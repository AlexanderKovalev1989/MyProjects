import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {

    private WebDriver driver;

    WebElement productBuyButton;
    WebElement itemPrice;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        this.productBuyButton = driver.findElement(By.id("223641"));
        this.itemPrice = driver.findElement(By.className("items-price"));

    }

    public PersonalBasket clickBuyButton1() {
        productBuyButton.click();
        itemPrice.click();
        return new PersonalBasket(driver);
    }


}
