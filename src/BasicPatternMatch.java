public class BasicPatternMatch {

    public static void main(String[] args) {
        Object thing = classProducer();

        //The old way
        if (thing instanceof Airplane ) {
            Airplane plane = new Airplane();
            plane.fly();
        } else if (thing instanceof Helicopter) {
            Helicopter helicopter = new Helicopter();
            helicopter.hover();
        }

        //Type patterns finalized in Java 16 - pattern variables are final local vars that are declared and initialized in the same place.
        if (thing instanceof Airplane plane) {
            plane.fly();
        } else if (thing instanceof Helicopter helicopter) {
            helicopter.hover();
        }
    }

    public static Object classProducer() {
        return new Airplane();
    }
}
