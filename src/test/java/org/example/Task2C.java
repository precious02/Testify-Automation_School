package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task2C {
    public static void main(String[] args) {

        System.setProperty("webdriver.firefox.driver", "C:\\Users\\hp\\Desktop\\Testify\\CI_CD_Clone\\ci_cdtestify\\Module4Bselenium\\src\\geckodriver.exe");

        //Launch browser
        WebDriver driver2 = new FirefoxDriver();

        //To Maximize the browser
        driver2.manage().window().maximize();

        //Navigate to the url
        driver2.get("https://farmfresh.com/");
    }
}
