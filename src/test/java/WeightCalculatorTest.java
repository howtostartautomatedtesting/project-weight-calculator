import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WeightCalculatorTest {

    @Test
    public void openPageTest(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        driver.quit();
    }
}
