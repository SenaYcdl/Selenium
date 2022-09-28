package Odevler;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Odev5_LoginTest {
    public static void main(String[] args) throws InterruptedException {

        /*
        1. Bir class oluşturun: LoginTest
2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
a. http://a.testaddressbook.com adresine gidiniz.
b. Sign in butonuna basin
c. email textbox,password textbox, and signin button elementlerini locate ediniz..
d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
i. Username : testtechproed@gmail.com
ii. Password : Test1234!
e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
3. Sayfada kac tane link oldugunu bulun
         */


        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        //a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


       // b. Sign in butonuna basin
        driver.findElement(By.id("sign-in")).click();


        //email textbox,password textbox, and signin button elementlerini locate ediniz..
        //Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        driver.findElement(By.id("session_email")).sendKeys("testtechproed@gmail.com");
        driver.findElement(By.id("session_password")).sendKeys("Test1234!");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"clearance\"]/div/div/form/div[3]/input")).click();


        //e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement result=driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[2]/span"));
        String userId= result.getText();
        if(userId.contains(result.getText())){
            System.out.println("PASSED!");
        }else System.out.println("FAILED!");


        //“Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement addree=driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/a[2]"));
        System.out.println("Addresses is displayed: " + addree.isDisplayed());

        WebElement signout=driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/a[3]"));
        System.out.println("Sign out is displayed : " + signout.isDisplayed());


        //3. Sayfada kac tane link oldugunu bulun
        List<WebElement> tag=driver.findElements(By.tagName("a"));
        System.out.println("Tagsize: " + tag.size());


        //linkleri yazdiriniz
        for (WebElement each: tag){
            System.out.println("Linkler : " + each + each.getText());
        }

        //lambda cozumu
        tag.forEach(t-> System.out.println(t.getText()));

        driver.quit();


        /*
         //3. Sayfada kac tane link oldugunu bulun.
        List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));
        System.out.println("Linklerin sayısı = "+linklerListesi.size());
        System.out.println(linklerListesi);


        //4. Linkleri yazdırınız
        for (WebElement each:linklerListesi) {
            System.out.println("Linkler : "+each.getText());
        }

        //5. Linkleri LAMBDA ile yazdırınız
        linklerListesi.forEach(t-> System.out.println(t.getText()));


        //6. Sayfayı kapatınız
        driver.close();
         */
    }
}
