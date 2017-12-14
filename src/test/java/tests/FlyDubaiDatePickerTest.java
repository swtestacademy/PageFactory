package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by obaskirt on 14-Dec-17.
 */
public class FlyDubaiDatePickerTest extends BaseTest {

        //This is a date-picker example
        @Test(priority = 0)
        public void FlyDubaiDatePickerTest () throws InterruptedException {
            //Go to website
            driver.get("https://www.flydubai.com/en/");

            //*****Departure day selection started.
            //Click Departure Date
            driver.findElement(By.id("departureDate")).click();

            //Wait until departure table visible
            wait.until(ExpectedConditions.visibilityOf(driver.findElements(By.cssSelector(".pika-table")).get(0)));

            //Click departure day
            driver.findElements(By.cssSelector
                    ("button[data-pika-year='2017'][data-pika-month='11'][data-pika-day='22']")).get(0).click();
            //*****Departure day selection finished.

            //*****Return day selection started
            //Click Return Date
            driver.findElement(By.id("return-date")).click();

            //Wait until departure table visible
            wait.until(ExpectedConditions.visibilityOf(driver.findElements(By.cssSelector(".pika-table")).get(1)));

            //Click return day
            driver.findElements(By.cssSelector
                    ("button[data-pika-year='2017'][data-pika-month='11'][data-pika-day='29']")).get(1).click();
            //*****Return day selection finished.

            //Check the operation in 5 seconds
            Thread.sleep(5000);
        }

}
