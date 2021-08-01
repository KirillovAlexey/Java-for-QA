package ru.neoflex.addressbook.Tests;

import org.testng.annotations.Test;
import ru.neoflex.addressbook.Model.ContactData;
import ru.neoflex.addressbook.Model.TestBase;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {
        app.getNavigationHelper().goToHomePage();
        app.getContactHelper().editContact();
        app.getContactHelper().fillContactForm(new ContactData("Alexey", "Igorevich", "Moroz", "Sonne", "test2",
                "Neoflex", "Penza", "8412445522", "9875175158", "9875175158", "-",
                "amoroz@neoflex.ru", "-", "-", "-", "23", "October", "1991",
                "23", "November", "2020","", "Penza", "9653452243", "test2"));
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToHomePage();
    }
}
