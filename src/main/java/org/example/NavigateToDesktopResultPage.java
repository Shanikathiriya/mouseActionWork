package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NavigateToDesktopResultPage extends Utils //create class inherit utils
{
  public void verifyUserHAsSuccessFullyNavigateDesktopPage() //create method which ios verify user has successfully navigate desktop page
  {
      String actual_s1=getTextFromElement(By.xpath("//div[@class='page-title']/h1"));
      System.out.println(actual_s1);
      String expected_s2="Desktops";
      Assert.assertTrue(actual_s1.equals(expected_s2),"Not on Desktop page");

  }
}
