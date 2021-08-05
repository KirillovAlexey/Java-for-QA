package ru.neoflex.addressbook.Tests;

import org.testng.annotations.Test;
import ru.neoflex.addressbook.Model.ContactData;
import ru.neoflex.addressbook.Model.GroupData;
import ru.neoflex.addressbook.Model.TestBase;

public class ContactCreationTests extends TestBase {

    @Test
    public void ContactCreationTests() throws Exception {
        app.getNavigationHelper().goToContactCreatePage();
        if(!app.getGroupHelper().isThereAgroup()){
            app.getNavigationHelper().goToGroupPage();
            app.getGroupHelper().createGroup(new GroupData("NFO",null,null));
        }
        app.getContactHelper().createContact(new ContactData("Alexey", "-", "Moroz", "Sonne", "test", "Neoflex",
                "Penza", "8412445522", "9875175158", "9875175158", "-",
                "amoroz@neoflex.ru", "-", "-", "-", "23", "October", "1991",
                "23", "November", "2020", "NFO", "Penza", "9653452243", "test"));
    }

}
