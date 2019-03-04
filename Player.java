public class Player {
    private String Name;
    private int Age, TotalPoints;
     static int count=1;
    public static void callCount(){
        System.out.println("static wala");
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getTotalPoints() {
        return TotalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        TotalPoints = totalPoints;
    }

    static boolean isLeading(Player a,Player b){
        if(a.TotalPoints>b.TotalPoints){
            System.out.println(a.Name+" leads "+b.Name+" by "+(a.TotalPoints-b.TotalPoints)+" points");
        return true;
        }
        else{
            System.out.println(b.Name+" leads "+a.Name+" by "+(b.TotalPoints-a.TotalPoints)+" points");
            return true;
        }


    }
    public Player(){

    }
    void printInfo(){
        System.out.println("Name: "+Name);
        System.out.println("Age: "+Age);


    }
    public Player(String name,int age){
        Name=name;
        Age=age;
    }

}
//Create a class ‘Player.java’ that contains private data members - Name (String), Age (int), TotalPoints (int) and
// two member methods – ‘printInfo()’ to print the information as shown in the output below and ‘isLeading()’
// which returns a boolean; to check whether one player is leading the other by some points.
//•	TotalPoints are the combination of the points mentioned in bold as per the type of player.
//•	printInfo() is overridden in the two derived classes (Look at the output for clear understanding)
//
//The headers of the constructors are as:
//public Player(String name, int age)