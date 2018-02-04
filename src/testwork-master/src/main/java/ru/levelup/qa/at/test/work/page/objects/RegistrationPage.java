package ru.levelup.qa.at.test.work.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"firstname\"]")

    private WebElement name;

    @FindBy(xpath = "//*[@id=\"lastname\"]")
    private WebElement surname;

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement mail;

    @FindBy(xpath = "//*[@id=\"PASSWORD\"]")
    private WebElement password;


    @FindBy(id = "ppaFormSbtBtn")
    private WebElement registrationButton;

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public ErrorRegistrationPage registration() {


        name.clear();
        name.sendKeys("avtotest");
        surname.clear();
        surname.sendKeys("avtotest");
        mail.clear();
        mail.sendKeys("aavtotest@bk.ru");
        password.clear();
        password.sendKeys("levelup123");

        WebElement WaitforRegButton = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.elementToBeClickable(By.id("ppaFormSbtBtn")));

        registrationButton.click();
        return new ErrorRegistrationPage(driver);


    }
}
