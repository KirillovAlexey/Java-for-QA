package ru.neoflex.addressbook.Tests;

import org.testng.annotations.Test;
import ru.neoflex.addressbook.Model.ContactData;
import ru.neoflex.addressbook.Model.TestBase;

public class CreateContactTests extends TestBase {

    @Test(priority = 2)
    public void CreationContactTests() throws Exception {
        app.getNavigationHelper().goToContactPage();
        app.getContactHelper().fillContactForm(
                new ContactData("Alexey", "-", "Moroz", "Sonne", "test", "Neoflex",
                        "Penza", "8412445522", "9875175158", "9875175158", "-",
                        "amoroz@neoflex.ru", "-", "-", "-", "23", "October", "1991",
                        "23", "November", "2020", "NFO", "Penza", "9653452243", "test"));
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToHomePage();
    }

}
