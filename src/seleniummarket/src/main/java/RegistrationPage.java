import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {


    private WebDriver driver;

    WebElement login;
    WebElement password;
    WebElement enterButton;


    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        login = driver.findElement(By.name("USER_LOGIN"));
        password = driver.findElement(By.name("USER_PASSWORD"));
        enterButton = driver.findElement(By.xpath("/html/body/div[1]/div[7]/div/div[2]/form/p[4]/button"));
    }


    public MainShopMTS registration() {
        login.clear();
        login.sendKeys("aavtotest@bk.ru");
        password.clear();
        password.sendKeys("levelup123");
        enterButton.click();
        return new MainShopMTS(driver);
    }
}
