public class Attacker extends Player{
    int GoalScored,GoalsMissed;
    public Attacker(String name, int age, int scored, int missed) {
        super(name, age);
        GoalScored = scored;
        GoalsMissed = missed;
        setTotalPoints((GoalScored*3-GoalsMissed));
    }
    public void chu(){
        super.setName("Sankalp123");
        System.out.println("dwcqece");
    }

    public Attacker(){
        super.setName("Sankalp");
        System.out.println("in sankalp");
    }

    void printInfo(){
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Type: Attacker");
        System.out.println("Goals Scored: "+GoalScored);
        System.out.println("Goals Missed: "+GoalsMissed);
        System.out.println("Total points: "+super.getTotalPoints());
    }
}