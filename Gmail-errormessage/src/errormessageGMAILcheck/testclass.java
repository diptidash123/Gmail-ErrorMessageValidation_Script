package errormessageGMAILcheck;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class testclass {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/software for selenium version/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.gmail.com");
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
        WebElement error=driver.findElement(By.xpath("//div[@class='o6cuMc']"));
        String expected=error.getText();
        String actual="Enter an email or phone number";
        Assert.assertEquals(actual, expected);
        System.out.println("done");
        System.out.println("compilation done succesfully ");
	}

}
