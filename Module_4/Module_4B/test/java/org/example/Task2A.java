package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Task2A {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "C:\\Users\\hp\\Desktop\\Testify\\CI_CD_Clone\\ci_cdtestify\\Module4Bselenium\\src\\msedgedriver.exe");

        //Launch browser
        WebDriver driver = new EdgeDriver();

        //To Maximize the browser
        driver.manage().window().maximize();

        //Navigate to the url
        driver.get("https://thinksmartbox.com/");


    }
}
