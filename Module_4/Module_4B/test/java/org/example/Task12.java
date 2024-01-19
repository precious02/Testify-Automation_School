package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task12 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\Testify\\CI_CD_Clone\\ci_cdtestify\\Module4Bselenium\\src\\chromedriver.exe");

        //Launch browser
        WebDriver driver = new ChromeDriver();

        //To Maximize the browser
        driver.manage().window().maximize();

        //Navigate to the url
        driver.get("https://jqueryui.com/");

        driver.findElement(By.linkText("Resizable")).click();

        driver.switchTo().frame(0);

        WebElement resizeButton = driver.findElement(By.cssSelector(".ui-resizable-se"));

        Actions resize = new Actions(driver);
        resize.clickAndHold(resizeButton).moveByOffset(200, 320).build().perform();

        System.out.println("Resized working");

        driver.quit();
    }
}
