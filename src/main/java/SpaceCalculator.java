public class SpaceCalculator {


    public static double calculateAgeOnPlanet(Planet planet, int age) {
        double ageOnPlanet = 0;
        if (planet == Planet.EARTH){
            ageOnPlanet = age;
        }
        return ageOnPlanet;
    }

}
