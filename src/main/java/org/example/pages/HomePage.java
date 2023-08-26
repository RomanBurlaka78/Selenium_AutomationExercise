package org.example.pages;

import dev.failsafe.internal.util.Assert;
import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    final WebDriver driver;

    //constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Locators
    @FindBy(xpath = "")
    WebElement login;


    //Methods

    public void goToHomePage() {
        driver.get("http://automationexercise.com");
    }

    public void clickLogin() {
        login.click();
    }


    public void tearDown() {
        driver.quit();
    }


}
