package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class UserDemographyFactoryTest {

    UserDemography userDemography;
    Date date = new Date();


    @Before
    public void setUp() throws Exception {
       userDemography = UserDemographyFactory.buildUserDemography("user@demo.co.za", "Mr."
       , "BTYX09-QTZ", "CVPY-567FT", date);
    }

    @Test
    public void buildUserDemography() {

        Assert.assertNotNull(userDemography.getUserEmail(), userDemography.getDateOfBirth());
        System.out.println("User email: " + userDemography.getUserEmail() + " Date Of Birth: " + userDemography.getDateOfBirth());
    }

    @Test
    public void getUserDetails()
    {
        Assert.assertNotNull(userDemography.getGenderId(), userDemography.getRaceId());
        System.out.println("User id: " + userDemography.getRaceId() + " Gender Id: " + userDemography.getGenderId());
    }
}