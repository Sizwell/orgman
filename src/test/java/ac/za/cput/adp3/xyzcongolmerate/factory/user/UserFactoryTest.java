package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryTest {

    User user;

    @Before
    public void setUp() throws Exception {
        user = UserFactory.buildUser("user@demo.co.za", "Sizwe", "Ncikana");
    }

    @Test
    public void buildUser() {

        Assert.assertNotNull(user.getUserEmail(), user.getUserEmail());
        System.out.println("User email: " + user.getUserEmail() + "\nUserName: " +user.getFirstName()
        +"\nLastName: " + user.getLastName());
    }
}