package Odevler;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E01 {
    public static void main(String[] args) {


        /*

- webElement.click(); Web Element'e click yapar
- webElement.sendKeys("Metin" ); Parametre olarak yazilan metni Web Elemente gönderi
- webElement.submit(); Web element ile islem yaparken Enter tusuna basma gorevi yapar
- webElement.sendKeys("Metin" + Keys.ENTER ); Istedigimiz metni yollayip, sonra ENTER'a basar.
- webElement.getText(); Web Element uzerindeki yaziyi getirir
- webElement.getAttribute("Att.ismi" ); Ismi girilen attribute'un degerini getirir
- webElement.getTagName(); Web elementin tag ismini getirir
- webElement.isEnable(); Web Element erisilebilir ise true yoksa false döner
- webElement.isDisplayed(); Web Element gorunur ise true yoksa false döner
- webElement.isSelected(); Web Element secili ise true yoksa false doner
         */


        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://lms.techproeducation.com/login/");
        driver.manage().window().maximize();

        WebElement login=driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[2]/section[2]/div/div/div/div/div[2]/div/a"));
        login.click();

        driver.findElement(By.name("identifier")).sendKeys("sena.ycdl61@gmail.com", Keys.ENTER);







    }
}
