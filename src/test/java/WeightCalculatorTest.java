import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WeightCalculatorTest {

    @Test
    public void openPageTest(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        WebElement inputName =  driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input"));
        inputName.sendKeys("IVAN");
        driver.quit();
    }
}
