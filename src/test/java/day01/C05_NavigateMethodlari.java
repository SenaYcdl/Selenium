package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.amazon.com");
        //driver.navigate().to(); methodu sayfada ileri geri yapicaksak kullanilir
        //drivere.get() methodu gibi bizi istedigimiz Url e goturur
        driver.navigate().to("http://www.techproeducation.com");

        //tekrar Amazon sayfasina donelim
        Thread.sleep(3000); //3 saniye bekletip sayfaya geciyoruz
        driver.navigate().back(); //bir onceki sayfaya geri doner

        //tekrar Techpro sayfasina gidelim
        Thread.sleep(3000);
        driver.navigate().forward(); //ilk sayfadan ileriye gider

        //techproed sayfasini yenileyelim
        driver.navigate().refresh(); //sayfayi yeniler

        //son olarak sayfayi kapatalim
        driver.close();







    }
}
