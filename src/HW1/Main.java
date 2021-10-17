package HW1;

public class Main {
    public static void main(String[] args) {

        Triatlon[] participants = {new Homework1.Spartak("Сергей"), new Dinamo("Алексей"), new Dinamo("Петр"),new Homework1.Spartak("Иван")};
        Obstacle[] obstacles = {new Running(10), new Swiming(2), new Homework1.Bicycling(40)};

        Team team = new Team("Сборная России", participants);

        System.out.println("Команда");
        System.out.println(team.getTeamName());

        System.out.println("Члены команды");
        team.showResults();

        Course course = new Course(obstacles);

        System.out.println("Препятствия");
        course.doIt(team);

        System.out.println("Результаты");
        team.showResults();

        System.out.println("Прошли препятсвия");
        team.showMembersFinishedCourse();
    }
}

