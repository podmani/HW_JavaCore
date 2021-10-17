package HW1;

public class Course {

    Obstacle[] obstacles;

    public Course(Obstacle[] obstacles){
        this.obstacles = obstacles;
    }

    public void doIt(Homework1.Team team){
        Homework1.Triatlon[] participants = team.getMembers();
        if(participants.length > 0){
            for (Homework1.Triatlon c: participants){
                for (Obstacle o: obstacles){
                    o.doIt(c);
                    if (!c.isOnDistance()) break;
                }
            }
        } else {
            System.out.println("Команда не сформирована");
        }
    }
}

