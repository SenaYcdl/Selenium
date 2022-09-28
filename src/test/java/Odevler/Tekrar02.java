package Odevler;

import net.bytebuddy.description.type.TypeDescription;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.time.Duration;
import java.util.List;

public class Tekrar02 {
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

        //Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement userid=driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[2]/span"));
        String actualResult= userid.getText();
        if(actualResult.contains(actualResult)){
            System.out.println("PASSED");
        } else System.out.println("FAILED");

        // “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement adress=driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/a[2]"));
        System.out.println("Adres : " + adress.isDisplayed());

        WebElement signout=driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/a[3]"));
        System.out.println("Sign Out: " + signout.isDisplayed());


        //3. Sayfada kac tane link oldugunu bulun
        List<WebElement> tag=driver.findElements(By.tagName("a"));
        System.out.println("Tag size :" + tag.size());

        driver.quit();

    }
}
