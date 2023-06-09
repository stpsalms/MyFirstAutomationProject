package Step_Definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageTest {
public WebDriver driver;
    @Given("^I am on the home page$")
    public void i_am_on_the_home_page() throws Throwable {
System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
Thread.sleep(2000);

    }

    @Then("^I should see the application logo$")
    public void i_should_see_the_application_logo() throws Throwable {
driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[1]/img")).isDisplayed();

    }
}
