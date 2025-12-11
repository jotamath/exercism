import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        int randomItem = random.nextInt(PLANET_CLASSES.length);
        return PLANET_CLASSES[randomItem];
    }

    String randomShipRegistryNumber() {
        int registryNumberSufix = random.nextInt(9000) + 1000;
        return "NCC-" + registryNumberSufix;
    }

    double randomStardate() {
        double starDate = random.nextDouble(1000) + 41000.0;
        return starDate;
    }
}
