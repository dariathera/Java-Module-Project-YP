public class Car {
    String name;
    int velocity;

    Car(String name, int velocity) {
        this.name = name;
        this.velocity = velocity;
    }

    int getDistance() {
        return this.velocity * 24;
    }
}
