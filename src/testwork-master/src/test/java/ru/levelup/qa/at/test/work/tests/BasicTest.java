package ru.levelup.qa.at.test.work.tests;


import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.levelup.qa.at.test.work.page.elements.HeaderElements;
import ru.levelup.qa.at.test.work.page.objects.EbayHomePage;
import ru.levelup.qa.at.test.work.page.objects.ErrorRegistrationPage;
import ru.levelup.qa.at.test.work.page.objects.RegistrationPage;

import java.util.concurrent.TimeUnit;

import static ru.levelup.qa.at.test.work.services.webdriver.DriverParams.URL;

public class BasicTest {

    protected WebDriver driver;

    protected EbayHomePage ebayHomePage;

    @BeforeClass
    public static void setUpDriver() {
        FirefoxDriverManager.getInstance().setup();
    }

    @Before
    public void setUpTest() {

        driver = new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(URL);


//        driver.manage().timeouts().implicitlyWait(DriverParams.TIMEOUT_MS, TimeUnit.MILLISECONDS);
//        driver.manage().timeouts().pageLoadTimeout(DriverParams.PAGE_LOAD_TIMEOUT_MS, TimeUnit.MILLISECONDS);
//        ebayHomePage = new EbayHomePage(driver);
//        ebayHomePage.open();

    }


    @Test
    public void registrationTest() {
        ebayHomePage = new EbayHomePage(driver);
        ebayHomePage.open();

        HeaderElements headerElements = new HeaderElements(driver);

        headerElements.getRegistrationLink().click();

        RegistrationPage registrationPage = new RegistrationPage(driver);

        ErrorRegistrationPage errorRegistrationPage = registrationPage.registration();

        // Assert.assertEquals(mainShopMTS.registrationComplete.getText(), "Выход");

        Assert.assertEquals(errorRegistrationPage.getReplaseregistrationEntity().getText(), "Заменить учетную запись");

    }


    @After
    public void tearDown() {
        driver.close();
    }

}
