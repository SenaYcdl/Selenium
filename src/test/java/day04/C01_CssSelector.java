package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_CssSelector {
    public static void main(String[] args) throws InterruptedException {

        /*
        1 ) Bir class oluşturun : Locators_css
        2 ) Main method oluşturun ve aşağıdaki görevi tamamlayın.
          a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
          b. Locate email textbox
          c. Locate password textbox ve
          d. Locate signin button
          e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
             i. Username : testtechproed@gmail.com
             ii. Password : Test1234!
     */


        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");


        // b .Locate email textbox
        // c. Locate password textbox ve
        // d. Locate signin button

        driver.findElement(By.cssSelector("input[name='session[email]']")).sendKeys("testtechproed@gmail.com");
        driver.findElement(By.cssSelector("input[name='session[password]']")).sendKeys("Test1234!");
        driver.findElement(By.cssSelector("input[name='commit']")).click();
        Thread.sleep(3000);

        driver.quit();

    }
}
