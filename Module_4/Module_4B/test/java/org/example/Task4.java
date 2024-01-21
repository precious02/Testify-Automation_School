package org.example;

public class Task4 {
    public static void main(String[] args) {
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\Testify\\CI_CD_Clone\\ci_cdtestify\\Module4Bselenium\\src\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://demo.guru99.com/");


            driver.findElement(By.xpath("/html/body/div[1]/div[2]/nav/div/div/ul/li[6]/a")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div[2]/div/div/div[3]")).click(); //for the ad popup
            driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("presh@gmail.com");
            driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("P1resh2!!");

        }
}
