package pr_cl1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class Mh1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Jar\\Chrome\\chromedriver.exe");
		ChromeDriver nw=new ChromeDriver();
		nw.get("http://business.travelclub.ae");
		nw.manage().window().maximize();
		
		WebElement un= nw.findElement(By.id("Email"));
		un.sendKeys("admin123@gmail.com");
		
		WebElement pas= nw.findElement(By.id("Password"));
		pas.sendKeys("admin123");
		
		Actions at=new Actions(nw);
		WebElement ln= nw.findElement(By.id("btnLogin"));
		at.keyDown(Keys.CONTROL).click(ln).keyUp(Keys.COMMAND).perform();

		System.out.println("Before Switching" + nw.getCurrentUrl());
		String c_win= nw.getWindowHandle();
		
		
	
	}
	

}
