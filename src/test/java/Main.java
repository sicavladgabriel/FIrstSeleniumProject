import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {


//  Wishlist Test
        WishListTest test = new WishListTest();
        test.wishList();
 // Login Test
        LoginTest testLogin = new LoginTest();
        testLogin.loginWithValidData();
//  Register Test
        RegisterTest rgtest = new RegisterTest();
        rgtest.register();





    }
}

