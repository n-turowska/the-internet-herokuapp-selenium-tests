package com.herokuapp.theinternet.test.interactions;

import com.herokuapp.theinternet.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SliderTest extends BaseTest {

    @Test
    public void testHorizontalSlider() {
        int x = 30;
        int y = 0;
        var horizontalSliderPage = homePage.goToHorizontalSlider();
        horizontalSliderPage.moveSlider(x, y);
        String actualValue = horizontalSliderPage.getSliderValue();
        String expectedValue = "4";
        Assert.assertEquals(actualValue, expectedValue,
                "\n Actual and expected slider value do not match \n");
    }

}
