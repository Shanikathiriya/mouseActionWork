package org.example;

import org.openqa.selenium.By;

public class BillingAddress extends Utils
{
    By country= By.xpath("//*[@id=\"BillingNewAddress_CountryId\"]");
    By city=By.xpath("//*[@id=\"BillingNewAddress_City\"]");
    By add1=By.xpath("//*[@id=\"BillingNewAddress_Address1\"]");
    By zipCode=By.xpath("//*[@id=\"BillingNewAddress_ZipPostalCode\"]");
    By phoneNumber=By.xpath("//*[@id=\"BillingNewAddress_PhoneNumber\"]");
    By continueBill=By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]");

    public void billingAddressDetails()
    {
        selectByValue(country, loadProp.getProperty("country"));
        typeText(city, loadProp.getProperty("city"));
        typeText(add1, loadProp.getProperty("add1"));
        typeText(zipCode, loadProp.getProperty("ZipCode"));
        typeText(phoneNumber, loadProp.getProperty("phonenumber"));
        clickOnElement(continueBill);


    }
}
