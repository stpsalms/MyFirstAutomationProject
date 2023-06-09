package Step_Definition;

import Base.TestBase;
import Pages.admin_pages;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Adm_searchUserTest extends TestBase {

    //@Given("^I am logged in$")
    //public void iAmLoggedIn() throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        //driver = new ChromeDriver();
        //driver.manage().window().maximize();
        //driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //Thread.sleep(2000);
        //admin_pages page = PageFactory.initElements(driver, admin_pages.class);
        //page.enterloginUserName();
        //page.enterloginPassword();
        //page.clickloginBtn();
        //Thread.sleep(2000);
    //}

    @When("^I click the admin menu$")
    public void iClickTheAdminMenu() throws InterruptedException {
        admin_pages page = PageFactory.initElements(driver, admin_pages.class);
        page.clickAdminMenu();
        Thread.sleep(2000);
        page.closemenu();

    }

    @Then("^I should see the users page$")
    public void iShouldSeeTheUsersPage() throws InterruptedException {
        admin_pages page = PageFactory.initElements(driver, admin_pages.class);
        page.AssertSystemUserPage();
        Thread.sleep(3000);
        //driver.findElement(By.xpath("//h5[text() = 'System Users']")).isDisplayed();
    }

    @When("^I enter user data$")
    public void iEnterUserData() throws InterruptedException {
        admin_pages page = PageFactory.initElements(driver, admin_pages.class);
        page.SearchbyUsername();
        Thread.sleep(2000);

    }

    @And("^I click on the search button$")
    public void iClickOnTheSearchButton() throws InterruptedException {
        admin_pages page = PageFactory.initElements(driver, admin_pages.class);
        page.clickSearchButton();
        Thread.sleep(3000);

    }

    @Then("^Search result should return the correct user$")
    public void searchResultShouldReturnTheCorrectUser() {
        admin_pages page = PageFactory.initElements(driver, admin_pages.class);
        page.AssertSearchresult();


    }
}
