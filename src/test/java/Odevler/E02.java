package Odevler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class E02 {
    public static void main(String[] args) throws InterruptedException {



        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();


        driver.findElement(By.name("search_query")).sendKeys("Cem Karaca Ay Karanlik");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon")).click();
        Thread.sleep(2000);

       driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-video-renderer[1]/div[1]/div/div[1]/div/h3/a/yt-formatted-string")).click();








    }
}
