import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    @Test
    public void testSearchGoogle() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("Selenium lessons");
        //WebElement buttonSearch = driver.findElement(By.name("btnK"));
        searchInput.submit();
        driver.quit();
    }
}
