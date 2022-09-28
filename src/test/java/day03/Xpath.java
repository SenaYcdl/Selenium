package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Xpath {
    public static void main(String[] args) throws InterruptedException {

        /*
         1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
         2- Add Element butonuna basin
         3- Delete butonu’nun gorunur oldugunu test edin
         4- Delete tusuna basin
         5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
         */


        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");


        // 2- Add Element butonuna basin
        Thread.sleep(3000);
        //driver.findElement(By.xpath("//*[@onclick='addElement()']")).click();
        driver.findElement(By.xpath("//*[text()='Add Element']")).click(); // xpath'de text ile locate alma


        /*
        Locate alırken sadece text kullanıcaksak //*[text()='Add Element'] bu formatt kullanılır
        Atribute kullanıcaksak //*[@onclick='addElement()'] bu format kullanılır
         */


        // Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButton = driver.findElement(By.xpath("//*[@class='added-manually']"));
        if(deleteButton.isDisplayed()){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED");


        // Delete tusuna basin
        Thread.sleep(3000);
        deleteButton.click();


        // “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        //WebElement addRemoveElement = driver.findElement(By.xpath("//h3"));
        WebElement addRemoveElement = driver.findElement(By.xpath("//*[text()='Add/Remove Elements']"));
        if(addRemoveElement.isDisplayed()){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED");


        //



        //Sayfayı kapatınız
        driver.close();

    }
}
