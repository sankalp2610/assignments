public class ThakurSankalpA6 {
    public static void main(String arrgs[]){
        Attacker a=new Attacker();
        a.printInfo();

        Goalkeeper g = new Goalkeeper("Eric",34,5,1);
        g.printInfo();
        Player.isLeading(a,g);

        a.chu();
        System.out.println(Player.count );
        g.callCount();
    }
}
