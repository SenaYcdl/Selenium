package Odevler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev3_Tekrar {
    public static void main(String[] args) throws InterruptedException {

        /*
        1.Yeni bir class olusturalim (Homework)
2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
yazdirin.
4.https://www.walmart.com/ sayfasina gidin.
5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
6. Tekrar “facebook” sayfasina donun
7. Sayfayi yenileyin
8. Sayfayi tam sayfa (maximize) yapin
9.Browser’i kapatin

         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();


        //facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://www.facebook.com");
        Thread.sleep(2000);

        String pageTitle=driver.getTitle();
        String title="facebook";
        String result= pageTitle.contains(title) ? "PASSED" : driver.getTitle();
        System.out.println("Actual Title: " + result);


        //Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        //yazdirin.
        String actualUrl = driver.getCurrentUrl();
        String istenenUrl="facebook";
        String result1=actualUrl.contains(istenenUrl)? "PASSED" : driver.getCurrentUrl();
        System.out.println("Page Url:" + result1);


        //4.https://www.walmart.com/ sayfasina gidin.
        driver.navigate().to("https://www.walmart.com");


        //5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String WalmartTitle=driver.getTitle();
        String istenenTitle="Walmart.com";
        String result2=WalmartTitle.contains(istenenTitle)? "PASSED" : driver.getTitle();
        System.out.println("Page Title: " + result2);


        //6. Tekrar “facebook” sayfasina donun
        driver.navigate().back();


        //Sayfayi yenileyin
        //8. Sayfayi tam sayfa (maximize) yapin
        //9.Browser’i kapatin

        driver.navigate().refresh();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.quit();


    }
}
