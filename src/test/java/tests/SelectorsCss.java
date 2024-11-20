package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SelectorsCss {
    WebDriver driver = new ChromeDriver();

    @Test
public void elementsHeaderIlCarro(){
        driver.navigate().to("https://ilcarro.web.app/search");


        WebElement btnSearchHeader= driver.findElement(By.cssSelector("a[href='search']"));
        System.out.println("tag name --> " + btnSearchHeader.getTagName());
        System.out.println("text --> " + btnSearchHeader.getText());

        WebElement btnLetsCarHeader = driver.findElement(By.cssSelector("*[href='let-car-work']"));
        System.out.println("tag name --> " + btnSearchHeader.getTagName());
        System.out.println("text --> " + btnSearchHeader.getText());

        WebElement btnTermsHeader = driver.findElement(By.cssSelector("*[href='terms-of-use']"));
        System.out.println("tag name --> " + btnTermsHeader.getTagName());
        System.out.println("text --> " + btnTermsHeader.getText());

        WebElement btnSindupHeader = driver.findElement(By.cssSelector("a[href='registration']"));
        System.out.println("tag name --> " + btnSindupHeader.getTagName());
        System.out.println("text --> " + btnSindupHeader.getText());

        WebElement btnLoginHeader = driver.findElement(By.cssSelector("a[href='login']"));
        System.out.println("tag name --> " + btnLoginHeader.getTagName());
        System.out.println("text --> " + btnLoginHeader.getText());





         //driver.quit();




    }
}
