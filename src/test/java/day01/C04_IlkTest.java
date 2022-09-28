package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_IlkTest {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        /*
        1-amazon sayfasina gidiniz
        2-basligin "Amazon" icerdigini test ediniz
        3-url nin amazon icerdigini test edin
        4-sayfayi kapatin
         */

        //1- Amazon sayfasına gidiniz
        driver.get("https://www.amazon.com");

        //2- Başlığın "Amazon" içerdiğini test ediniz
        String actualTitle = driver.getTitle();
        String istenenKelime = "Amazon";
        if (actualTitle.contains(istenenKelime)){
            System.out.println("Title testi PASSED");
        } else System.out.println("Title testi FAILED");

        //3- Url'nin Amazon içerdiğini test ediniz
        String actualUrl = driver.getCurrentUrl();
        String arananKelime = "Amazon";
        if (actualUrl.contains(arananKelime)){
            System.out.println("Url testi PASSED");
        }else System.out.println("Url testi FAILED");


        //4- Sayfayı kapatınız
        driver.close();
    }

}
