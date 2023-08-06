package org.example.pages;

import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignUpPage {
    final WebDriver driver;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//div[@class=\"login-form\"]/h2/b")
    WebElement signUpTitle;
    @FindBy(xpath = "//input[@value =\"Mr\"]")
    WebElement radioButtonMr;
    @FindBy(xpath = "//input[@data-qa =\"name\"]")
    WebElement nameUser;
    @FindBy(xpath = "//input[@id =\"email\"]")
    WebElement emailUser;
    @FindBy(xpath = "//input[@id=\"password\"]")
    WebElement passwordUser;


    @FindBy(xpath = "//select[@id=\"days\"]/option[@value=\"4\"]")
    WebElement dateOfBirthUser;
    @FindBy(xpath = "//select[@id=\"months\"]/option[@value=\"11\"]")
    WebElement monthOfBirthUser;
    @FindBy(xpath = "//select[@id=\"years\"]/option[@value=\"1995\"]")
    WebElement yearOfBirthUser;

    @FindBy(xpath = "//input[@id=\"newsletter\"]")
    WebElement signUpNewsLetter;
    @FindBy(xpath = "//input[@id=\"optin\"]")
    WebElement signUpSpecialOffer;
    // Address Information
    @FindBy(xpath = "//input[@id=\"first_name\"]")
    WebElement firstNameUser;
    @FindBy(xpath = "//input[@id=\"last_name\"]")
    WebElement lastNameUser;
    @FindBy(xpath = "//input[@id=\"company\"]")
    WebElement companyName;
    @FindBy(xpath = "//input[@id=\"address1\"]")
    WebElement address1;
    @FindBy(xpath = "//input[@id=\"address2\"]")
    WebElement address2;
    @FindBy(xpath = "//select[@id=\"country\"]/option")
    WebElement countryUser;
    @FindBy(xpath = "")
    WebElement stateUser;
    @FindBy(xpath = "")
    WebElement cityUser;
    @FindBy(xpath = "")
    WebElement zipCodeUser;
    @FindBy(xpath = "")
    WebElement mobileNumberUser;
    @FindBy(xpath = "")
    WebElement buttonCreateAccount;


    public void getSignUpTitle() {
        System.out.println(signUpTitle.getText());
    }

    public void enterAccountInformation() {
        nameUser.clear();
        passwordUser.sendKeys("123456!");
        dateOfBirthUser.click();
        monthOfBirthUser.click();
        yearOfBirthUser.click();
    }

    public void clickSignUpNewsLetter() {
        signUpNewsLetter.click();
        ;
        signUpSpecialOffer.click();
    }


    public void selectCountry(String country) {
         countryUser.getTagName().equals(country);
    }
}
