package org.example;

import org.openqa.selenium.By;

public class Desktops extends Utils //create class and inherit utils

{
    By buildComputerButton=By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[1]/a/img");


    public void clickOnBuildYourOwnButton()
    {
        clickOnElement(buildComputerButton);//click on build computer
    }

}
