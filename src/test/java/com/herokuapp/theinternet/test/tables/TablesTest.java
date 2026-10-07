package com.herokuapp.theinternet.test.tables;

import com.herokuapp.theinternet.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TablesTest extends BaseTest {

    @Test
    public void testGettingDueValueByEmail() {
        String email = "jdoe@hotmail.com";
        var tablesPage = homePage.goToSortableDataTables();
        String actualDueValue = tablesPage.getDueValueByEmail(email);
        String expectedDueValue = "$100.00";
        Assert.assertEquals(actualDueValue, expectedDueValue,
                "\n Actual and expected due value do not match \n");
    }

}
