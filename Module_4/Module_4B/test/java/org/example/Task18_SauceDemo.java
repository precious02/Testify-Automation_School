package org.example;

import org.example.PageObject.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class Task18_SauceDemo {
    WebDriver driver = null;


    @BeforeClass
    public void openBrowser() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\Testify\\CI_CD_Clone\\ci_cdtestify\\Module4Bselenium\\src\\chromedriver.exe");

        //Launch browser
        driver = new ChromeDriver();

        //To Maximize the browser
        driver.manage().window().maximize();

        //Add implicit wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);


        //launch URl
        driver.get("https://www.saucedemo.com/");

        System.out.println("---Launch Website---");


    }
    @Test(priority = 1)
    public void demoUser() throws InterruptedException {
        LoginPageObject login = new LoginPageObject(driver);
        login.getUserName().sendKeys("standard_user");
        login.getPassWord().sendKeys("secret_sauce");
        login.getLogin().click();

        Thread.sleep(5000);
        System.out.println("Successful login");

    }

    @Test(priority = 2)
    public void itemSelection () throws InterruptedException {
        ProductPageObject product = new ProductPageObject(driver);
        product.addToCart().click();
        product.clickCartIcon().click();
        System.out.println("Item selected successfully");

        Thread.sleep(5000);
    }

    @Test(priority = 3)
    public void assertionCheckOut() throws InterruptedException {
        CartPageObject yourCart = new CartPageObject(driver);
        String cartText = "Sauce Labs Backpack";
        SoftAssert confirm = new SoftAssert();
        confirm.assertEquals(cartText, "Sauce Labs Backpack");
        System.out.println(cartText);
        yourCart.clickCheckOutButton().click();
        System.out.println("Successfully verified item");
        confirm.assertAll();

        Thread.sleep(5000);
    }

    @Test(priority = 4)
    public void CheckoutButton() throws InterruptedException {
        CheckoutPage checkoutObj = new CheckoutPage(driver);
        checkoutObj.getFirstName().sendKeys("Precious");
        checkoutObj.getLastName().sendKeys("Nzekwe");
        checkoutObj.getZipCode().sendKeys("00ABC2");

        Thread.sleep(3000);
        checkoutObj.clickContinue().click();
        System.out.println("CheckOut successfully clicked");

        Thread.sleep(5000);

    }

    @Test(priority = 5)
    public void assertEnd() throws InterruptedException {
        CheckOverViewPage overviewObj = new CheckOverViewPage(driver);
        String cartTextTwo = "Sauce Labs Backpack";
        SoftAssert confirmTwo = new SoftAssert();
        confirmTwo.assertEquals(cartTextTwo, "Sauce Labs Backpack");
        System.out.println("Overview Page is visible");
        overviewObj.clickFinishButton().click();
        System.out.println("Assertion of Selected item and click button");
        confirmTwo.assertAll();

        Thread.sleep(5000);
    }
    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }

}
