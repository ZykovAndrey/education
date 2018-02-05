package HelloNeHello;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class TestSelenium {

    @Test
    public void testHabraSearch() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C://Program Files (x86)//Google//WebDrivers//chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://habrahabr.ru/");
        Thread.sleep(2000);
        chromeDriver.findElement(By.linkText("Компании")).click();
        Thread.sleep(2000);
        WebElement find = chromeDriver.findElement(By.id("companies_suggest"));
        find.sendKeys("ФБК");
        Thread.sleep(2000);

        chromeDriver.findElement(By.id("companies"));
        chromeDriver.findElement(By.id("company_1647"));
        WebElement name = chromeDriver.findElement(By.cssSelector(".list-snippet__desc"));
        chromeDriver.findElement(By.cssSelector(".table-grid__item.table-grid__item_right"));
        chromeDriver.findElement(By.cssSelector(".stats.stats_inline"));
        WebElement subscribers = chromeDriver
                .findElement(By.cssSelector(".stats__counter.stats__counter_table-grid.stats__counter_subscribers"));
        WebElement rating = chromeDriver
                .findElement(By.cssSelector(".stats__counter.stats__counter_table-grid.stats__counter_rating"));

        System.out.println("Название компании: " + name.getText());
        System.out.println("Подписчики: " + subscribers.getText());
        System.out.println("Рейтинг: " + rating.getText());

        chromeDriver.quit();
    }

    @Test
    public void testOzonSearch() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://Program Files (x86)//Google//WebDrivers//chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://ozon.ru/");
        chromeDriver.findElement(By.xpath("//*[@id=\"form1\"]/div/div[3]/div[2]/a[1]")).click();
        chromeDriver.findElement(By.xpath("//*[@id=\"PageCenter\"]/div[6]/div/div[1]/a")).click();
        chromeDriver.findElement(By.xpath("//*[@id=\"bTilesModeShow\"]/div[1]/div[4]/div[1]/div")).click();
        WebElement countElement = (new WebDriverWait(chromeDriver, 5)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"form1\"]/div/div[2]/div[2]/div[4]/a/div[1]/div"))));
        chromeDriver.findElement((By.cssSelector("#bTilesModeShow > div:nth-child(2) > div.eOneTile_saleBlock.js_saleblock > div.eOneTile_buttonWrap.inline.js_tb > div"))).click();
        new WebDriverWait(chromeDriver, 5)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"form1\"]/div/div[2]/div[2]/div[4]/a/div[1]/div")));

        chromeDriver.findElement(By.xpath("//*[@id=\"form1\"]/div/div[2]/div[2]/div[4]/a/div[2]")).click();
        Thread.sleep(4000);
        chromeDriver.findElement(By.xpath("//*[@id=\"PageCenter\"]/div[2]/div[3]/div[1]/div[3]/div[1]/div/div/div[1]/div/div[2]/div/div[2]/div[4]/div/div[1]")).click();
        Thread.sleep(4000);
        chromeDriver.findElement(By.cssSelector("#PageCenter > div:nth-child(2) > div.bCartPage > div.eCartPage_inner > div.eCartPage_flexBlocks > div:nth-child(1) > div > div > div.jsViewCollection.jsChild_DOM_split > div > div.eCartSplitItems > div > div.bCartItem.jsChild_DOM_items_140129695 > div.eCartItem_count > div > div.eCartCount_button.mMinus.jsMinus")).click();
        Thread.sleep(4000);
        chromeDriver.findElement(By.xpath("//*[@id=\"form1\"]/div/div[2]/a")).click();

        chromeDriver.quit();

    }


}
