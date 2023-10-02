import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.time.Duration;

public class GoogleTest {

    @Test
    public void testSearch1() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        String title = driver.getTitle();
        Assert.assertEquals("Web form", title);

//        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement textBox = driver.findElement(By.name("my-text"));
        WebElement submitButton = driver.findElement(By.cssSelector("button"));

        textBox.sendKeys("Selenium");
        submitButton.click();

        WebElement message = driver.findElement(By.id("message"));
        String value = message.getText();
        Assert.assertEquals("Received!", value);

        driver.quit();
    }

    @Test
    public void testSearch2() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        WebElement textBox = driver.findElement(By.className("gLFyf"));
        textBox.sendKeys("Selenium");

        Thread.sleep(1000);

        WebElement searchButton = driver.findElement(By.className("gNO89b"));
        searchButton.click();

        WebElement title = driver.findElement(By.xpath("//div/span[@class = \"VuuXrf\"]"));
        String value = title.getText();
        Assert.assertEquals("Selenium", value);

        driver.quit();
    }
}