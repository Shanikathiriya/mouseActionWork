package org.example;

import org.openqa.selenium.By;

public class Cart extends Utils{
    By termsButton= By.xpath("//*[@id=\"termsofservice\"]");
    By checkButton=By.xpath("//*[@id=\"checkout\"]");


    public void checkOut()
    {
        waitForVisible(termsButton,5);
        clickOnElement(termsButton);
        clickOnElement(checkButton);

    }
}
