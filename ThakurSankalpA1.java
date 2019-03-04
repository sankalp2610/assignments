import java.util.Scanner;
public class ThakurSankalpA1 {
    double q,w,e;
    public void setSide(double q,double w,double e) {
        this.q = q;
        this.w = w;
        this.e = e;
    }
    public double getQ(){
        return this.q;
    }
    public double getW(){
        return this.w;
    }
    public double getE(){
        return this.e;
    }
    public static int checkValidity(double q,double w,double e)
    {
        // check condition
        if (q+w>e&&w+e>q&&e+q>w)
            return 1;
        else
            return 0;
    }

    public static void main(String args[]){
        ThakurSankalpA1 obj = new ThakurSankalpA1();
        Scanner get=new Scanner(System.in);
        System.out.println("Enter the input:");
        obj.setSide(get.nextDouble(),get.nextDouble(),get.nextDouble());
        if((checkValidity(obj.getQ(),obj.getW(),obj.getE() )) == 1){
            System.out.println("Sides ("+obj.getQ()+","+obj.getW()+","+obj.getE()+") can form a triangle!");

        }
        else
            System.out.println("Sides ("+obj.getQ()+","+obj.getW()+","+obj.getE()+") can not form a triangle!");
        System.out.println("Program completed!");
    }

}
