package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.managers.PageObjectManager;
import org.example.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Steps {
    WebDriver driver = null;
    HomePage homePage;
    PageObjectManager pageObjectManager;

    @Given("Launch browser and Navigate to url {string}")
    public void launch_browser_and_navigate_to_url(String string) {
        ChromeOptions ops = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "C:\\Disk D\\Java-Selenium\\Selenium_AutomationExercise\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        pageObjectManager = new PageObjectManager(driver);

        homePage = pageObjectManager.getHomePage();
        homePage.goToHomePage();


    }
    @When("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
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

    }
    @Then("Verify that {string} is visible")
    public void verify_that_is_visible_information(String string) {

    }
    @Then("Fill details: Title, Name, Email, Password, Date of birth")
    public void fill_details_title_name_email_password_date_of_birth() {

    }
    @Then("Select checkbox {string}")
    public void select_checkbox(String string) {

    }
    @Then("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {

    }
    @Then("Click {string}")
    public void click(String string) {

    }
    @Then("Verify that {string} is  visible")
    public void verify_that_is_visible_account(String string) {

    }
    @Then("Click {string} button")
    public void click_button(String string) {

    }
    @Then("Verify that {string} is visible and click {string} button")
    public void verify_that_is_visible_and_click_button(String string, String string2) {
        homePage.closeDriver();

    }
}
