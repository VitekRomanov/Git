package ProjTest.ProjTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\drivers\\chromedriver.exe"); //путь к твоему chromedriver.exe
        WebDriver driver = new ChromeDriver();//открывает окно браузера
        driver.get("https://mail.yandex.by");//перехоидт по линку
        WebElement login = driver.findElement(By.name("login"));//находим элемент по имени (есть много разны статик методов в классе By) 
        login.sendKeys("testuser2710"); //посылаем в поле текст
        
        WebElement passwd = driver.findElement(By.name("passwd"));
        passwd.sendKeys("2710user"); 
        
        passwd.submit();//сабмитим 
        
    }
}
