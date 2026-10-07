package com.herokuapp.theinternet.pages.dropdown;

import com.herokuapp.theinternet.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static utilities.DropdownUtility.getSelectedOption;
import static utilities.DropdownUtility.selectByVisibleText;

public class DropdownPage extends HomePage {

    private By dropdownList = By.id("dropdown");

    public void clickDropdown() {
        click(dropdownList);
    }

    public void selectOption(String text) {
        selectByVisibleText(dropdownList, text);
    }

    public String getSelectedText() {
        return getSelectedOption(dropdownList);
    }

}
