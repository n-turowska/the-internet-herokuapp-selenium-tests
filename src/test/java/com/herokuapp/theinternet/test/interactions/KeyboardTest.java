package com.herokuapp.theinternet.test.interactions;

import com.herokuapp.theinternet.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeyboardTest extends BaseTest {

    @Test
    public void testEnteringWordUsingKeyboard(){
        String word = "flower";
        var keypressesPage = homePage.goToKeyPresses();
        keypressesPage.enterWord(word);
        String actualWord = keypressesPage.getTargetText();
        Assert.assertEquals(actualWord, word,
                "\n The word " + word + " is not entered \n");
    }

    @Test
    public void testTabPress(){
        var keypressesPage = homePage.goToKeyPresses();
        keypressesPage.pressTab();
        String actualKeyPressed = keypressesPage.getResultText();
        Assert.assertTrue(actualKeyPressed.contains("TAB"),
                "\n TAB was not pressed \n");
    }

}
