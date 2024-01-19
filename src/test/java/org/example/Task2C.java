package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Task2C {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "C:\\Users\\hp\\Desktop\\Testify\\CI_CD_Clone\\ci_cdtestify\\Module4Bselenium\\src\\msedgedriver.exe");

        //Launch browser
        WebDriver driver2 = new EdgeDriver();

        //To Maximize the browser
        driver2.manage().window().maximize();

        //Navigate to the url
        driver2.get("https://farmfresh.com/");
    }
}
