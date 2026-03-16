
package com.mycompany.mavenproject2;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Login
{
    void loginT()
    {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/login");
    WebElement username = driver.findElement(By.id("username"));
    username.sendKeys("tomsmith");
    WebElement password = driver.findElement(By.id("password"));
password.sendKeys("SuperSecretPassword!");
driver.findElement(By.xpath("\"//i[@class=\"fa fa-2x fa-sign-in\"")).click();
String test = driver.findElement(By.id("flash")).getText();
System.out.println("The Message is :"+test);
driver.quit();
    }
public static void main(String[] args)
{
    Login obj = new Login();
    obj.loginT();
}
    
}
