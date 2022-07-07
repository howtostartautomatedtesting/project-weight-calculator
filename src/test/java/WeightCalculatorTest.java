import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WeightCalculatorTest {

    @Test
    public void openPageTest(){
        By inputNameLocator = By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input");
        By inputHeightLocator = By.xpath("//input[@name='height']");
        By inputWeightLocator = By.name("weight");
        String name = "IVAN";
        String height = "183";
        String weight = "80";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        WebElement inputName =  driver.findElement(inputNameLocator);
        inputName.sendKeys(name);
        WebElement inputHeight =  driver.findElement(inputHeightLocator);
        inputHeight.sendKeys(height);
        WebElement inputWeight =  driver.findElement(inputWeightLocator);
        inputWeight.sendKeys(weight);
        driver.quit();
    }
}
