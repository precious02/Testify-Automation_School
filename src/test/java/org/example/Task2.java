package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "C:\\Users\\hp\\Desktop\\Testify\\CI_CD_Clone\\ci_cdtestify\\Module4Bselenium\\src\\msedgedriver.exe");

        //Launch browser
        WebDriver driver = new EdgeDriver();

        //To Maximize the browser
        driver.manage().window().maximize();

        //Navigate to the url
        driver.get("https://thinksmartbox.com/");



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\Testify\\CI_CD_Clone\\ci_cdtestify\\Module4Bselenium\\src\\chromedriver.exe");

        //Launch browser
        WebDriver driver3 = new ChromeDriver();

        //To Maximize the browser
        driver3.manage().window().maximize();

        //Navigate to the url
        driver3.get("https://www.youtube.com/");





        System.setProperty("webdriver.firefox.driver", "C:\\Users\\hp\\Desktop\\Testify\\CI_CD_Clone\\ci_cdtestify\\Module4Bselenium\\src\\geckodriver.exe");

        //Launch browser
        WebDriver driver2 = new FirefoxDriver();

        //To Maximize the browser
        driver2.manage().window().maximize();

        //Navigate to the url
        driver2.get("https://farmfresh.com/");






    }
}
