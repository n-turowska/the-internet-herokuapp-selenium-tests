package com.herokuapp.theinternet.test.dropdown;

import com.herokuapp.theinternet.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTest extends BaseTest {

    @Test
    public void testDropdown() {
        String option = "Option 1";
        var dropdownPage = homePage.goToDropdown();
        dropdownPage.clickDropdown();
        dropdownPage.selectOption(option);
        String actualOption = dropdownPage.getSelectedText();
        Assert.assertEquals(actualOption, option,
                "\n Option 1 Is Not Selected \n");

    }

}
