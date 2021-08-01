package ru.neoflex.addressbook.Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.neoflex.addressbook.Model.TestBase;

public class ContactDeletionTests extends TestBase {

    @Test
    public void ContactDeletionTests(){
        app.getNavigationHelper().goToHomePage();
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteContact();
    }

}
