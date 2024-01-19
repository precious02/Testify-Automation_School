package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\Testify\\CI_CD_Clone\\ci_cdtestify\\Module4Bselenium\\src\\chromedriver.exe");

        //Launch browser
        WebDriver driver = new ChromeDriver();

        //To Maximize the browser
        driver.manage().window().maximize();

        //Navigate to the url
        driver.get(" https://jqueryui.com/ ");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(text(),'Dialog')]")).click();
        Thread.sleep(3000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");

        WebElement iframe = driver.findElement(By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]"));
        driver.switchTo().frame(iframe);

        Thread.sleep(3000);

        driver.findElement(By.cssSelector(".ui-button-icon")).click();;

        Thread.sleep(3000);
    }
}
