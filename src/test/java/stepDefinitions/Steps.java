package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.managers.PageObjectManager;
import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.example.pages.SignUpPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Steps {
    WebDriver driver = null;
    HomePage homePage;
    LoginPage loginPage;
    SignUpPage signUpPage;


    PageObjectManager pageObjectManager;



    @Given("I am on HomePage'")
    public void i_am_on_home_page() {
        TestBase testBase = new TestBase();
        driver = testBase.initialize();


    }

    @When("Verify that home page is visible successfully")
    public void i_verify_that_home_page_is_visible_successfully() {

        homePage = pageObjectManager.getHomePage();
        homePage.goToHomePage();
        homePage.getTilePage();
    }

    @Then("Click on {string} button")
    public void click_on_button(String string) {
        homePage.clickLogin();

    }

    @Then("Verify {string} is visible")
    public void verify_is_visible(String string) {
        homePage.showTitleLogin();


    }

    @Then("Enter name and email address and Click {string} button")
    public void enter_name_and_email_address_and_click_button(String string) {
        loginPage = pageObjectManager.getLoginPage();
        loginPage.fillSignUpName("Robert");
        loginPage.fillSignUpEmail("wert10@wp.pl");
        loginPage.clickSignUpSubmit();

    }

    @Then("Verify that {string} is visible")
    public void verify_that_is_visible_information(String string) {
        signUpPage = pageObjectManager.getSignUpPage();
        signUpPage.getSignUpTitle();

    }

    @Then("Fill details: Title, Name, Email, Password, Date of birth")
    public void fill_details_title_name_email_password_date_of_birth() {
        signUpPage.enterAccountInformation();

    }

    @Then("Select checkbox {string}")
    public void select_checkbox(String string) {
        signUpPage.clickSignUpNewsLetter();


    }

    @Then("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {

        signUpPage.fillFirstNameUser("Roberto");
        signUpPage.fillLastUserName("Rodrigez");
        signUpPage.fillCompanyUser("MyHitos");
        signUpPage.fillAddress1("Paris");
        signUpPage.fillAddress2("Tokyo");
        signUpPage.fillCountry();
        signUpPage.fillState("Florida");
        signUpPage.fillCity("Texa");
        signUpPage.filZipCode("1223112");
        signUpPage.fillMobileNumber("1231123343");

    }

    @Then("Click {string}")
    public void click(String string) {
        signUpPage.clickCreateAccountButton();

    }

    @Then("Verify that {string} is  visible")
    public void verify_that_is_visible_account(String string) {
        signUpPage.showAccountCreated();

    }

    @Then("Click {string} button")
    public void click_button(String string) {
        signUpPage.clickContinueButton();

    }

    @Then("Verify that {string} is visible and click {string} button")
    public void verify_that_is_visible_and_click_button(String string, String string2) {
        homePage.closeDriver();
        driver.quit();

    }

    //***************************************

    //

    //scenario 2
    @Given("I am on HomePageLogin {string}")
    public void i_am_on_home_page_login(String string) {
        TestBase testBase = new TestBase();
        driver = testBase.initialize();
    }

    @When("I verify that home page is visible successfully")
    public void then_i_verify_that_home_page_is_visible_successfully() {
        pageObjectManager = new PageObjectManager(driver);
        homePage = pageObjectManager.getHomePage();
        homePage.goToHomePage();
        homePage.getTilePage();
        Assertions.assertEquals("Automation Exercise", homePage.getTilePage());

    }

    @Then("I Click on {string} button")
    public void i_click_on_button(String string) {

        homePage.clickLogin();

    }

    @Then("I Verify {string} is visible")
    public void i_verify_is_visible(String string) {
        loginPage = pageObjectManager.getLoginPage();
        System.out.println(loginPage.getloginTitle());
        Assertions.assertEquals("Login to your account", loginPage.getloginTitle());

    }

    @Then("I Enter correct email address and password")
    public void iEnterCorrectEmailAddressAndPassword(DataTable table) {
        //List<List<String>> data = table.cells();
        loginPage.fillLoginEmail("wert100@wp.pl");
        loginPage.fillLoginPassword("wert100@wp.pl");


    }


    @Then("I Click {string} button")
    public void i_click_button(String string) {
        loginPage.clickLoginSubmit();

    }

    @Then("I Verify that {string} is visible")
    public void i_verify_that_is_visible(String string) {
        Assertions.assertEquals("Robert", loginPage.showUserLoggedName());


    }

    @Then("Then i click  {string} button")
    public void then_i_click_button(String string) {
        loginPage.logOut();
        Assertions.assertEquals("logout", loginPage.logOut());


    }

    @Then("Finaly i verify  {string} is visible")
    public void finaly_i_verify_is_visible(String string) {
        System.out.println("Account deleted");
        driver.quit();


    }


}
