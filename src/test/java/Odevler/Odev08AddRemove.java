package Odevler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Odev08AddRemove {
    public static void main(String[] args) throws InterruptedException {

          /*
    1-https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
    2- Add Element butonuna 10 kez basinız
    3- 10 kez Add element butonuna basıldığını test ediniz
    4 - Delete butonuna görünmeyene kadar basınız
    5- Delete butonunun görünmediğini test ediniz
    6- Sayfayı kapatınız
     */



        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //3- 10 kez Add element butonuna basıldığını test ediniz
        WebElement button=driver.findElement(By.xpath("//*[text()='Add Element']"));
        for (int i = 0; i <10; i++) {
            button.click();
        }




        //10 kez Add element butonuna basıldığını test ediniz
        List<WebElement> elements = driver.findElements(By.xpath("//*[text()='Delete']"));
        System.out.println("Add element butonuna " + elements.size() + " kere basilmistir");



        Thread.sleep(2000);

       // 4 - Delete butonuna görünmeyene kadar basınız
        int a=1;
        for (int j = a; j <=10; j++) {
            driver.findElement(By.xpath("//*[@class='added-manually']")).click();
        }



       // 5- Delete butonunun görünmediğini test ediniz
        WebElement result=driver.findElement(By.id("elements"));
        String delete=result.getText();
        if (!delete.contains("delete")) {
            System.out.println("PASSED");
        } else System.out.println("FAILED");


        // 6- Sayfayı kapatınız
        driver.quit();




    }
}
