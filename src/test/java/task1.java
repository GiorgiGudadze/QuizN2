import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class task1
{
    @Test
    public void Testfunc()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        driver.manage().window().maximize();

        for(int i=1;i<=3;i++)
        {

            driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();

        }
        String last_1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/button[3]")).getText();
        System.out.println(last_1);

        List<WebElement> elements = driver.findElements(By.cssSelector("button[class^='added']"));
        int zoma = elements.size();
        System.out.println(elements.get(zoma-1).getText());

        LoremIpsum();
    }

    public  void  LoremIpsum()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/challenging_dom");
        WebElement selectCnt = driver.findElement(By.xpath("//*[@id='content']/div/div/div/div[2]/table//*[contains(text(), 'Apeirian9')]"));
        System.out.println(selectCnt.getText());

        WebElement followingSibling = selectCnt.findElement(By.xpath("following-sibling::*"));
        System.out.println(followingSibling.getText());
    }
}
