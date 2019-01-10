package pr_cl1;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mwh {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Jar\\Chrome\\chromedriver.exe");
	ChromeDriver nw=new ChromeDriver();
	nw.get("https://www.makemytrip.com");
			nw.manage().window().maximize();
	Actions ac=new Actions(nw);
	WebElement cl=nw.findElement(By.id("hp-widget__sfrom"));
	cl.click();
	for (int i=1; i<5; i++)
	{	ac.sendKeys(Keys.ARROW_DOWN).perform();	}
	WebElement cl2=nw.findElement(By.id("hp-widget__sTo"));
	cl2.click();
	for (int i=1; i<8; i++)
	{	ac.sendKeys(Keys.ARROW_DOWN).perform();}
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
	nw.findElement(By.linkText("urlLink")).sendKeys(selectLinkOpeninNewTab);
	nw.get("http://business.travelclub.ae");
	Set<String> al_win= nw.getWindowHandles();
	
	System.out.println("total win" + al_win.size());
	
}
}
