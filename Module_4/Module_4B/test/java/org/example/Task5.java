package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\Testify\\CI_CD_Clone\\ci_cdtestify\\Module4Bselenium\\src\\chromedriver.exe");
        WebDriver driver5 = new ChromeDriver();
        driver5.manage().window().maximize();
        driver5.get("https://www.saucedemo.com/");

        driver5.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input")).sendKeys("problem_user");
        driver5.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[2]/input")).sendKeys("secret_sauce");
        driver5.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        Thread.sleep(5000);

        driver5.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[5]/div[2]/div[2]/button")).click();
        Thread.sleep(5000);
        driver5.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        Thread.sleep(5000);
        driver5.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
        Thread.sleep(5000);

    }
}
