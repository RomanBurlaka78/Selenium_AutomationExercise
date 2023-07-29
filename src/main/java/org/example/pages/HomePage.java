package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    final WebDriver driver;

    //constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Locators


    //Methods

    public void goToHomePage() {
        driver.get("http://automationexercise.com");
    }

    public void closeDriver() {
        driver.quit();
    }


}