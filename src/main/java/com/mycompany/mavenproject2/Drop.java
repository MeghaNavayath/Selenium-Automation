package com.mycompany.mavenproject2;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class Drop
{
    void drop()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
       WebElement dd = driver.findElement(By.id("dropdown"));
       dd.click();
       Select select = new Select (dd);
       select.selectByVisibleText("Option 1");
       String newd = select.getFirstSelectedOption().getText();
       System.out.println("Selected option were : +newd");
       driver.quit();
       
        
        
    }
    

public static void main (String[] args)
{
Drop tc = new Drop();
tc.drop();

}
}
