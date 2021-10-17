package HW1;

public class Bicycling extends Obstacle{
    private int distance;

    public Bicycling (int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Triatlon competitor) {
        competitor.run(distance);
    }
}
