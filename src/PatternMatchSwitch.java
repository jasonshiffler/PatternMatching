public class PatternMatchSwitch {

    public static void main(String[] args) {

        //Pattern Matching in Switch is in its second preview in Java 18.
        Object thing = classProducer();
        switch (thing) {
            case Helicopter helo -> helo.hover();
            case Airplane plane -> plane.fly();
            default -> throw new IllegalStateException("Unexpected value: " + thing);
        }
    }

    public static Object classProducer() {
        return new Helicopter();
    }
}
