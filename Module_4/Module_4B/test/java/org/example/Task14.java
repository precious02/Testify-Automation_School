package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task14 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\Testify\\CI_CD_Clone\\ci_cdtestify\\Module4Bselenium\\src\\chromedriver.exe");

        //Launch browser
        WebDriver driver = new ChromeDriver();

        //To Maximize the browser
        driver.manage().window().maximize();

        //Navigate to the url
        driver.get("https://www.toolsqa.com/");

        System.out.println("No dialog box seen");

        driver.findElement(By.xpath("//span[contains(text(),'Tutorials')]")).click();

    }
}
