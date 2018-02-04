package ru.levelup.qa.at.test.work.tests;


import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import ru.levelup.qa.at.test.work.page.elements.HeaderElements;
import ru.levelup.qa.at.test.work.page.objects.*;
import ru.levelup.qa.at.test.work.services.webdriver.DriverParams;

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
        driver.manage().timeouts().pageLoadTimeout(DriverParams.PAGE_LOAD_TIMEOUT_MS, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().implicitlyWait(DriverParams.TIMEOUT_MS, TimeUnit.MILLISECONDS);
        driver.get(URL);
        ebayHomePage = new EbayHomePage(driver);
        ebayHomePage.open();

//        driver.manage().timeouts().implicitlyWait(DriverParams.TIMEOUT_MS, TimeUnit.MILLISECONDS);
//        driver.manage().timeouts().pageLoadTimeout(DriverParams.PAGE_LOAD_TIMEOUT_MS, TimeUnit.MILLISECONDS);
//        ebayHomePage = new EbayHomePage(driver);
//        ebayHomePage.open();

    }


    @Test
    public void registrationTest() {


        HeaderElements headerElements = new HeaderElements(driver);

        headerElements.getRegistrationLink().click();

        RegistrationPage registrationPage = new RegistrationPage(driver);

        ErrorRegistrationPage errorRegistrationPage = registrationPage.registration();

        Assert.assertEquals(errorRegistrationPage.getReplaseregistrationEntity().getText(), "Заменить учетную запись");

    }

    @Test
    public void buySomeStuff (){

        HeaderElements headerElements = new HeaderElements(driver);
        headerElements.sendKeysToSearchTextBox("Iphone 7");
        headerElements.clickSearchButton();
        CatalogOfProductsPage catalogOfProductsPage = new CatalogOfProductsPage(driver);

        //catalogOfProductsPage.getElements();



        catalogOfProductsPage.clickFirstProduct();

        ProductPage productPage = new ProductPage(driver);

        Assert.assertEquals(catalogOfProductsPage.getElement(),productPage.getSecondPrice().getText());

        //Assert.assertEquals(catalogOfProductsPage.getFirstPrise().getAttribute("innerHTML"),productPage.getSecondPrice().getAttribute("innerHTML"));













    }


    @After
    public void tearDown() {
        driver.close();
    }

}
