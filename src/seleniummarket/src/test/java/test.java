import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class test {



    public  final  String URL = "http://www.sberbank.ru/ru/person";

private WebDriver driver;

@Before
 public void suitSetUps (){
    FirefoxDriverManager.getInstance().setup();
}


@Test

public  void openPageTest (){

    driver = new FirefoxDriver();
    driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

    driver.get(URL);

    WebElement enterButton = driver.findElement(
            By.className("sb-online__login"));

    Assert.assertEquals(enterButton.getText(),"Вход");




}

@After
public void closeBrowser()

{
    driver.quit();

}



}
