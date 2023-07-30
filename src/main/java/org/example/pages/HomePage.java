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
    @FindBy(xpath = "//a[@href=\"/login\"]")
    WebElement login;
    @FindBy(xpath = "//div[@class=\"signup-form\"]/h2")
    WebElement titleLoginForm;


    //Methods

    public void goToHomePage() {
        driver.get("http://automationexercise.com");
    }
    public void clickLogin() {
        login.click();
    }
    public void showTitleLogin(){
        System.out.println(titleLoginForm.getText());

    }

    public void closeDriver() {
        driver.quit();
    }

    public void getTilePage() {
        System.out.println(driver.getTitle());

    }


}
