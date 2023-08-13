package org.example.pages;

import io.cucumber.java.zh_cn.假如;
import org.asynchttpclient.util.Assertions;
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
    @FindBy(xpath = "//select[@id=\"country\"]/option[@value=\"Canada\"]")
    WebElement countryUser;
    @FindBy(xpath = "//input[@id=\"state\"]")
    WebElement stateUser;
    @FindBy(xpath = "//input[@id=\"city\"]")
    WebElement cityUser;
    @FindBy(xpath = "//input[@id=\"zipcode\"]")
    WebElement zipCodeUser;
    @FindBy(xpath = "//input[@id=\"mobile_number\"]")
    WebElement mobileNumberUser;
    @FindBy(xpath = "//button[@data-qa=\"create-account\"]")
    WebElement buttonCreateAccount;

    //Account created
    @FindBy(xpath = "//h2[@data-qa=\"account-created\"]/b")
    WebElement titleAccountCreated;
    //Continue
    @FindBy(xpath = "//a[@data-qa=\"continue-button\"]")
    WebElement continueButton;
    //Dismiss Add
    @FindBy(xpath = "//div[@id=\"dismiss-button\"]")
    WebElement dismissAd;
    @FindBy(xpath = "//a[@href=\"/delete_account\"]")
    WebElement deleteAccount;


    public void getSignUpTitle() {
        System.out.println(signUpTitle.getText());
    }

    public void enterAccountInformation() {
        radioButtonMr.click();
        passwordUser.sendKeys("123456!");
        dateOfBirthUser.click();
        monthOfBirthUser.click();
        yearOfBirthUser.click();
    }

    public void clickSignUpNewsLetter() {
        signUpNewsLetter.click();

        signUpSpecialOffer.click();
    }

    public void fillFirstNameUser(String userName) {
        firstNameUser.sendKeys(userName);
    }

    public void fillLastUserName(String userLastName) {
        lastNameUser.sendKeys(userLastName);
    }

    public void fillCompanyUser(String userCompany) {
        companyName.sendKeys(userCompany);
    }

    public void fillAddress1(String addressUser1) {
        address1.sendKeys(addressUser1);
    }

    public void fillAddress2(String addressUser2) {
        address2.sendKeys(addressUser2);
    }

    public void fillCountry() {
        countryUser.click();
    }

    public void fillState(String state) {
        stateUser.sendKeys(state);
    }

    public void fillCity(String city) {
        cityUser.sendKeys(city);
    }

    public void filZipCode(String zip) {
        zipCodeUser.sendKeys(zip);
    }

    public void fillMobileNumber(String mobileNumber) {
        mobileNumberUser.sendKeys(mobileNumber);

    }

    public void clickCreateAccountButton() {
        buttonCreateAccount.submit();
    }

    public void showAccountCreated() {
        System.out.println(titleAccountCreated.getText());
    }

    public void clickContinueButton() {
        continueButton.click();
       // System.out.println(dismissAd.getText());
        deleteAccount.click();

    }

}
