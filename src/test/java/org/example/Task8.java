package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\Testify\\CI_CD_Clone\\ci_cdtestify\\Module4Bselenium\\src\\chromedriver.exe");

        //Launch browser
        WebDriver driver = new ChromeDriver();

        //To Maximize the browser
        driver.manage().window().maximize();

        //Navigate to the url
        driver.get("https://idorenyinankoh.github.io/loginPage/");

        boolean state = driver.findElement(By.id("create")).isEnabled();

        System.out.println(state);

        driver.findElement(By.id("firstName")).sendKeys("Precious");

        driver.findElement(By.id("lastName")).sendKeys("Nwafor");

        driver.findElement(By.id("email")).sendKeys("nzekwepresh97@gmail.com");

        driver.findElement(By.id("female")).click();

        driver.findElement(By.id("password")).sendKeys("Sout23!!ert");

        driver.findElement(By.id("confirmPass")).sendKeys("Sout23!!ert");

        driver.findElement(By.id("xpLevel")).sendKeys("I am great at what I do.");

        boolean state2 = driver.findElement(By.id("create")).isEnabled();

        System.out.println(state2);


        //NOT COMPLETE





    }
}
