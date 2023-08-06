package org.example.managers;

import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.example.pages.SignUpPage;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    private WebDriver driver;
    private HomePage homePage;
    private LoginPage loginPage;
    private SignUpPage signUpPage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }
    public PageObjectManager(HomePage homePage) {
        this.homePage = homePage;
    }
    public  PageObjectManager(LoginPage loginPage) {
        this.loginPage = loginPage;
    }
    public PageObjectManager(SignUpPage signUpPage) {this.signUpPage = signUpPage;}


    public HomePage getHomePage() {
        return (homePage == null) ? homePage = new HomePage(driver) : homePage;
    }
    public LoginPage getLoginPage() {
        return (loginPage == null) ? loginPage= new LoginPage(driver) : loginPage;
    }
    public SignUpPage getSignUpPage() {
        return (signUpPage == null) ? signUpPage= new SignUpPage(driver) : signUpPage;
    }




}
