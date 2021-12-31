package org.example;

import org.openqa.selenium.By;

public class PaymentMethod extends Utils
{
    By creditCardRadio= By.xpath("//*[@id=\"payment-method-block\"]/li[2]/div/div[2]/label");
    By paymentContinue=By.xpath("//*[@id=\"payment-method-buttons-container\"]/button");
    By cardType=By.xpath("//*[@id=\"CreditCardType\"]");
    By cardHolder=By.xpath("//*[@id=\"CardholderName\"]");
    By cardNumber=By.xpath("//*[@id=\"CardNumber\"]");
    By exdate=By.xpath("//*[@id=\"ExpireMonth\"]");
    By exYear=By.xpath("//*[@id=\"ExpireYear\"]");
    By cardcode=By.xpath("//*[@id=\"CardCode\"]");
    By paymentinfoContinue=By.xpath("//*[@id=\"payment-info-buttons-container\"]/button");


    public void choosePaymentMethod()
    {
        waitForVisible(creditCardRadio,5);
        clickOnElement(creditCardRadio);
        clickOnElement(paymentContinue);
    }
    public void paymentInfo()
    {
        waitForVisible(cardType,5);
        selectByValue(cardType, loadProp.getProperty("cardType"));
        typeText(cardHolder, loadProp.getProperty("cardHolder"));
        typeText(cardNumber, loadProp.getProperty("cardNumber"));
        selectByValue(exdate, loadProp.getProperty("expirydate"));
        selectByValue(exYear, loadProp.getProperty("expiryYear"));
        typeText(cardcode, loadProp.getProperty("cardcode"));
        clickOnElement(paymentinfoContinue);


    }

}

