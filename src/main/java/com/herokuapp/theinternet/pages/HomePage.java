package com.herokuapp.theinternet.pages;

import com.herokuapp.theinternet.pages.alerts.JSAlertsPage;
import com.herokuapp.theinternet.pages.checkboxes.CheckboxesPage;
import com.herokuapp.theinternet.pages.dropdown.DropdownPage;
import com.herokuapp.theinternet.pages.dynamic_controls.DynamicControlsPage;
import com.herokuapp.theinternet.pages.entry_ad.EntryAdPage;
import com.herokuapp.theinternet.pages.frames.FramesPage;
import com.herokuapp.theinternet.pages.keyboard.KeyPressesPage;
import com.herokuapp.theinternet.pages.login.LoginPage;
import com.herokuapp.theinternet.pages.slider.HorizontalSliderPage;
import com.herokuapp.theinternet.pages.tables.TablesPage;
import com.herokuapp.theinternet.pages.windows.WindowsPage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {

    private By framesLink = By.xpath("//a[text()='Frames']");
    private By checkboxesLink = By.xpath("//a[text()='Checkboxes']");
    private By dropdownLink = By.xpath("//a[text()='Dropdown']");
    private By horizontalsliderLink = By.xpath("//a[text()='Horizontal Slider']");
    private By loginLink = By.xpath("//a[text()='Form Authentication']");
    private By keypressesLink = By.xpath("//a[text()='Key Presses']");
    private By dynamiccontrolsLink = By.xpath("//a[text()='Dynamic Controls']");
    private By jsalertsLink = By.xpath("//a[text()='JavaScript Alerts']");
    private By entryadLink = By.xpath("//a[text()='Entry Ad']");
    private By windowsLink = By.xpath("//a[text()='Multiple Windows']");
    private By tablesLink = By.xpath("//a[text()='Sortable Data Tables']");


    public CheckboxesPage goToCheckboxes() {
        click(checkboxesLink);
        return new CheckboxesPage();
    }

    public FramesPage goToFrames() {
        scrollToElementJS(framesLink);
        click(framesLink);
        return new FramesPage();
    }

    public DropdownPage goToDropdown() {
        click(dropdownLink);
        return new DropdownPage();
    }

    public HorizontalSliderPage goToHorizontalSlider() {
        scrollToElementJS(horizontalsliderLink);
        click(horizontalsliderLink);
        return new HorizontalSliderPage();
    }

    public LoginPage goToLogin() {
        scrollToElementJS(loginLink);
        click(loginLink);
        return new LoginPage();
    }

    public KeyPressesPage goToKeyPresses() {
        scrollToElementJS(keypressesLink);
        click(keypressesLink);
        return new KeyPressesPage();
    }

    public DynamicControlsPage goToDynamicControls() {
        click(dynamiccontrolsLink);
        return new DynamicControlsPage();
    }

    public JSAlertsPage goToJSAlerts() {
        scrollToElementJS(jsalertsLink);
        click(jsalertsLink);
        return new JSAlertsPage();
    }

    public EntryAdPage goToEntryAd() {
        click(entryadLink);
        return new EntryAdPage();
    }

    public WindowsPage goToMultipleWindows() {
        scrollToElementJS(windowsLink);
        click(windowsLink);
        return new WindowsPage();
    }

    public TablesPage goToSortableDataTables() {
        scrollToElementJS(tablesLink);
        click(tablesLink);
        return new TablesPage();
    }

}
