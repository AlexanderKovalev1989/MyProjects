import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PersonalBasket {

    private WebDriver driver;

    WebElement amount;

    public PersonalBasket(WebDriver driver) {
        this.driver = driver;
        this.amount = driver.findElement(By.className("count_number"));
    }

}
