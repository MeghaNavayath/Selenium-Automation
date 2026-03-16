package com.mycompany.mavenproject2;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.OutputType;

public class Screenshot {
    void shot()
    {
        try {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(src.toPath(),new File("st.png").toPath());
        System.out.println("Screenshot saved as file");
        driver.quit();
          }
        catch(IOException ex){
                Logger.getLogger(Screenshot.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
     public static void main(String[] args) throws Exception {
            Screenshot st=new Screenshot();
            st.shot();
    }
}
