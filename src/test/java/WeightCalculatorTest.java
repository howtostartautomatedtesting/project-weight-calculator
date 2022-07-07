import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import step.WeightCalculatorStep;

public class WeightCalculatorTest {

    @Test
    public void openPageTest() {
        By resultMessageLocator = By.xpath(" //tr[2]/td[2]");
        String name = "IVAN";
        String height = "183";
        String weight = "80";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");

        WeightCalculatorStep weightCalculatorStep = new WeightCalculatorStep(driver);
        weightCalculatorStep.fillFormAndSubmit(name,height,weight);

        WebElement actualResult = driver.findElement(resultMessageLocator);
        String actualResultMessage = actualResult.getText();
        String expectedResultMessage = "Идеальная масса тела";
        Assert.assertEquals(expectedResultMessage, actualResultMessage);

        driver.quit();
    }
}
