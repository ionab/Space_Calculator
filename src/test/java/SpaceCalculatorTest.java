
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class SpaceCalculatorTest {

//    earth, mercury, venus, mars, jupiter, saturn, uranus, neptune, pluto

// Test using org.unit that when you use the method calculateAgeOnPlanet method, passing in the arguments of
//  the planet Enum earth, you get 27 back, with a delta value of 0.01.
    @Test
    public static void canGetAgeOnEarth(){
        assertEquals(27, SpaceCalculator.calculateAgeOnPlanet(Planet.EARTH, 27), 0.01);
    }

}
