package org.example.Task19.Task18SauceDemo;

import org.example.PageObject.LoginPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class classA {
    WebDriver driver = null;


    @Test(groups = {"one"})
    public void openBrowser() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\Testify\\CI_CD_Clone\\ci_cdtestify\\Module4Bselenium\\src\\chromedriver.exe");

        //Launch browser
        driver = new ChromeDriver();

        //To Maximize the browser
        driver.manage().window().maximize();


        //launch URl
        driver.get("https://www.saucedemo.com/");

        System.out.println("---Launch Website---");

        LoginPageObject login = new LoginPageObject(driver);
        login.getUserName().sendKeys("standard_user");
        login.getPassWord().sendKeys("secret_sauce");
        login.getLogin().click();

        Thread.sleep(5000);
        System.out.println("Successful login");

        SoftAssert assertHomepage = new SoftAssert();
        String myHomePage = driver.findElement(By.xpath("//div[@id='']")).getText();

        assertHomepage.assertEquals(myHomePage, "Swag Labs");
        System.out.println("This is the HomePage for Sauce Demo");



    }


    @Test
    public void closeBrowser () {
        driver.quit();
    }

}
