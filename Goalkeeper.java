import javax.naming.Name;

public class Goalkeeper  extends Player{
    int GoalSaved,GoalsConceded;
    public Goalkeeper(String name, int age, int saved, int conceded){
        super(name, age);
        GoalSaved=saved;
        GoalsConceded=conceded;
        setTotalPoints(GoalSaved-GoalsConceded);

    }
    void printInfo(){
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Type: Goalkeeper");
        System.out.println("Goals Saved: "+GoalSaved);
        System.out.println("Goals conceded: "+GoalsConceded);
        System.out.println("Total points: "+super.getTotalPoints());
    }
}
//Goalkeeper.java:
//1)	GoalsSaved (int) – number of goals saved [1 point per goal saved]
//2)	GoalsConceded (int) – number of goals conceded (not saved) [-1 point per goal]
//
//•	TotalPoints are the combination of the points mentioned in bold as per the type of player.
//•	printInfo() is overridden in the two derived classes (Look at the output for clear understanding)
//
//The headers of the constructors are as:
//public Player(String name, int age)
//public Attacker(String name, int age, int scored, int missed)
//public Goalkeeper(String name, int age, int saved, int conceded)
//
//Create a last java class LastnameFirstnameA6.java in the same package which contains the main method to call the constructors (and other methods, if required) of all the classes defined above.
//
//Sample input:
//Attacker a = new Attacker(“Lionel Messi”, 29, 3, 0);
//Goalkeeper g = new Goalkeeper(“Petr Cech”, 34, 5, 1);
//
//Sample output:
//
