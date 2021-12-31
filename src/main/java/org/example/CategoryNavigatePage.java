package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class CategoryNavigatePage extends Utils
{
       By pageTitle= By.xpath("//h1");



    public void navigateCategoryByHover(String name) {


         WebElement element= driver.findElement(By.linkText(name));

         String bgColor = element.getCssValue("color");
        System.out.println("before---"+bgColor);

         Actions actions=new Actions(driver);

        actions.moveToElement(element).build().perform();
        WebElement afterhover=driver.findElement(By.linkText(name));

        String after=element.getCssValue("color");

        System.out.println("After hover: " + after);

        Assert.assertTrue(after.equals(loadProp.getProperty("afterColor")));

    }
    public void navigateSubCategory(String subcategory)
    {



        Actions action = new Actions(driver);

        WebElement elementToClick = driver.findElement(By.linkText(subcategory));

        action.click(elementToClick).build().perform();


        //--------------------------------------


    }


    public void verifyPageUrl(String PageURl)
    {
        Assert.assertTrue(driver.getCurrentUrl().equals(PageURl));
    }
    public void verifyPageTitle(String PageTitle)
    {
        Assert.assertEquals(driver.findElement(pageTitle).getText(),PageTitle);
    }
    public void afterMouseHoverColour()
    {


    }
}

