package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NewReleaseCommentResult extends Utils
{
    public void verifyUserHAsSuccessFullyCommentAdded() //create method to check user ahs successfully comment added or not
    {

        String actualS2= getTextFromElement(By.xpath("//div[@class='notifications']/div"));
        // System.out.println(actualS2);
        String expectedS2="News comment is successfully added.";
        Assert.assertTrue(actualS2.equals(expectedS2),"News comment not added");



    }
    public void addd()
    {
        System.out.println("krishani");
    }
}
