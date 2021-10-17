package HW1;

public class Swiming extends Obstacle {
    private int distance;

    public Swiming(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Triatlon competitor) {
        competitor.swim(distance);
    }
}
