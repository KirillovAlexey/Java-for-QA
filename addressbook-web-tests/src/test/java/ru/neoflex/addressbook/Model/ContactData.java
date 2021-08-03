package ru.neoflex.addressbook.Model;

public class ContactData {
    private static String fName;
    private static String mName;
    private String lName;
    private String nickName;
    private String title;
    private String company;
    private String address;
    private String homePpone;
    private String mobilePhone;
    private String workPhone;
    private String fax;
    private String email1;
    private String email2;
    private String email3;
    private String homePage;
    private String bDay;
    private String bMonth;
    private String bYear;
    private String aday;
    private String amounth;
    private String aYear;
    private String group;
    private String addres2;
    private String phone2;
    private String notes;

    public ContactData(String fName, String mName, String lName, String nickName, String title, String company, String address, String homePpone,
                       String mobilePhone, String workPhone, String fax, String email1, String email2, String email3, String homePage, String bDay,
                       String bMonth, String bYear, String aday, String amounth, String aYear, String group, String addres2, String phone2, String notes) {
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
        this.nickName = nickName;
        this.title = title;
        this.company = company;
        this.address = address;
        this.homePpone = homePpone;
        this.mobilePhone = mobilePhone;
        this.workPhone = workPhone;
        this.fax = fax;
        this.email1 = email1;
        this.email2 = email2;
        this.email3 = email3;
        this.homePage = homePage;
        this.bDay = bDay;
        this.bMonth = bMonth;
        this.bYear = bYear;
        this.aday = aday;
        this.amounth = amounth;
        this.aYear = aYear;
        this.group = group;
        this.addres2 = addres2;
        this.phone2 = phone2;
        this.notes = notes;
    }

    public String getfName() {
        return fName;
    }

    public String getmName() {
        return mName;
    }

    public String getlName() {
        return lName;
    }

    public String getNickName() {
        return nickName;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getHomePpone() {
        return homePpone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public String getFax() {
        return fax;
    }

    public String getEmail1() {
        return email1;
    }

    public String getEmail2() {
        return email2;
    }

    public String getEmail3() {
        return email3;
    }

    public String getHomePage() {
        return homePage;
    }

    public String getbDay() {
        return bDay;
    }

    public String getbMonth() {
        return bMonth;
    }

    public String getbYear() {
        return bYear;
    }

    public String getAday() {
        return aday;
    }

    public String getAmounth() {
        return amounth;
    }

    public String getaYear() {
        return aYear;
    }

    public String getGroup() {
        return group;
    }

    public String getAddres2() {
        return addres2;
    }

    public String getPhone2() {
        return phone2;
    }

    public String getNotes() {
        return notes;
    }
}
