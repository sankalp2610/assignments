import java.util.Arrays;
import java.util.Comparator;

public class ThakurSankalpA3 {
    static String string1 = "sea";
    static String string2 = "eat";
    static String string3 = "The little drops of water, little grains of sand, Make the mighty ocean and the beauteous land. And the little moments, Humble though they be, Make the mighty ages of eternity. so our little errors lead the soul away";
    public static String getString1(){
        return string1;
    }
    public static String getString2(){
        return string2;
    }
    public static String getString3(){
        return string3;
    }
        public static void main(String args[]){
            ThakurSankalpA3 obj = new ThakurSankalpA3();
            //taking longest common substring from both strings, if anything is common I edit the original one else original strings are not changed
            String string4=obj.lcs(getString1(),getString2());
            if(string4!=""){
                string1=string2=string4;
                System.out.println("New string1 is : "+getString1());
                System.out.println("New string2 is : "+getString2());
            }
            else {
                System.out.println("There is no change in string1 and string2");
            }
            System.out.println("Is new string 1 and new string 2 equal:"+obj.equal(getString1(),getString2()));
            System.out.print("Occurrences of  little: ");
            obj.countOccurrences(getString3(),"little");
            obj.longestWord(getString3());
            System.out.println("Reversed Capital Paragraph: ");
            obj.capNrev(getString3());

    }
    boolean equal(String xyz,String abc){
        if(xyz.equals(abc)){
            return true;
        }
        else
            return false;
    }
    public static String lcs(String a, String b){
        int aLen = a.length();
        int bLen = b.length();
        if(aLen == 0 || bLen == 0){
            return "";
        }else if(a.charAt(aLen-1) == b.charAt(bLen-1)){
            return lcs(a.substring(0,aLen-1),b.substring(0,bLen-1))
                    + a.charAt(aLen-1);
        }else{
            String x = lcs(a, b.substring(0,bLen-1));
            String y = lcs(a.substring(0,aLen-1), b);
            return (x.length() > y.length()) ? x : y;
        }
    }
    long countOccurrences(String xyz, String search){
        long i=Arrays.stream(xyz.split("[ ,\\.]")).filter(s -> s.equals(search)).count();
        System.out.println(i);
        return i;

    }
    String longestWord(String xyz){
        System.out.println("Longest Word: "+Arrays.stream(xyz.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null));
        return xyz;

    }
    String capNrev(String xyz){
        String str2 = xyz.toUpperCase();
        //System.out.println("str1 changed to all uppercase: " + str2);
        String output = "";
        String[] array = str2.split(" ");
        for(int i = array.length-1; i >= 0; i--)
        {
            output += array[i];
            if (i != 0) { output += " "; }
        }
        System.out.println("printing with punctuation");
        System.out.println(output);
        String output1 = output.replace(",","");
        output1 = output1.replace(".", "");
        System.out.println("printing without punctuation");
        //System.out.println(output.replaceAll(","," "));
        System.out.println(output1);
        return output1;
    }
}
