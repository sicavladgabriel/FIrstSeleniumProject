import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {


public void register() throws InterruptedException {


    System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
    WebDriver driver = new ChromeDriver();

    driver.manage().window().maximize();
    driver.get("https://demo.nopcommerce.com/");

    driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.header > div.header-upper > div.header-links-wrapper > div.header-links > ul > li:nth-child(1) > a")).click();
    driver.findElement(By.id("gender-male")).click();
    driver.findElement(By.id("FirstName")).sendKeys("Sebastian");
    driver.findElement(By.id("LastName")).sendKeys("Christiansen");
    driver.findElement(By.id("Email")).sendKeys("chrisseb@gimmimail.com");
    driver.findElement(By.id("Company")).sendKeys("Wakawakaeheh");
    driver.findElement(By.id("Password")).sendKeys("123456789");
    driver.findElement(By.id("ConfirmPassword")).sendKeys("123456789");
//        driver.findElement(By.id("register-button")).click();

    Thread.sleep(5000);

    driver.close();









}







}
