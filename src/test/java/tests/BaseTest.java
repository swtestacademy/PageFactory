package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.PageGenerator;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;
    public PageGenerator page;

    @BeforeClass
    public void setup () {
    	
    	
    	String firefoxdriverpath = System.getProperty("user.dir")
				+ "\\src\\test\\resources\\executable\\geckodriver.exe";

		System.setProperty("webdriver.gecko.driver", firefoxdriverpath);

		driver = new FirefoxDriver();
		
        //Create a Chrome driver. All test classes use this.
       // driver = new ChromeDriver();

        //Create a wait. All test classes use this.
        wait = new WebDriverWait(driver,15);

        //Maximize Window
        driver.manage().window().maximize();

        //Instantiate the Page Class
        page = new PageGenerator(driver);
    }

    @AfterClass
    public void teardown () {
        driver.quit();
    }
}
