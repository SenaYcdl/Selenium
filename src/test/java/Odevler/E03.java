package Odevler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E03 {
    public static void main(String[] args) throws InterruptedException {



        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://youtube.com");
        driver.manage().window().maximize();

        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id='search']"));
        aramaKutusu.sendKeys("amy macdonald lets start a band");
        WebElement aramaButonu = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
        aramaButonu.click();

        Thread.sleep(1000);
        WebElement open=driver.findElement(By.xpath("//a[@href='/watch?v=2iwfeFNrA5A']"));
        open.click();
    }
}
