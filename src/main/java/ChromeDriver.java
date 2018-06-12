import org.openqa.selenium.*;

public class ChromeDriver {

     public static void main (String[] args) {

        // Да се отвори страницата на https://weather.com. От Search полето да избере град по избор и да се намери прогнозата за утрешния ден (днес + 1).
         // Да създаде обект с параметри (day, description, high/low, precip, wind, humidity),  да се вземат и парснат стойностите от съответната таблица* и да се върне обект в конзолата -  веднъж по целзий и веднъж по фаренхайт.
         // За задачата да се използва Селениум библютека.


          WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
          

          driver.get("https://weather.com/");

          //wait and scroll to submit
         JavascriptExecutor js = (JavascriptExecutor)driver;
         js.executeScript("scrollBy", 0, 2500);

         driver.findElement(By.name("Submit Preferences")).click();




          WebElement searchBox = driver.findElement(By.className("input-gvUyyzTM__inputElement__l7M9C"));
          searchBox.sendKeys("Sofia");
          searchBox.findElement(By.className("styles-hOmZ2zQy__button__1eQR_"));
          searchBox.click();



          driver.close();
          driver.quit();
     }

}
