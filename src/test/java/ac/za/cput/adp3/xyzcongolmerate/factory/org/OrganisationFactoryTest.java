package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationFactoryTest {

    Organisation organisation;
    Organisation organisationSecond;

    @Before
    public void setUp() throws Exception {
        this.organisation = OrganisationFactory.buildOrganisation("ABC Incorporation");
        this.organisationSecond = OrganisationFactory.buildOrganisation("XYZ Organization");
    }

    @Test
    public void buildOrganisation() {

        Assert.assertEquals(organisation.getOrgName(), "XYZ Organization", "ABC Incorporation");
    }

    @Test
    public void nameNotSame()
    {
        Assert.assertNotEquals(organisation, organisationSecond);
        if(organisation.getOrgName().equals(organisationSecond))
        {
            System.err.println("Organization has same name");
        }
        else{
            System.out.println("Organizations differ");
        }
    }

    @Test
    public void getOrganizationCode()
    {
        Assert.assertNotNull(organisation.getOrgCode());
        System.out.println("Organization name " + organisation.getOrgName() + "\nOrganization Code " + organisation.getOrgCode());
    }
}