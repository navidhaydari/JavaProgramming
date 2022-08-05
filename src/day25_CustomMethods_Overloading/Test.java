package day25_CustomMethods_Overloading;
import utilities.StringUtility;
public class Test {
    public static void main(String[] args) {

        String str= "Java Programming language";
        StringUtility.printEachChar(str);
        System.out.println("----------");
        String s1 = "wooden spoon";
        String rev = StringUtility.reverse(s1);
        System.out.println(rev);
        System.out.println("----------");
        String s2 = "ana";
       boolean isPal = StringUtility.isPalindrome(s2);
        System.out.println(isPal);
        System.out.println("---------------------");

        String[] names = {"anna", "navid","level"};

        int count = 0;

        for (String each : names) {
            if (StringUtility.isPalindrome(each)){
                count++;
            }

        }
        System.out.println(count);

        System.out.println();

        String st1 = "abcd";
        String st2 = "adcb";
        boolean isAna = StringUtility.isAnagram(st1,st2);
        System.out.println(isAna);
    }
}
