package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {
        String str1 = "   batch    25    ";
        str1 = str1.trim(); // remove unusable spaces
        System.out.println("str1 = " + str1); // batch   25
        String str2 = "cordoba";
        int n1 = str2.indexOf("r");
        System.out.println("n1 = " + n1); // 2
        String str3 = "Java Programming language";
        int n3 = str3.indexOf("am");
        System.out.println("n3 = " + n3); //10
        int n4 = str3.lastIndexOf("g");
        System.out.println("n4 = " + n4); //23
        String str5 = "Java Nova Cava Wawa orange";
        int firstA = str5.indexOf("a");
        System.out.println("m1 = " + firstA);
        int lastA = str5.lastIndexOf("a");
        System.out.println("lastA = " + lastA);
    }

}
