package com.herokuapp.theinternet.pages.windows;

import com.herokuapp.theinternet.pages.HomePage;
import org.openqa.selenium.By;

import java.util.Set;

import static utilities.GetUtility.*;
import static utilities.SwitchToUtility.switchToWindow;

public class WindowsPage extends HomePage {

    private By newWindowsLink = By.xpath("//a[text()='Click Here']");

    public void clickNewWnidowsLink() {
        click(newWindowsLink);
    }

    public void switchToNewWindow() {
        //Step 1: Get the current main window handle
        String currentHandle = getWindowHandle();
        System.out.println("Main Window ID: " + currentHandle + "\n");

        //step 2 : get all window handles
        Set<String> allHandles = getWindowHandles();
        System.out.println("# of Open Windows: " + allHandles.size());

        //step 3: switch to the new window using the window handle
        for (String handle : allHandles) {
            if(currentHandle.equals(handle)) {
                System.out.println("1st Window ID: "+ handle);
            } else {
                switchToWindow(handle);
                System.out.println("2nd Window ID: "+ handle);
            }
        }
    }

}
