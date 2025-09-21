import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WishListTest {


    public void  wishList() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.header > div.header-upper > div.header-links-wrapper > div.header-links > ul > li:nth-child(2) > a")).click();
        driver.findElement(By.id("Email")).sendKeys("miguelito2000@gimmimail.com");
        driver.findElement(By.id("Password")).sendKeys("DbcpZS8twKZu8@k");
        driver.findElement(By.cssSelector("#main > div > div > div > div.page-body > div.customer-blocks > div.returning-wrapper.fieldset > form > div.buttons > button")).click();
        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.header-menu > ul.top-menu.notmobile > li:nth-child(3) > a")).click();
        driver.findElement(By.cssSelector("#main > div > div.side-2 > div.block.block-category-navigation > div.listbox > ul > li.active.last > ul > li:nth-child(1) > a")).click();
        driver.findElement(By.cssSelector("#main > div > div.center-2 > div > div.page-body > div.products-container > div.products-wrapper > div > div > div:nth-child(1) > div > div.details > h2 > a")).click();

        WebElement sizeDropdown = driver.findElement(By.id("product_attribute_9"));
        Select size = new Select(sizeDropdown);
        size.selectByVisibleText("10");
        driver.findElement(By.id("add-to-wishlist-button-27")).click();
        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.header > div.header-upper > div.header-links-wrapper > div.header-links > ul > li:nth-child(3) > a > span.wishlist-label")).click();

        Thread.sleep(5000);

        driver.close();

    }



}
