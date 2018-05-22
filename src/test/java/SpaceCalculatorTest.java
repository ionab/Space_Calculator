
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class SpaceCalculatorTest {

//    earth, mercury, venus, mars, jupiter, saturn, uranus, neptune, pluto

// NB model assumes the age is exactly 27.

// Test using org.unit that when you use the method calculateAgeOnPlanet method, passing in the arguments of
//  the planet Enum earth & the age 27, you get 27 back, with a delta value of 0.01.
    @Test
    public static void canGetAgeOnEarth(){
        assertEquals(27, SpaceCalculator.calculateAgeOnPlanet(Planet.EARTH, 27), 0.01);
    }
// Test using org.unit that when you use the method calculateAgeOnPlanet method, passing in the arguments of
//  the planet Enum Mercury & the age 27, you get 112.10450465 back, with a delta value of 0.01.
    @Test
    public static void canGetAgeOnMercury(){
        assertEquals(112.10450465, SpaceCalculator.calculateAgeOnPlanet(Planet.MERCURY, 27), 0.01);
    }

    // Test using org.unit that when you use the method calculateAgeOnPlanet method, passing in the arguments of
//  the planet Enum Venus & the age 27, you get 43.8883619215 back, with a delta value of 0.01.
    @Test
    public static void canGetAgeOnVenus(){
        assertEquals(43.8883619215, SpaceCalculator.calculateAgeOnPlanet(Planet.VENUS, 27), 0.01);
    }

    // Test using org.unit that when you use the method calculateAgeOnPlanet method, passing in the arguments of
//  the planet Enum Mars & the age 27, you get 14.3554727688 back, with a delta value of 0.01.
    @Test
    public static void canGetAgeOnMars(){
        assertEquals(14.3554727688, SpaceCalculator.calculateAgeOnPlanet(Planet.MARS, 27), 0.01);
    }

    // Test using org.unit that when you use the method calculateAgeOnPlanet method, passing in the arguments of
//  the planet Enum Jupiter & the age 27, you get 2.27605801925 back, with a delta value of 0.01.
    @Test
    public static void canGetAgeOnJupiter(){
        assertEquals(2.27605801925, SpaceCalculator.calculateAgeOnPlanet(Planet.JUPITER, 27), 0.01);
    }

    // Test using org.unit that when you use the method calculateAgeOnPlanet method, passing in the arguments of
//  the planet Enum Saturn & the age 27, you get 0.9168860458 back, with a delta value of 0.01.
    @Test
    public static void canGetAgeOnSaturn(){
        assertEquals(0.9168860458, SpaceCalculator.calculateAgeOnPlanet(Planet.SATURN, 27), 0.01);
    }

    // Test using org.unit that when you use the method calculateAgeOnPlanet method, passing in the arguments of
//  the planet Enum Uranus & the age 27, you get 0.32136412261 back, with a delta value of 0.01.
    @Test
    public static void canGetAgeOnUranus(){
        assertEquals(0.32136412261, SpaceCalculator.calculateAgeOnPlanet(Planet.URANUS, 27), 0.01);
    }

    // Test using org.unit that when you use the method calculateAgeOnPlanet method, passing in the arguments of
//  the planet Enum Neptune & the age 27, you get 0.16384358108 back, with a delta value of 0.01.
    @Test
    public static void canGetAgeOnNeptune(){
        assertEquals(0.16384358108, SpaceCalculator.calculateAgeOnPlanet(Planet.NEPTUNE, 27), 0.01);
    }



}
