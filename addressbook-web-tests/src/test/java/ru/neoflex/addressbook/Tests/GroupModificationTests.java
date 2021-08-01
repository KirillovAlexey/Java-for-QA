package ru.neoflex.addressbook.Tests;

import org.testng.annotations.Test;
import ru.neoflex.addressbook.Model.GroupData;
import ru.neoflex.addressbook.Model.TestBase;

public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification() {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("NFO","NeoFlex2","test2"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();
    }

}
