package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRoleFactoryTest {

    UserRole userRole;

    @Before
    public void setUp() throws Exception {
        userRole = UserRoleFactory.buildUserRole("JHGDS", "user@demo.co.za", "FGHJ");
    }

    @Test
    public void buildUserRole() {
     //   throw new UnsupportedOperationException("Not supported yet.");
        /**
         * Your implementation goes here
         *
         * INSTRUCTION
         * 1. Remove line [//TODO: implement method body ONLY!]
         * 2. Remove line [throw new UnsupportedOperationException("Not yet supported.");]
         * 3. Test the UserRoleFactory class
         * 4. Assert that the an object is created.
         */

        Assert.assertNotNull(userRole.getOrgCode(), userRole.getRoleId());
        System.out.println("User Role: " + userRole.getOrgCode() + "\nRole ID: " + userRole.getRoleId());
    }

    @Test
    public void getRoleAndOrgCode()
    {
        Assert.assertNotEquals(userRole.getOrgCode(), userRole.getRoleId());
        System.out.println("User Role: " + userRole.getOrgCode() + "\nRole ID: " + userRole.getRoleId());
    }
}