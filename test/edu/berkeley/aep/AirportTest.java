package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    @Test
    public void oneAAirportShouldBeAbleToReachItself(){
        Airport one = new Airport("one");
        assertEquals(true, one.isReachable(one));
    }

    @Test
    public void AirportAShouldBeAbleToReachAirportF(){
        Airport a = new Airport("a");
        Airport f = new Airport("f");
        a.connectToAnotherAirport(f);
        assertEquals(true, a.isReachable(f));
    }
}
