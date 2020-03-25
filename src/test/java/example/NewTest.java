package example;
import org.testng.annotations.Test;
//import org.junit.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
//import org.junit.Before;
//import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
public class NewTest {
	private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();


  @BeforeTest
  public void beforeTest() {
    System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "http://localhost:8004/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  @AfterTest
  public void afterTest() {
    driver.quit();
  }
  @Test
  public void test() {
    driver.get("http://localhost:8004/login");
    driver.manage().window().setSize(new Dimension(833, 651));
    driver.findElement(By.id("account")).sendKeys("89");
    driver.findElement(By.id("password")).sendKeys("1234");
    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
  }

}
