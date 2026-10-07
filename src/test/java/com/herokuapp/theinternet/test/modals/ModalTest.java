package com.herokuapp.theinternet.test.modals;

import com.herokuapp.theinternet.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ModalTest extends BaseTest {

    @Test
    public void testEntryAdModal() {
        var entryadPage = homePage.goToEntryAd();
        String expectedModalTitle = "THIS IS A MODAL WINDOW";
        String actualModalTitle = entryadPage.getModalTitle();
        Assert.assertEquals(actualModalTitle, expectedModalTitle,
                "\n Actual and expected modal titles do not match \n");
        entryadPage.closeModal();
    }

}
