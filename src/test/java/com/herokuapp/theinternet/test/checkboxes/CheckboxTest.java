package com.herokuapp.theinternet.test.checkboxes;

import com.herokuapp.theinternet.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxTest extends BaseTest {

    @Test
    public void testCheckbox() {
        var checkboxesPage = homePage.goToCheckboxes();
        checkboxesPage.clickFirstCheckbox();
        checkboxesPage.unclickSecondCheckbox();
        checkboxesPage.clickSecondCheckbox();

        boolean isFirstSelected = checkboxesPage.isFirstCheckboxSelected();
        Assert.assertTrue(isFirstSelected,
                "\n First Checkbox Is Not Selected \n");

        boolean isSecondSelected = checkboxesPage.isSecondCheckboxSelected();
        Assert.assertTrue(isSecondSelected,
                "\n Second Checkbox Is Selected \n");

    }

}
