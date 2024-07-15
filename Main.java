import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Main implements Run
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","/Users/spare/Downloads/selenium/chromedriver-mac-arm64/chromedriver");
        driver.manage().window().maximize();
       // driver.get("https://shopnek.com/");
        driver.navigate().to("https://shopnek.com/");
       //Dimension d=new Dimension(900,900);
      // driver.manage().window().setSize(d);
            String url=driver.getCurrentUrl();
            System.out.println(url);
            String title=driver.getTitle();
            System.out.println(title);
      // String source=driver.getPageSource();
       //System.out.println(source);
            String text=driver.findElement(By.xpath("//p[@class=\"text-sm\" and text()=\"Gifting\"]")).getText();
            System.out.println(text);
            driver.findElement(By.xpath("//button[@type=\"button\" and text()=\"Login\"]")).click();
          WebElement ele= driver.findElement(By.xpath("//button[@type=\"button\" and text()=\"Login\"]"));
         boolean b=ele.isEnabled();
         if (b)
         {
             System.out.println("Yes enabled");
         }
         else
         {
             System.out.println("not enabled");
         }
     /*  List<WebElement> img=driver.findElements(By.xpath("//img"));
        System.out.println(img.size());
        List<WebElement> links = driver.findElements(By.xpath("//a"));
        int count = links.size();
        for (int i=0;i<count; i++)
        {
            WebElement we = links.get(i);
            System.out.println(we.getText());
        }*/

        // ele.sendKeys(Keys.ENTER);
         //driver.navigate().back();\d
       // driver.manage().deleteAllCookies();
        driver.navigate().refresh();

        driver.close();


            //driver.quit();;

    }
}