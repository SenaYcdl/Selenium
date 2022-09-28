package Odevler;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.logging.SocketHandler;

public class Tekrar03 {
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

        //web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();


        //Search(ara) “city bike”
         driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("city bike", Keys.ENTER);

         // Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> results=driver.findElements(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[1]"));

        for (WebElement result: results) {
            System.out.println(result.getText() + " city bike");


            //Sonra karşınıza çıkan ilk sonucun resmine tıklayın
            driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).click();
            Thread.sleep(2000);

          driver.close();

        }

    }
}
