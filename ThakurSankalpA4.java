import java.util.Scanner;

public class ThakurSankalpA4 {
    double fees = 0;
    public double tuitioncalculator(){
        int flag=0;

        char state,major;
        System.out.println("Welcome");
        System.out.println("Please fill the details to get an estimate of your tuition ");
        System.out.println("Enter your name");
        Scanner x1= new Scanner(System.in);
        String name = x1.nextLine();
        System.out.println("Enter your Student ID ");
        long id= x1.nextLong();
        do {
            System.out.println("Enter Instate(I) or Outstate(O) ");
            state = x1.next().toUpperCase().charAt(0);
            if (Character.toString(state).matches("O")) {
                flag = 1;
            } else if (Character.toString(state).matches("I")) {
                flag = 1;
            }
        }
        while (flag==0);
        flag=0;
        do {
            System.out.println("Enter  CS major(C) or Other Science major(O) or other major(M)");
            major = x1.next().toUpperCase().charAt(0);
            if (Character.toString(major).matches("C")) {
                flag = 1;
            } else if (Character.toString(major).matches("O")) {
                flag = 1;
            } else if (Character.toString(major).matches("M")){
                flag=1;}
        }
        while (flag==0);
        System.out.println("Enter Credits ");
        int grades=x1.nextInt();
        if(grades>12){
            fees=grades * 1000;

        }
        else{
            fees=grades * 1200;

        }
        if(Character.toString(state).matches("O")){
            fees=1.2*fees;
        }
        if(Character.toString(major).matches("C")){
            fees=fees+250;
        }
        if(Character.toString(major).matches("O")){
            fees=fees+150;
        }
        return fees;
    }

}
class test{
    public static void main(String args[]){
        ThakurSankalpA4 obj = new ThakurSankalpA4();

        System.out.println(obj.tuitioncalculator());
        System.out.println("program completed");
    }
}
