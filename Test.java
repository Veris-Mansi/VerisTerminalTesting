package packageselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String args[]) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Projects\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://sandbox-terminal.veris.in/");
//		
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/input")).sendKeys("TYPE7");
//		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[3]/input")).sendKeys("1");
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector(".rn-1i6wzkk")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector(".rn-qklmqi ")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(("/html/body/div[1]/div[1]/div/div[2]/div/div[1]/div[2]/input"))).sendKeys("9993483676");
//		driver.findElement(By.cssSelector(".rn-9aemit")).click();

	try
		{
		WebElement element ;
		
		element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/input"));
		element.sendKeys("TYPE7");
		element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[3]/input"));
		element.sendKeys("1");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[5]/div/div")).click();
		driver.findElement((By.cssSelector(".rn-1i6wzkk"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[1]")).click();;
		//driver.findElement((By.className(".rn-1oszu61 rn-101sy47 rn-l5bh9y rn-rull8r rn-ndvcnb rn-mm0ijv rn-gxnn5r rn-14skgim rn-fnigne rn-1iymjk7 rn-s2skl2 rn-1efd50x rn-13yce4e rn-deolkf rn-1loqt21 rn-6koalj rn-1mlwlqe rn-eqz5dr rn-1qe8dj5 rn-p1pxzi rn-11wrixw rn-61z16t rn-1mnahxq rn-ifefl9 rn-bcqeeo rn-1mdbw0j rn-gy4na3 rn-9aemit rn-wk8lta rn-bnwqim rn-1otgn73 rn-1i6wzkk rn-lrvibr rn-1lgpqti"))).click();
		//driver.close();
		//driver.findElement(By.cssSelector(".rn-qklmqi")).click();
		driver.findElement(By.xpath(("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/input"))).sendKeys("9993483676");
	    Thread.sleep(1000);
	    element = driver.findElement(By.cssSelector("#root > div > div.rn-1awozwy.rn-1efd50x.rn-14skgim.rn-rull8r.rn-mm0ijv.rn-13yce4e.rn-fnigne.rn-ndvcnb.rn-gxnn5r.rn-deolkf.rn-6koalj.rn-16y2uox.rn-1wbh5a2.rn-1ro0kt6.rn-eqz5dr.rn-ifefl9.rn-bcqeeo.rn-wk8lta.rn-9aemit.rn-1mdbw0j.rn-gy4na3.rn-bnwqim.rn-1lgpqti > div > div.rn-1oszu61.rn-14lw9ot.rn-1efd50x.rn-14skgim.rn-rull8r.rn-mm0ijv.rn-13yce4e.rn-fnigne.rn-ndvcnb.rn-gxnn5r.rn-deolkf.rn-6koalj.rn-1qe8dj5.rn-1mlwlqe.rn-18u37iz.rn-61z16t.rn-p1pxzi.rn-11wrixw.rn-1x0uki6.rn-ifefl9.rn-bcqeeo.rn-wk8lta.rn-9aemit.rn-1mdbw0j.rn-gy4na3.rn-bnwqim.rn-1lgpqti > div:nth-child(2)"));
	    element.click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]")).click();
	    
	    Thread.sleep(2000);
	    //driver.switchTo().
		}
////		//*System.out.println("hiiii");
//	//	element = driver.findElement(By.cssSelector(".rn-9aemit"));
////				//System.out.println("Location is ",element.getLocation());
////		String text = element.getText();
////		System.out.println("Text of button is "+text);
////		element.click();
////		//driver.findElement(By.className("rn-1awozwy")).click();
////		System.out.println("helllloooo");
////		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/div[3]/div[2]/div")).click();
////		Thread.sleep(2000);
////		}*
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("error "+e);
		}
//		
	}
}
