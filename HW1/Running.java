package HW1;

public class Running extends Obstacle{
        private int distance;

        public Running (int distance) {
            this.distance = distance;
        }

        @Override
        public void doIt(Homework1.Triatlon competitor) {
            competitor.run(distance);
        }
}

