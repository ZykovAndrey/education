package HelloNeHello;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
        WebElement subscribers = chromeDriver.findElement(By.cssSelector(".stats__counter.stats__counter_table-grid.stats__counter_subscribers"));
        WebElement rating = chromeDriver.findElement(By.cssSelector(".stats__counter.stats__counter_table-grid.stats__counter_rating"));

        System.out.println("Название компании: " + name.getText());
        System.out.println("Подписчики: " + subscribers.getText());
        System.out.println("Рейтинг: " + rating.getText());

        chromeDriver.quit();
    }

}
