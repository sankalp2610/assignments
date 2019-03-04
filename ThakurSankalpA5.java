public class ThakurSankalpA5 {
    private double length, height, width, weight;

    //constructor
    ThakurSankalpA5(double length,double height,double width,double weight){
        this.length=length;
        this.height=height;
        this.width=width;
        this.weight=weight;
    }
    public void rearrangeDim() {
        //rearranges dimensions (length, height, width)
        double temp;
        if(height>length){
            temp=length;
            length=height;
            height=temp;
        }
        if(width>length){
            temp=length;
            length=width;
            width=temp;
        }
        // values of the package such that “length” holds the largest value
    }

    public double calculateGirth() {
        rearrangeDim();
        double girth = 2 * (height + width);
        //calculates the girth of a package where girth is the perimeter
        //around the “height” and “width” and returns the girth value
        return girth;
    }

    public int validatePackage() {
        calculateGirth();
        if(length+calculateGirth()>100&& weight>70){
            return 3;
            //A package cannot be mailed if the sum of its length and girth is greater than 100 inches,
        }
        else if(weight>70){
            // or if the package weighs is more than
            // 70 pounds.
            return 2;
        }
        else if(length+calculateGirth()>100 ){
            return 1;
        }
        else
            return 0;

    }

    public void print() {
        //System.out.println(" ");
        validatePackage();
        if(validatePackage()==0){
            System.out.println("package is acceptable");//displays if the package is acceptable or not and also displays necessary details of the package as shown below
        }
        if(validatePackage()==1){
            System.out.println("package is too large");
            System.out.println("The length of package= "+length);

            System.out.println("The girth of package= "+calculateGirth());
        }
        if(validatePackage()==2) {
            System.out.println("package is too heavy");
            System.out.println("The weight of package= " + weight);
            //System.out.println("The girth of package= "+calculateGirth());}
        }
            if (validatePackage() == 3) {
                System.out.println("package is too large and too heavy");
                System.out.println("The length of package= " + length);
                System.out.println("The girth of package= " + calculateGirth());
                System.out.println("The weight of package "+weight);
            }
        }
    public static void main(String args[]){
        ThakurSankalpA5 obj1 = new ThakurSankalpA5(5, 13.5, 2, 40);
        obj1.print();
        ThakurSankalpA5 obj2 = new ThakurSankalpA5(15.7, 25, 54, 47.6);
        obj2.print();
        ThakurSankalpA5 obj3 = new ThakurSankalpA5(13, 10.9, 21, 90.5);
        obj3.print();
        ThakurSankalpA5 obj4 = new ThakurSankalpA5(43, 45, 10.8, 102.0);
        obj4.print();
        System.out.println("program completed");


    }
}