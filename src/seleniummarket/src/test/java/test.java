import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {



    public  final  String URL = "https://www.kinopoisk.ru";

private WebDriver driver;

@Test

public  void openPageTest (){

    driver = new FirefoxDriver();

    driver.get(URL);

    //WebElement element = driver.findElement(By.)

    driver.quit();

}


}
