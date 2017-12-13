package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BasePage {

    //*********Constructor*********
    public HomePage (WebDriver driver) {
        super(driver);
    }

    //*********Page Variables*********
    String baseURL = "http://www.n11.com/";

    //*********Web Elements By Using Page Factory*********
    @FindBy(how = How.CLASS_NAME, using = "btnSignIn")
    public WebElement signInButton;

    //*********Page Methods*********
    //Go to Homepage
    public void goToN11 (){
        driver.get(baseURL);
    }

    //Go to LoginPage
    public LoginPage goToLoginPage (){
        click(signInButton);
        //I want to chain LoginPage's methods so I return LoginPage by initializing its elements
        return new PageFactory().initElements(driver,LoginPage.class);
    }
}