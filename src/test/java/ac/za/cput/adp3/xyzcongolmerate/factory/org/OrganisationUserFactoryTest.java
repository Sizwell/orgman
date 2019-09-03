package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationUserFactoryTest {

    OrganisationUser organisationUser;
    OrganisationUser organisationUserSecond;

    @Before
    public void setUp() throws Exception {
        organisationUser = OrganisationUserFactory.buildOrganisationUser("SDJK676U", "sizwe@org.co.za");
        organisationUserSecond = OrganisationUserFactory.buildOrganisationUser("BTX-F5X", "myOrg@org.co.za");
    }

    @Test
    public void buildOrganisationUser() {

        Assert.assertEquals(organisationUserSecond.getOrgCode(), "BTX-F5X", "BTX-F5X");
        System.out.println("Organization 1 Code: " + organisationUser.getOrgCode());
    }

    @Test
    public void getOrganizationCode()
    {
        Assert.assertNotNull(organisationUser.getOrgCode());
    }
}