package ru.neoflex.addressbook.Tests;


import org.testng.annotations.Test;
import ru.neoflex.addressbook.Model.GroupData;
import ru.neoflex.addressbook.Model.TestBase;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().createGroup(new GroupData("NFO", "NeoFlex", "Водка и амфетамин"));

        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("ARGO", "NeoFlex", "Лень и чревоугодие"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage();

        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("RSA", "NeoFlex", "Слабоумие и отвага"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage();
    }

}
