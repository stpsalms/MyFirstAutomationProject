package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static Properties CONFIG = null;
    public static WebDriver driver = null;
    public int random;

    public void initialize() throws IOException {
        if (driver == null) {
//         This code will read the config property file
            CONFIG = new Properties();
            FileInputStream fn = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/config/config.properties");
            CONFIG.load(fn);
//            initialize the WebDriver
            if (CONFIG.getProperty("browser").equals("Firefox")) {
                System.setProperty("webdriver.firefox.driver", "C:\\firefoxdriver.exe");
                driver = new FirefoxDriver();
            } else if (CONFIG.getProperty("browser").equals("IE")) {
                System.setProperty("webdriver.Ie.driver", "C:\\IeDriverServer.exe");
                driver = new InternetExplorerDriver();
            } else if (CONFIG.getProperty("browser").equals("chrome")) {
                System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
                driver = new ChromeDriver();
            }
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }

    }
}