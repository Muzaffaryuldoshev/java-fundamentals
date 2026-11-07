package classes_objects_p2_08;

public class Light {
    int noOfWatts;
    boolean indicator;
    String location;

    public Light() {
        System.out.println("No-arg");
    }

    public Light(int noOfWatts, boolean indicator) {
        this();
        this.noOfWatts = noOfWatts;
        this.indicator = indicator;
        System.out.println("two-arg");
    }

    public Light(int noOfWatts, boolean indicator, String location) {
            this(noOfWatts, indicator);
        this.location = location;
        System.out.println("three arg");
    }

    public static void main(String[] args) {
        Light light1 = new Light(40, true, "Bathroom");
        System.out.println(light1);
    }

}
