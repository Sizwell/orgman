package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceFactoryTest {

    //TODO: implement method body ONLY!

    Race race;

    @Before
    public void setUp() throws Exception {
        this.race = RaceFactory.buildRace("African");
    }

    @Test
    public void buildRace() {

        Assert.assertEquals(race.getRaceDescription(), "Asian");

    }

    @Test
    public void getRaceId()
    {
        Assert.assertNotNull(race.getRaceId());
        System.out.println("Race ID: " + race.getRaceId() + " Race Description: " + race.getRaceDescription());
    }
}