package ru.neoflex.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.neoflex.addressbook.Model.ContactData;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void selectContact() {
        click(By.xpath("//td[@class='center']/input"));
    }

    public void deleteContact() {
        click(By.xpath("//input[@value='Delete']"));
        wd.switchTo().alert().accept();
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getfName());
        type(By.name("middlename"), contactData.getmName());
        type(By.name("lastname"), contactData.getlName());
        type(By.name("nickname"), contactData.getNickName());
        type(By.name("title"), contactData.getTitle());
        type(By.name("company"), contactData.getCompany());
        type(By.name("address"), contactData.getAddress());
        type(By.name("home"), contactData.getHomePpone());
        type(By.name("mobile"), contactData.getMobilePhone());
        type(By.name("work"), contactData.getWorkPhone());
        type(By.name("fax"), contactData.getFax());
        type(By.name("email"), contactData.getEmail1());
        type(By.name("email2"), contactData.getEmail2());
        type(By.name("email3"), contactData.getEmail3());
        type(By.name("homepage"), contactData.getHomePage());
        choiceList(By.name("bday"), "//select[@name='bday']/option[@value='" + contactData.getbDay() + "']", contactData.getbDay());
        choiceList(By.name("bmonth"), "//select[@name='bmonth']/option[@value='" + contactData.getbMonth() + "']", contactData.getbMonth());
        type(By.name("byear"), contactData.getbYear());
        choiceList(By.name("aday"), "//select[@name='aday']/option[@value='" + contactData.getAday() + "']", contactData.getAday());
        choiceList(By.name("amonth"), "//select[@name='amonth']/option[@value='" + contactData.getAmounth() + "']", contactData.getAmounth());
        type(By.name("ayear"), contactData.getaYear());
        choiceList(By.name("new_group"), "//select[@name='new_group']/option[text()='" + contactData.getGroup() + "']", contactData.getGroup());
        type(By.name("address2"), contactData.getAddres2());
        type(By.name("phone2"), contactData.getPhone2());
        type(By.name("notes"), contactData.getNotes());
    }

    private void choiceList(By locator, String xPath, String param) {
        if (!xPath.contains("null")) {
            new Select(wd.findElement(locator)).selectByVisibleText(param);
            click(By.xpath(xPath));
        }
        else {
            Assert.assertFalse(isElementPresent(By.xpath(xPath)));
        }
    }

    public void returnToHomePage() {
        click(By.linkText("home page"));
    }

    public void submitContactCreation() {
        click(By.name("submit"));
    }

    public void editContact() {
        click(By.xpath("//img[@title='Edit']/.."));
    }

    public void submitContactModification() {
        click(By.name("update"));
    }

    public void createContact(ContactData contact) {
        new NavigationHelper(wd).goToContactCreatePage();
        fillContactForm(contact);
        submitContactCreation();
    }

    public boolean isThereAcontact() {
        return isElementPresent(By.xpath("//td[@class='center']/input"));
    }
}
