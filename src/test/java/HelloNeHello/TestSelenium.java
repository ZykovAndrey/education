package HelloNeHello;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {
    @Test
    public void testGoogleSearch() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C://Program Files (x86)//Google//WebDrivers//chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("http://www.google.com/");
        Thread.sleep(3000);
        WebElement element = chromeDriver.findElement(By.name("q"));
        Thread.sleep(3000);
        element.sendKeys("ФБК");
        Thread.sleep(3000);
        element.submit();
        Thread.sleep(3000);
        chromeDriver.findElement(By.cssSelector("a[href*='https://fbk.info']")).click();
        Thread.sleep(6000);
        //WebElement testPars = chromeDriver.findElement(By.className("articleTest"));
        //Thread.sleep(3000);

        //System.out.println(testPars.getText());
        chromeDriver.quit();
    }

}
