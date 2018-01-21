import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class test {



    public  final static   String URL = "https://shop.mts.ru";

    private  WebDriver driver;



@BeforeClass
 public static void suitSetUps (){
    FirefoxDriverManager.getInstance().setup();


}




@Ignore
public  void registrationTest (){

    driver.get("http://shop.mts.ru/auth/");




}


    @Before
    public  void SetUp (){
        driver = new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

        driver.get(URL);


    }

@Test

public void shopBasketTest (){

    ProductPage productPage = new MainShopMTS(driver).clickBuyButton();

    PersonalBasket personalBasket = new  ProductPage(driver).clickBuyButton1();

    Assert.assertEquals(personalBasket.amount.getAttribute("value") ,"1");




}

@After
public  void closeBrowser()

{
    driver.quit();

}



}
