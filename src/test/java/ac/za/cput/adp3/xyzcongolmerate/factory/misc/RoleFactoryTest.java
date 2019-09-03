package ac.za.cput.adp3.xyzcongolmerate.factory.misc;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import ac.za.cput.adp3.xyzcongolmerate.factory.demography.RaceFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoleFactoryTest {

    Role role;

    @Before
    public void setUp() throws Exception {
       this.role = RoleFactory.buildRole("Clerk");
    }


    @Test
    public void buildRole() {

        Assert.assertEquals(role.getRoleName(), "Supervisor", "Supervisor");

    }

    @Test
    public void getUserRoleId()
    {
        Assert.assertNotNull(role.getRoleId());
        System.out.println("Role id: " + this.role.getRoleId() + "Role Name " + this.role.getRoleName());
    }
}