package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericlibraries.BaseClass;

public class FirstTest extends BaseClass
{
   @Test
   public void firstTest() {
	   SoftAssert soft=new SoftAssert();
	   home.clickGears();
	   home.clickSkillrarydemoApp();
	   soft.assertEquals(skillraryDemo.getPagrHeader(),"SkillRary-ECommerce");
	   skillraryDemo.mouseHoverToCourse(web);
	   skillraryDemo.clickSeleniumTraining();
	   soft.assertEquals(selenium.getPageHeader(), "Slenium Training");
	   selenium.doubleClickPlusButton(web);
	   web.handleAlert();
	   soft.assertTrue(selenium.getItemAddedMessage().isBlank());
	   soft.assertAll();
   }
}
