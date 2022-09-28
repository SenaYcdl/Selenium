package Odevler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev1_GetMethods {
    public static void main(String[] args) throws InterruptedException {

        /*
        Yeni bir package olusturalim : day01
Yeni bir class olusturalim : C03_GetMethods
Amazon sayfasina gidelim. https://www.amazon.com/
Sayfa basligini(title) yazdirin
Sayfa basliginin “Amazon” icerdigini test edin
Sayfa adresini(url) yazdirin
Sayfa url’inin “amazon” icerdigini test edin.
Sayfa handle degerini yazdirin
Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
Sayfayi kapatin.
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

       //amazon sayfasina gidelim
        driver.get("https://www.amazon.com");

        //Sayfa basligini(title) yazdirin
        System.out.println("Page Title: " + driver.getTitle());

        //Sayfa basliginin “Amazon” icerdigini test edin
        String actualTitle= driver.getTitle();
        String istenenKelime= "Amazon";
        if(actualTitle.contains(istenenKelime)){
            System.out.println("Title testing PASSED");
        } else System.out.println("Title testing FAILED");

        //Sayfa adresini(url) yazdirin
        System.out.println("Page Url:" + driver.getCurrentUrl());


        //Sayfa url’inin “amazon” icerdigini test edin.
        String actualUrl= driver.getCurrentUrl();
        String istenenUrl="amazon";
        if(actualUrl.contains(istenenUrl)){
            System.out.println("Url testing PASSED");
        } else System.out.println("Url testing FAILED");


        //Sayfa handle degerini yazdirin
        System.out.println("Page Window Handle" + driver.getWindowHandle());


        //Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        String actualPageSource= driver.getPageSource();
        String htmlArananKelime = "Gateway";
        if(actualPageSource.contains(htmlArananKelime)){
            System.out.println("Sourcecode testing PASSED");
        } else System.out.println("Sourcecode testing FAILED");


        //Sayfayi kapatin.
        Thread.sleep(5000);
        driver.close();



        /*
        Hocanin cozumu

        //Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //Sayfa basligini(title) yazdirin
        System.out.println("Sayfa başligi : "+driver.getTitle());

        //Sayfa basliginin “Amazon” icerdigini test edin
        String actualTitle = driver.getTitle();
        String istenenKelime = "Amazon";
        if(actualTitle.contains(istenenKelime)){
            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi FAILED");

        //Sayfa adresini(url) yazdirin
        System.out.println("Sayfanın Url'i : "+driver.getCurrentUrl());

        //Sayfa url’inin “amazon” icerdigini test edin.
        String actualUrl = driver.getCurrentUrl();
        String arananKelime = "amazon";
        if(actualUrl.contains(arananKelime)){
            System.out.println("Url Testi PASSED");
        }else System.out.println("Url Testi FAILED");

        //Sayfa handle degerini yazdirin
        System.out.println("Handle değeri : "+driver.getWindowHandle());

        //Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        String actualPageSource = driver.getPageSource();
        String htmlArananKelime = "Gateway";
        if (actualPageSource.contains(htmlArananKelime)){
            System.out.println("Sourcecode Testi PASSED");
        }else System.out.println("Sourcecode Testi FAILED");


        //Sayfayi kapatin.
        driver.close();
         */
    }
}
