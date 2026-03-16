package com.mycompany.mavenproject2;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Fileupload {
    void upload()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();
        WebElement File = driver.findElement(By.xpath("//input[@id='file-upload']"));
        File.sendKeys("C:\\Users\\PRO\\Downloads");
        try 
        {
        Thread.sleep(3000);
        }
         catch (InterruptedException ex) {
            System.getLogger(Fileupload.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
          WebElement local =   driver.findElement(By.xpath("//input[@id='file-submit']"));
                  local.click();
          String check = driver.findElement(By.cssSelector("div[class='example'] h3")).getText();
          if (check.contains("File uploaded"))
          {
              System.out.println("File uploaded successfully");
          }
          else 
          {
              System.out.println("The file is not uploaded");
          }
          
          driver.quit();
          
        }
    public static void main(String[] args)
{
    Fileupload los = new Fileupload();
    los.upload();
}
        
    }
    

