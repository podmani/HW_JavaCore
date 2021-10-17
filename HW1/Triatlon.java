package HW1;

public interface Triatlon {
    void run(int distance);
    void swim(int distance);
    void bike(int distance);
    boolean isOnDistance();
    void showResult();
}
