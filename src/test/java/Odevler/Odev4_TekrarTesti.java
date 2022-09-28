package Odevler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev4_TekrarTesti {
    public static void main(String[] args) {

        /*
        1. Yeni bir class olusturun (TekrarTesti)
2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın
(verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru
URL'yi yazdırın.
4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
5. Youtube sayfasina geri donun
6. Sayfayi yenileyin
7. Amazon sayfasina donun
8. Sayfayi tamsayfa yapin
9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa
doğru başlığı(Actual Title) yazdırın.
10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
URL'yi yazdırın
11.Sayfayi kapatin
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın
        //(verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://www.youtube.com ");
        String PageTitle = driver.getTitle();
        String actualTitle ="youtube";
        if(PageTitle.contains(actualTitle)){
            System.out.println("Actual Title testing PASSED");
        } else System.out.println("Actual Title:" + actualTitle);


        //Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru
        //URL'yi yazdırın.
        String PageUrl = driver.getCurrentUrl();
        String actualUrl ="youtube";
        if(PageUrl.contains(actualUrl)){
            System.out.println("Actual Url testing PASSED");
        } else System.out.println("Actual Title:" + actualUrl);


        // Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com");

        //5. Youtube sayfasina geri donun
        //Sayfayi yenileyin
        //7. Amazon sayfasina donun
       // 8. Sayfayi tamsayfa yapin
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.manage().window().maximize();


        //Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa
        //doğru başlığı(Actual Title) yazdırın.
        String sayfaBasligi = driver.getTitle();
        String istenenbaslik ="Amazon";
        if(sayfaBasligi.contains(istenenbaslik)){
            System.out.println("Page Title testing PASSED");
        } else System.out.println("Page Title:" + istenenbaslik);


        //Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        //URL'yi yazdırın
        String sayfaUrl = driver.getCurrentUrl();
        String istenenUrl ="https://www.amazon.com/";
        if(sayfaUrl.contains(istenenUrl)){
            System.out.println("Page Url testing PASSED");
        } else System.out.println("Page Url:" + istenenUrl);


        //11.Sayfayi kapatin
        driver.close();

    }
}
