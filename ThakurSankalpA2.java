public class ThakurSankalpA2 {
    public static void main(String args[]){
        int intArray[],rotations,temp=0;
        intArray = new int[]{1,3,5,7,9,11};
        rotations = 3;
        System.out.println("original array");
        for(int i=0;i<6;i++){
            System.out.print(intArray[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("rotations "+rotations);
        System.out.println("number of elements "+intArray.length);
        for(int i=0;i<rotations;i++){
            temp=intArray[0];
            //System.out.println(temp);
            for(int j=0;j<5;j++){
                intArray[j]=intArray[j+1];
            }
            intArray[intArray.length-1]=temp;
        }
        System.out.println("rotated array");
        for(int i=0;i<6;i++){
            System.out.print(intArray[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("Program Completed");


    }
}
