package Assertions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Tests {

    @Test
    public void addToCart() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/index.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.findElement(By.id("login2")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername"))).sendKeys("gionijohn");
        driver.findElement(By.id("loginpassword")).sendKeys("123456");
        driver.findElement(By.cssSelector("button[onclick='logIn()']")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("logInModal")));

        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Phones"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href*='idp_=7']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[onclick='addToCart(7)']"))).click();


        String alertText = wait.until(ExpectedConditions.alertIsPresent()).getText();
        assertEquals("Product added.", alertText);
        driver.switchTo().alert().accept();

        Thread.sleep(5000);
        driver.quit();

    }
    @Test
    public void loginWithValidData() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/index.html");
        driver.findElement(By.id("login2")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername"))
        );
        driver.findElement(By.id("loginusername")).sendKeys("gionijohn");
        driver.findElement(By.id("loginpassword")).sendKeys("123456");
        driver.findElement(By.cssSelector("button[onclick='logIn()']")).click();
        Thread.sleep(5000);

        WebElement welcomeUser = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser")));
        String actualText = welcomeUser.getText();
        assertEquals("Welcome gionijohn",actualText);

        driver.quit();


    }


    @Test
    public void registeredSuccesfully() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/index.html");
        driver.findElement(By.id("signin2")).click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement usersignupfield = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sign-username")));

        driver.findElement(By.id("sign-username")).sendKeys("juandehonduras");
        driver.findElement(By.id("sign-password")).sendKeys("1234567");
        driver.findElement(By.cssSelector("button[onclick='register()']")).click();
        Thread.sleep(5000);

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String textalert = alert.getText();
        assertEquals("Sign up successful.",textalert);
        alert.accept();


        driver.quit();


    }


    @Test
    public void registrationFailed() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/index.html");
        driver.findElement(By.id("signin2")).click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement usersignupfield = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sign-username")));

        driver.findElement(By.id("sign-username")).sendKeys("juandemata");
        driver.findElement(By.id("sign-password")).sendKeys("1234567");
        driver.findElement(By.cssSelector("button[onclick='register()']")).click();
        Thread.sleep(5000);


        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String textalert = alert.getText();
        assertEquals("This user already exist.",textalert);
        alert.accept();




        driver.quit();


    }



    @Test
    public void loginWithInvalidData() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/index.html");
        driver.findElement(By.id("login2")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement usernameField = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("loginusername"))
        );
        driver.findElement(By.id("loginusername")).sendKeys("gionijohn");
        driver.findElement(By.id("loginpassword")).sendKeys("1234567");
        driver.findElement(By.cssSelector("button[onclick='logIn()']")).click();
        Thread.sleep(5000);

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String textalert = alert.getText();
        assertEquals("Wrong password.",textalert);
        alert.accept();


        driver.quit();


    }


    @Test
    public void buyItem() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/index.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.findElement(By.id("login2")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername"))).sendKeys("gionijohn");
        driver.findElement(By.id("loginpassword")).sendKeys("123456");
        driver.findElement(By.cssSelector("button[onclick='logIn()']")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("logInModal")));

        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Laptops"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href*='idp_=15']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[onclick='addToCart(15)']"))).click();


        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String textalert = alert.getText();
        assertEquals("Product added.",textalert);
        alert.accept();

        driver.findElement(By.id("cartur")).click();
        driver.findElement(By.cssSelector("button[data-target='#orderModal']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("name")));
        driver.findElement(By.id("name")).sendKeys("Gioni John Johannson");
        driver.findElement(By.id("country")).sendKeys("Guatemala");
        driver.findElement(By.id("city")).sendKeys("Guatemala City");
        driver.findElement(By.id("card")).sendKeys("0258369147");
        driver.findElement(By.id("month")).sendKeys("June");
        driver.findElement(By.id("year")).sendKeys("2030");
        driver.findElement(By.cssSelector("button[onclick='purchaseOrder()']")).click();


        WebElement purchaseAlert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".sweet-alert h2")));
        String confirmationText = purchaseAlert.getText();
        assertEquals("Thank you for your purchase!",confirmationText);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".confirm"))).click();


        Thread.sleep(5000);
        driver.quit();

    }

    @Test
    public void loginAndFillContactForm() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/index.html");
        driver.findElement(By.id("login2")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername"))
        );
        driver.findElement(By.id("loginusername")).sendKeys("gionijohn");
        driver.findElement(By.id("loginpassword")).sendKeys("123456");
        driver.findElement(By.cssSelector("button[onclick='logIn()']")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("logInModal")));
        WebElement contact = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[data-target='#exampleModal']"))
        );
        contact.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("exampleModal")));

        driver.findElement(By.id("recipient-email")).sendKeys("gionijohn@gimmimail.com");
        driver.findElement(By.id("recipient-name")).sendKeys("Gioni John Johannson");
        driver.findElement(By.id("message-text")).sendKeys("I love my Mac, if I buy another one, do I get 50% discount for a phone? ");
        driver.findElement(By.cssSelector("button[onclick='send()']")).click();

        Alert messageAlert = wait.until(ExpectedConditions.alertIsPresent());
        String message = messageAlert.getText();
        assertEquals("Thanks for the message!!",message);

        messageAlert.accept();


        Thread.sleep(5000);
        driver.quit();


    }
        @Test
        public void bookFlight() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();
            driver.get("https://blazedemo.com/index.php");

            WebElement departureDropdown = driver.findElement(By.cssSelector("select[name='fromPort']"));
            Select drop2 = new Select(departureDropdown);
            drop2.selectByVisibleText("Mexico City");


            WebElement destinationDropdown =  driver.findElement(By.cssSelector("select[name='toPort']"));
            Select drop = new Select(destinationDropdown);
            drop.selectByVisibleText("Rome");

            driver.findElement(By.cssSelector("input[value='Find Flights']")).click();
            driver.findElement(By.cssSelector("input[value='Choose This Flight']")).click();

            driver.findElement(By.id("inputName")).sendKeys("Bergovici Novi");
            driver.findElement(By.id("address")).sendKeys("Strehovici Street 75");
            driver.findElement(By.id("city")).sendKeys("Novi Sad");
            driver.findElement(By.id("zipCode")).sendKeys("200500");

            WebElement cardType = driver.findElement(By.id("cardType"));
            Select type = new Select(cardType);
            type.selectByVisibleText("American Express");

            driver.findElement(By.id("creditCardNumber")).sendKeys("707552395185");
            driver.findElement(By.id("creditCardMonth")).sendKeys("12");
            driver.findElement(By.id("creditCardYear")).sendKeys("2030");
            driver.findElement(By.id("nameOnCard")).sendKeys("Bergovici Novi");

            driver.findElement(By.cssSelector("input[value='Purchase Flight']")).click();


            WebElement messageConfirmation = driver.findElement(By.tagName("h1"));
            Assert.assertTrue("Booking Failed!", messageConfirmation.getText().contains("Thank you for your purchase today!"));

            Thread.sleep(5000);
            driver.quit();

        }



    @Test
    public void searchItem() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://practicesoftwaretesting.com/");

        driver.findElement(By.cssSelector("input[formcontrolname='query']")).sendKeys("Thor Hammer");
        driver.findElement(By.cssSelector("button[data-test='search-submit']")).click();

        Thread.sleep(2000);

        WebElement firstResult = driver.findElement(By.cssSelector("div.card-body .card-title"));
        Assert.assertTrue(firstResult.getText().contains("Thor Hammer"));

        driver.quit();


    }

    @Test
    public void postOnBuzz() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='Username']")));

        driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("admin123");

        driver.findElement(By.cssSelector("button[type='submit']")).click();

        WebElement buzz = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href='/web/index.php/buzz/viewBuzz']")));
        driver.findElement(By.cssSelector("a[href='/web/index.php/buzz/viewBuzz']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("textarea[placeholder=\"What's on your mind?\"]")));

        driver.findElement(By.cssSelector("textarea[placeholder=\"What's on your mind?\"]")).sendKeys("Lovin' this job!");

        driver.findElement(By.cssSelector("button[type='submit']")).click();

        WebElement toast = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.cssSelector("div.oxd-toast-content")));

        Assert.assertTrue(toast.getText().contains("Success"));
        Assert.assertTrue(toast.getText().contains("Successfully Saved"));


        Thread.sleep(3000);
        driver.quit();


    }


}
