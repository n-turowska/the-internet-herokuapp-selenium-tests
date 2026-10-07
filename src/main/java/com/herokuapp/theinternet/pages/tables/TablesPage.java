package com.herokuapp.theinternet.pages.tables;

import com.herokuapp.theinternet.pages.HomePage;
import org.openqa.selenium.By;

public class TablesPage extends HomePage {

    public String getDueValueByEmail(String email) {
        return find(By.xpath("//td[text()='"+ email +"']//following::td[1]")).getText();
    }

}
