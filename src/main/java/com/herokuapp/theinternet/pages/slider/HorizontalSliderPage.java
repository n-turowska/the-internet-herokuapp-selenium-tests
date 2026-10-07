package com.herokuapp.theinternet.pages.slider;

import com.herokuapp.theinternet.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.ActionsUtilities.dragAndDropBy;

public class HorizontalSliderPage extends HomePage {

    private By slider = By.xpath("//div[@class='sliderContainer']//input[@type='range']");
    private By sliderValue = By.id("range");

    public void moveSlider(int x, int y) {
        dragAndDropBy(find(slider), x, y);
    }

    public String getSliderValue() {
        return find(sliderValue).getText();
    }

}
