
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
        import org.testng.Assert;
        import org.testng.annotations.AfterMethod;
        import org.testng.annotations.BeforeMethod;
        import org.testng.annotations.Test;
        import io.github.bonigarcia.wdm.WebDriverManager;






public class FirstTest {

    //-----------------------------------Global Variables-----------------------------------
    //Declare a Webdriver variable
    public WebDriver driver;

    //Declare a test URL variable
    public String testURL = "http://ey.com/";

    //-----------------------------------Test Setup-----------------------------------
    @BeforeMethod
    public void setupTest (){
        WebDriverManager.chromedriver().setup();
        //Create a new ChromeDriver
        driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();

        //Go to www.swtestacademy.com
        driver.navigate().to(testURL);
    }

    //-----------------------------------Tests-----------------------------------
    @Test
    public void firstTest () {
        //Get page title
        String title = driver.getTitle();

        //Print page's title
        System.out.println("Page Title: " + title);


        //driver.findElement(By.id("fakebox-ib")).sendKeys("Selenium");
        //driver.findElement(By.name("btnK")).click();

        //Write 2+2 in google textbox
        driver.findElement(By.className("search-query")).sendKeys("jobs");
        driver.findElement(By.className("button")).click();


        //googleTextBox.sendKeys("2+2");

        //Click on searchButton
        //WebElement searchButton = driver.findElement(By.id("gbqfb"));
        //searchButton.click();

        //Assertion
        //Assert.assertEquals(title, "Software Test Academya", "Title assertion is failed!");
    }

    //-----------------------------------Test TearDown-----------------------------------
    @AfterMethod
    public void teardownTest (){
        //Close browser and end the session
        driver.quit();
    }
}
