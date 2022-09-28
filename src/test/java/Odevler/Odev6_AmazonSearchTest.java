package Odevler;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.util.List;

public class Odev6_AmazonSearchTest {
    public static void main(String[] args) throws InterruptedException {

        /*
        1. Bir class oluşturun : AmazonSearchTest
2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
a.web sayfasına gidin. https://www.amazon.com/
b. Search(ara) “city bike”
c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
d. Sonra karşınıza çıkan ilk sonucun resmine tıklayın
         */


        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //a.web sayfasına gidin. https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com");
        driver.manage().window().maximize();


        //b. Search(ara) “city bike”
        WebElement search = driver.findElement(By.name("field-keywords"));
        search.sendKeys("city bike", Keys.ENTER);


        //c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> products = driver.findElements(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[1]"));

        for (WebElement product : products) {
            System.out.println(product.getText() + " city bike");
        }

        //d. Sonra karşınıza çıkan ilk sonucun resmine tıklayın
        WebElement bike=driver.findElement(By.className("s-image"));

        bike.click();
        Thread.sleep(2000);
        driver.close();

    }
}
