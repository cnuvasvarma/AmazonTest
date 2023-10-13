import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest {
    @Test
    public void testAmazonUrl(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\vas\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");

        String expectedUrl = "https://www.amazon.in/";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl,"URLs do not match");

        String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle,"Amazon page title does not match");

    }
}
