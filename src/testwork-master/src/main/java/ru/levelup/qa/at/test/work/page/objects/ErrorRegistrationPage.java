package ru.levelup.qa.at.test.work.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ErrorRegistrationPage extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"reginter\"]")

    private WebElement replaseregistrationEntity;


    public ErrorRegistrationPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getReplaseregistrationEntity() {
        return replaseregistrationEntity;
    }
}
