package ru.neoflex.addressbook.Tests;

import org.testng.annotations.Test;
import ru.neoflex.addressbook.Model.TestBase;

public class GroupDeletionTests extends TestBase {

    @Test
    public void GroupDeletionTests() throws Exception {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage();
    }

}
