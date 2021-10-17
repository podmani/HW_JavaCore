package HW1;


public class Team {
    String nameTeam; //название команды
    Triatlon participants [] = new Triatlon[4];

    public Team(String nameTeam, Triatlon[] participants){
        this.nameTeam = nameTeam;
        this.participants = participants;
    }

    public String getTeamName(){
        return "Team name: " + nameTeam;
    }

    public Triatlon[] getMembers(){
        return participants;
    }

    public void showResults(){
        for(Triatlon c: participants){
            c.showResult();
        }
    }

    public void showMembersFinishedCourse(){
        for(Triatlon c: participants){
            if(c.isOnDistance())
                c.showResult();
        }
    }
}
