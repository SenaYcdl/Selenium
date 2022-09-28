package Odevler;

public class XpathMethodlari {

     /*
        1) Absolute XPath
      Öğeyi bulmanın doğrudan yoludur, ancak Absolute XPath’ın dezavantajı,
      öğenin yolunda herhangi bir değişiklik yapılması durumunda XPath’ın başarısız olmasıdır.
      Bu aslında tavsiye edilmeyen bir yoldur. Web üzerinde F12 tuşu ile inspect mode açılır.
      Elements bölümüne tıklanır. Öğe bulunduktan sonra yine sağ click ile Copy – Copy XPath seçilir.
        Aşağıda Absolute XPath örneğini görebilirsiniz.
         Absolute xpath:
       html/body/div[1]/section/div[1]/div/div/div/div[1]/div/div/div/div/div[3]/div[1]/div/h4[1]/
         */

         /*
         Relative xpath:
         Relative Xpath için path (öğe yolu), HTML DOM yapısının ortasından başlar.
         Çift eğik çizgi (//) ile başlar, yani öğeyi web sayfasının herhangi bir yerinde arayabilir.
         HTML DOM yapısının ortasından başlayabilirsiniz ve uzun xpath yazmanıza gerek yoktur.
         Aşağıdaki ekranda gösterilen aynı öğenin göreli bir XPath ifadesi örneği verilmiştir.
          Bu, Relative XPath aracılığıyla öğeyi bulmak için kullanılan yaygın biçimdir.
          Relative XPath’in faydası daha çok kullanılabilir olması ve daha az bakım/maliyet gerektirmesidir.
          Relative xpath: //*[@class=’featured-box’]//*[text()=’Testing’]
          */

      /*
        Bazı temel XPath ifadeleri:
        Xpath=//input[@type=’text’]
        Xpath= //label[@id=’message23′]
        Xpath= //input[@value=’RESET’]
        Xpath=//*[@class=’barone’]
        Xpath=//a[@href=’http://demo.guru99.com/’]
        Xpath= //img[@src=’//cdn.guru99.com/images/home/java.png’]
       */

        /*
        //tagName[@attributeName='value']
        Yukardaki password için yer alan kod bloğunun aşağıdaki gibi tag-name ve
        attribute üzerinden dört şekilde xpathini yazabiliriz.
        //input[@id='login-password-input']
        //input[@type='password']
        //input[@name='login-password']
        //input[@data-testid='password-input']
         */

        /*
        //: Geçerli düğümü seçin.
        Tagname: Belirli düğümün etiket adı.
        @: Öznitelik seçin.
        Öznitelik: Düğümün öznitelik adı.
        Değer: Özelliğin değeri.
        Xpath = // tagname [@ attribute = 'değer']
         */

        /*
        Relative XPath: xml dokümanındaki elementi verir ve // ile başlar
         Örn://*[@class='featured-box']//*[text()='Testing']
         Selenium Kodu
         driver.findElement(By.xpath("//input[@id='Lid']"));
         input : tag adı
         @ :attribute u seç
         id : attribute
         Lid : attribute değeri
         Html Kodu
         <input id = "Lid" ..... >
         Selenium Kodu
         driver.findElement(By.xpath("//*[@id='Lid']"));
        Html Kodu
        <td align = "right">Login</td>
         Selenium Kodu
        driver.findElement(By.xpath("//td[text()='Login']"));
        */


       /*
        Xpath ve css selector arasındaki fark
        css yalnızca ileri yönde çalışırken, xpath ile öğeleri geriye veya ileriye doğru arayabiliriz…
        Xpath metinle çalışabilir, css çalışamaz
        Xpath daha fazla kombinasyona sahiptir ve indexe göre arama yapabilir,
        css indexe göre arama yapamaz, ancak css xpath'ten daha hızlı çalışıyor

         */

}
