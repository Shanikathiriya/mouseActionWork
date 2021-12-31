package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class OrderConfirm extends Utils
{
    By confirmOrderButton= By.xpath("//*[@id=\"confirm-order-buttons-container\"]/button");
    By textmsg=By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]/strong");


    public void clickOnConfirm()
    {
              waitForVisible(confirmOrderButton,5);
              clickOnElement(confirmOrderButton);
    }
    public void VerifySuccessfullyOrdered()
    {
        String txt;
        waitForVisible(textmsg,5);
        txt= getTextFromElement(textmsg);
        Assert.assertTrue(txt.equals(loadProp.getProperty("orderSuccessMsg")));
    }
}
