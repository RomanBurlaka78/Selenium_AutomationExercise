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
    @FindBy(xpath = "//div[@class=\"login-form\"]//h2")
    WebElement loginTitle;
    //login to account
    @FindBy(xpath = "//input[@data-qa=\"login-email\"]")
    WebElement loginEmail;
    @FindBy(xpath = "//input[@data-qa=\"login-password\"]")
    WebElement loginPassword;
    @FindBy(xpath = "//button[@data-qa=\"login-button\"]")
    WebElement loginButtonSubmit;
    @FindBy(xpath = "//ul[@class=\"nav navbar-nav\"]//li[10]/a/b")
    WebElement loggedAsUserName;
    @FindBy(xpath = "//ul/li[5]/a")
    WebElement deleteAccountButton;
    @FindBy(xpath = "//li[4]/a[@href=\"/logout\"]")
    WebElement logOut;





    public void clickSignUpSubmit() {
        clickSignUp.click();
    }

    public void  fillSignUpName(String name) {
        nameSignUp.sendKeys(name);
    }

    public void  fillSignUpEmail(String email) {
        emailSignUp.sendKeys(email);
    }

    public String getloginTitle() {

        return loginTitle.getText();
    }

    public void  fillLoginEmail(String email) {
        loginEmail.sendKeys(email);
    }
    public void fillLoginPassword(String password) {
        loginPassword.sendKeys(password);
    }

    public void clickLoginSubmit() {
        loginButtonSubmit.click();
    }
    public String showUserLoggedName(){
        System.out.println(loggedAsUserName.getText());
        return logOut.getTagName();
    }

    public void clickDeleteAccount() {
        deleteAccountButton.click();
    }

    public String logOut() {
        System.out.println(logOut.getTagName());
        logOut.click();
        return logOut.getText();
    }

}
