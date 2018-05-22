public class SpaceCalculator {

//    Earth: Orbital period 365.25 Earth days, or 31,557,600 seconds
//    Mercury: Orbital period 0.2408467 Earth years
//    Venus: Orbital period 0.61519726 Earth years
//    Mars: Orbital period 1.8808158 Earth years
//    Jupiter: Orbital period 11.862615 Earth years
//    Saturn: Orbital period 29.447498 Earth years
//    Uranus: Orbital period 84.016846 Earth years
//    Neptune: Orbital period 164.79132 Earth years
//    Pluto: Orbital period 248.00 Earth years


    public static double calculateAgeOnPlanet(Planet planet, double age) {
        double ageOnPlanet = 0;
        if (planet == Planet.EARTH){
            ageOnPlanet = age;
        } else if (planet == Planet.MERCURY){
            ageOnPlanet = (age / 0.2408467);
        } else if (planet == Planet.VENUS){
            ageOnPlanet = (age / 0.61519726);
        } else if (planet == Planet.MARS){
            ageOnPlanet = (age / 1.8808158);
        } else if (planet == Planet.JUPITER){
            ageOnPlanet = (age / 11.862615);
        }
        return ageOnPlanet;
    }

}
