package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ILCarroXPath {
    WebDriver driver = new ChromeDriver();

    @Test
    public void typeRegForm(){
        driver.get("https://ilcarro.web.app/registration?url=%2Fterms-of-use");
        WebElement inputName = driver.findElement(By.xpath("//form/div/input['firstName']"));
        inputName.sendKeys("Olda");
        WebElement inputLastname = driver.findElement(By.xpath("//form/div/input[@autocomplete='family-name']"));
        inputLastname.sendKeys("Razmolodina");
        WebElement inputLogin = driver.findElement(By.xpath("//form/div/input[@autocomplete='email']"));
        inputLogin.sendKeys("myolga800@gmail.com");
        WebElement inputPassword= driver.findElement(By.xpath ("//form/div/input[@autocomplete='new-password']"));
        inputPassword.sendKeys("Password!1100");
        WebElement btnCheckbox =driver.findElement(By.xpath("//form/div/label[@for='terms-of-use']"));
        btnCheckbox.click();
        WebElement btnYalla = driver.findElement(By.xpath("//form/button[@type='submit']"));
        btnYalla.click();

    }
}
