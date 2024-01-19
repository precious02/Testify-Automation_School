package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\Testify\\CI_CD_Clone\\ci_cdtestify\\Module4Bselenium\\src\\chromedriver.exe");

        //Launch browser
        WebDriver driver = new ChromeDriver();

        //To Maximize the browser
        driver.manage().window().maximize();

        //Navigate to the url
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys("visual_user");

        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();

        Thread.sleep(5000);

        driver.navigate().back();

        Thread.sleep(5000);

        String loginValue = driver.findElement(By.cssSelector("#login-button")).getAttribute("value");

        System.out.println(loginValue);

        driver.navigate().forward();

        String nameOfProduct = driver.findElement(By.cssSelector("a[id='item_2_title_link'] div[class='inventory_item_name ']")).getText();

        System.out.println(nameOfProduct);


    }
}
