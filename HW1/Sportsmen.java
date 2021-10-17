package HW1;

public class Sportsmen implements Triatlon{
    String type;
    String name;
    int maxRunDistance;
    int maxBikeDistance;
    int maxSwimDistance;
    boolean onDistance;

    public boolean isOnDistance() {
        return onDistance;
    }

    public Sportsmen(String type, String name, int maxRunDistance, int maxBikeDistance, int maxSwimDistance) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxBikeDistance = maxBikeDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = true;
    }

    public void run(int distance){
        if (distance <=maxRunDistance){
            System.out.println(type + " " + name + " " + " пробежал");
        } else {
            System.out.println(type + " " + name + " " + " сошел на этапе бега");
            onDistance = false;
        }
    }

    public void bike(int distance){
        if (distance <=maxBikeDistance){
            System.out.println(type + " " + name + " " + " проехал на велосипеде");
        } else {
            System.out.println(type + " " + name + " " + " сошел на этапе велогонки");
            onDistance = false;
        }
    }

    public void swim(int distance){
        if (distance <=maxSwimDistance){
            System.out.println(type + " " + name + " " + " проплыл дистанцию");
        } else {
            System.out.println(type + " " + name + " " + " сошел на этапе плавания");
            onDistance = false;
        }
    }

    public void showResult(){
        System.out.println(type + " " + name + ": " + onDistance);
    }

}
