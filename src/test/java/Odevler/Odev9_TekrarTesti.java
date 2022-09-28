package Odevler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev9_TekrarTesti {
    public static void main(String[] args) throws InterruptedException {


/*
        Tekrar Testi
        1-C01_TekrarTesti isimli bir class olusturun
        2- https://www.amazon.com/ adresine gidin
        3- Browseri tam sayfa yapin
        4-Sayfayi “refresh” yapin
        5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        6- Gift Cards sekmesine basin
        7- Birthday butonuna basin
        8- Best Seller bolumunden ilk urunu tiklayin
        9- Gift card details’den 25 $’i secin
        10-Urun ucretinin 25$ oldugunu test edin
       11-Sayfayi kapatin
 */


        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();


        //https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com");


        //Browseri tam sayfa yapin
        //4-Sayfayi “refresh” yapin
        driver.manage().window().maximize();
        driver.navigate().refresh();

        //5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String actualtitle= driver.getTitle();
        String title= "Spend less";
        if (actualtitle.contains(title)) {
            System.out.println("Page contains Spend less Title");
        } else System.out.println("Page contains no Spend less Title");


        //Gift Cards sekmesine basin
        driver.findElement(By.xpath("//*[text()='Gift Cards']")).click();


        // Birthday butonuna basin
        driver.findElement(By.xpath("//*[@alt='Birthday gift cards']")).click();

        //Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("(//*[@alt='Amazon.com eGift Card'])[1]")).click();


       // Gift card details’den 25 $’i secin
        driver.findElement(By.id("gc-mini-picker-amount-1")).click();

        Thread.sleep(2000);

        //Urun ucretinin 25$ oldugunu test edin
        WebElement price= driver.findElement(By.xpath("//*[@id='gc-live-preview-amount']"));
        if (price.isDisplayed()) {
            System.out.println("PASSED: " + price.getText());
        }else System.out.println("FAILED: " + price.getText());


        //sayfayı kapatın
        driver.quit();
    }
}
