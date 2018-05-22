public class SpaceCalculator {


//    method that takes in a Planet enum and a double age.
//    returns the inputted age divided by the value assigned to the inputted Planet
//    within the enum Planet
    public static double calculateAgeOnPlanet(Planet planet, double age) {
        return age / planet.getOrbitalPeriod();
    }

    //refactored above to use enum value
//    public static double calculateAgeOnPlanet(Planet planet, double age) {
//        double ageOnPlanet = 0;
//        if (planet == Planet.EARTH){
//            ageOnPlanet = age;
//        } else if (planet == Planet.MERCURY){
//            ageOnPlanet = (age / 0.2408467);
//        } else if (planet == Planet.VENUS){
//            ageOnPlanet = (age / 0.61519726);
//        } else if (planet == Planet.MARS){
//            ageOnPlanet = (age / 1.8808158);
//        } else if (planet == Planet.JUPITER){
//            ageOnPlanet = (age / 11.862615);
//        } else if (planet == Planet.SATURN){
//            ageOnPlanet = (age / 29.447498);
//        } else if (planet == Planet.URANUS){
//            ageOnPlanet = (age / 84.016846);
//        } else if (planet == Planet.NEPTUNE){
//            ageOnPlanet = (age / 164.79132);
//        } else if (planet == Planet.PLUTO){
//            ageOnPlanet = (age / 248.00);
//        }
//        return ageOnPlanet;
//    }

//  method to give age in seconds added, which uses the method above to first calculate the age
//    in years, then multiply this by the seconds in an earth year.
    public static double calculateAgeOnPlanetInSeconds(Planet planet, int age) {
         return calculateAgeOnPlanet(planet, age) * 31557600;
    }
}
