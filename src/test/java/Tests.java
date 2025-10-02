import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Tests {




    @Test
    public void register() throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.cssSelector("a[class='ico-register']")).click();
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Sebastian");
        driver.findElement(By.id("LastName")).sendKeys("Christiansen");
        driver.findElement(By.id("Email")).sendKeys("chrisseb@gimmimail.com");
        driver.findElement(By.id("Company")).sendKeys("Wakawakaeheh");
        driver.findElement(By.id("Password")).sendKeys("123456789");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("123456789");
        driver.findElement(By.id("register-button")).click();

        Thread.sleep(5000);

        driver.close();


    }

    @Test
    public void  loginWithValidData() throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
    WebDriver driver = new ChromeDriver();


    driver.manage().window().maximize();
    driver.get("https://demo.nopcommerce.com/");
    driver.findElement(By.cssSelector("a[class='ico-login']")).click();
    driver.findElement(By.id("Email")).sendKeys("chrisseb@gimmimail.com");
    driver.findElement(By.id("Password")).sendKeys("123456789");
    driver.findElement(By.cssSelector(".login-button")).click();
    Thread.sleep(5000);

    driver.close();

}







    @Test
    public void  wishList() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.cssSelector("a[class='ico-login']")).click();
        driver.findElement(By.id("Email")).sendKeys("chrisseb@gimmimail.com");
        driver.findElement(By.id("Password")).sendKeys("123456789");
        driver.findElement(By.cssSelector(".login-button")).click();
        driver.findElement(By.cssSelector("a[href='/apparel']")).click();


        driver.findElement(By.linkText("Shoes")).click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("adidas Consortium Campus 80s Running Shoes"))).click();



        WebElement sizeDropdown = driver.findElement(By.id("product_attribute_9"));
        Select size = new Select(sizeDropdown);
        size.selectByVisibleText("10");
        driver.findElement(By.id("add-to-wishlist-button-27")).click();
        driver.findElement(By.cssSelector(".wishlist-label")).click();

        Thread.sleep(5000);

        driver.close();

    }
    @Test
    public void  addtocart() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.cssSelector("a[class='ico-login']")).click();
        driver.findElement(By.id("Email")).sendKeys("chrisseb@gimmimail.com");
        driver.findElement(By.id("Password")).sendKeys("123456789");
        driver.findElement(By.cssSelector(".login-button")).click();
        driver.findElement(By.cssSelector("a[href='/apparel']")).click();


        driver.findElement(By.linkText("Shoes")).click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("adidas Consortium Campus 80s Running Shoes"))).click();

        WebElement sizeDropdown = driver.findElement(By.id("product_attribute_9"));
        Select size = new Select(sizeDropdown);
        size.selectByVisibleText("10");
        driver.findElement(By.id("add-to-cart-button-27")).click();
        driver.findElement(By.cssSelector(".cart-label")).click();

        Thread.sleep(5000);

        driver.close();



    }


    @Test
    public void  changeCurrency() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.cssSelector("a[class='ico-login']")).click();
        driver.findElement(By.id("Email")).sendKeys("chrisseb@gimmimail.com");
        driver.findElement(By.id("Password")).sendKeys("123456789");
        driver.findElement(By.cssSelector(".login-button")).click();

        WebElement currencyDropdown = driver.findElement(By.id("customerCurrency"));
        Select currency = new Select(currencyDropdown);
        currency.selectByVisibleText("Euro");

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href='/gift-cards']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href='/100-physical-gift-card']"))).click();

    }






}
