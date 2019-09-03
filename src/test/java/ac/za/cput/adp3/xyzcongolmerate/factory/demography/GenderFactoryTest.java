package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import ac.za.cput.adp3.xyzcongolmerate.util.Helper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GenderFactoryTest {

    //TODO: implement method body ONLY!
    Gender gender;
    Helper helper;

    @Before
    public void setUp() throws Exception
    {
        this.gender = GenderFactory.buildGender("Male");
       // this.helper = Helper.getSuffixFromClassName(Class<?> getClass());
    }

    @Test
    public void buildGender() {

        System.out.println(gender.getGenderId() + " " + gender.getGenderDescription());
        Assert.assertNotNull(gender.getGenderId());

    }

}