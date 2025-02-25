package tests;

import models.User;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RemoveContactTests extends TestBase {

    @BeforeMethod
    public void preCondition() {
        if (!app.getHelperUser().isLogged()) {
            app.getHelperUser().login(new User().withEmail("eshifrina@gmail.com").withPassword("Sugarmen0440!"));
        }
        // app.getHelperContact().provideContacts();//if list of contacts <3 ==> add 3 contacts


    }

    @Test
    public void removeFirstContact() {
        //Assert size contactList less by one

    }

    @Test
    public void removeAllContacts() {

        app.getHelperContact().removeAllContacts();

        boolean isNoContactsDisplayed = app.getHelperContact().isNoContactsHereDisplayed();
        assertTrue(isNoContactsDisplayed, "No contacts info should be displayed");
    }
}