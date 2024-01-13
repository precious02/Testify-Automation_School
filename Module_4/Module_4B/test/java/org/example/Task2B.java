package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2B {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\Testify\\CI_CD_Clone\\ci_cdtestify\\Module4Bselenium\\src\\chromedriver.exe");

        //Launch browser
        WebDriver driver3 = new ChromeDriver();

        //To Maximize the browser
        driver3.manage().window().maximize();

        //Navigate to the url
        driver3.get("https://www.youtube.com/");
    }
}
