import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainShopMTS {


    private WebDriver driver;
    private final WebDriverWait wait;
    WebElement buyButton;


    public MainShopMTS(WebDriver driver) {
        this.driver = driver;
        buyButton = driver.findElement(By.id("223641"));
        wait = new WebDriverWait(driver, 30);

    }


    public ProductPage clickBuyButton() {
        buyButton.click();
        return new ProductPage(driver);
    }

    ;


}
