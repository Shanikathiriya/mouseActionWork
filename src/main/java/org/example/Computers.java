package org.example;

import org.openqa.selenium.By;

public class Computers extends Utils { //create class and inherit utils

    By computerMenu= By.xpath("//a[@href='/computers']");
    By desktopButton=By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/a/img");


    public void clickOnComputersMenu() //create method
    {

        clickOnElement(computerMenu); //click on computers category
    }
    public void clickOnDeskTop()
    {
        clickOnElement(desktopButton);

    }
}
