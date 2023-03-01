package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SecondTest {
	
	@Test
	public void secondTest() {
		SoftAssert soft=new softAssert();
		home.clickGears();
		home.clickSkillraryDemoApp();
		web.switchTochildBrowser();
		soft.assertEquals(demoApp.getpageHeader(), "skillrary-ECommerce");
		demoApp.selectCategory(web,1);
		soft.assertEquals(testing.getpageHeader(), "Testing");
		web.dragAndDropElement(testing.getJavaImage(),testing.getMyCartArea());
		web.scrollToElement(testing.getFacebookIcon());
		testing.clickFacebookIcon();
		soft.assertAll();
	}
}
