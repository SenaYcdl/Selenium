package Odevler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev7_AddRemove {
    public static void main(String[] args) {

        /*
        Class Work: Add Remove Element
1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
2- Add Element butonuna basin
3- Delete butonu’nun gorunur oldugunu test edin
4- Delete tusuna basin
5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


       // https://the-internet.herokuapp.com/add_remove_elements/
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");


       // 2- Add Element butonuna basin
        driver.findElement(By.xpath("//*[@onclick='addElement()']")).click();


        //Delete butonu’nun gorunur oldugunu test edin
        System.out.println(driver.findElement(By.xpath("//*[@onclick='deleteElement()']")).isDisplayed());

        //Delete tusuna basin
        driver.findElement(By.xpath("//*[@onclick='deleteElement()']")).click();


        // “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        System.out.println(driver.findElement(By.xpath("//*[text()='Add/Remove Elements']")).isDisplayed());


        driver.quit();

    }
}
