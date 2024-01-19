package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task11 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\Testify\\CI_CD_Clone\\ci_cdtestify\\Module4Bselenium\\src\\chromedriver.exe");

        //Launch browser
        WebDriver driver = new ChromeDriver();

        //To Maximize the browser
        driver.manage().window().maximize();

        //Navigate to the url
        driver.get("https://www.google.com/");

        driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();


        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("testify ltd");

        driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/img[1]")).click();

        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).click();

        driver.findElement(By.xpath("//body/div[@id='main']/div[@id='cnt']/div[@id='rcnt']/div[@id='center_col']/div[@id='res']/div[@id='search']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/a[1]/h3[1]")).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

        Thread.sleep(3000);

        driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]/*[1]")).click();

        driver.switchTo().alert().dismiss();



    }
}
