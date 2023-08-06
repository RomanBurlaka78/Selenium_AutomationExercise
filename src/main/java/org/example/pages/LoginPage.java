package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    final WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }





    @FindBy(xpath = "//input[@name=\"name\"]")
    WebElement nameSignUp;
    @FindBy(xpath = "//input[@data-qa=\"signup-email\"]")
    WebElement emailSignUp;
    @FindBy(xpath = "//button[@data-qa=\"signup-button\"]")
    WebElement clickSignUp;
    @FindBy(xpath = "//input[@name=\"email\"]")
    WebElement email;
    @FindBy(xpath = "//input[@name=\"password\"]")
    WebElement password;





    public void signUp() {
        clickSignUp.click();

    }

    public void  fillSignUpName(String name) {
        nameSignUp.sendKeys(name);

    }

    public void  fillSignUpEmail(String email) {
        emailSignUp.sendKeys(email);

    }

}
