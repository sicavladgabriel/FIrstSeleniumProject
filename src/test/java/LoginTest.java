import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public void  loginWithValidData() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.header > div.header-upper > div.header-links-wrapper > div.header-links > ul > li:nth-child(2) > a")).click();
        driver.findElement(By.id("Email")).sendKeys("miguelito2000@gimmimail.com");
        driver.findElement(By.id("Password")).sendKeys("DbcpZS8twKZu8@k");
        driver.findElement(By.cssSelector("#main > div > div > div > div.page-body > div.customer-blocks > div.returning-wrapper.fieldset > form > div.buttons > button")).click();
        Thread.sleep(5000);

        driver.close();

    }

}
