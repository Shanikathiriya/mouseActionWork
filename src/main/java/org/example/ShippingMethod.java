package org.example;

import org.openqa.selenium.By;

public class ShippingMethod extends Utils
{
    By paymentContinue= By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button");
    public void chooseShippingMethod()
    {
          waitForVisible(paymentContinue,10);
        clickOnElement(paymentContinue);
    }
}
