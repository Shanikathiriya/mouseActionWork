package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ReferProductResult extends Utils // create class and extends utils
{

    By clickOnContinueButton=By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]/a");
    public void verifyUserHAsSuccessFullySendEmail() // create a method for verify user successfully send email
    {

        String actualSendEmailSuccessMessage= getTextFromElement(By.xpath("//div[@class='result']"));
        System.out.println(actualSendEmailSuccessMessage);

        String expectedEmailMessage="Your message has been sent.";
        Assert.assertTrue(actualSendEmailSuccessMessage.equals(expectedEmailMessage),"Message not sent");

    }
    public void clickOnContinuePage()
    {
        clickOnElement(clickOnContinueButton);
    }



}
