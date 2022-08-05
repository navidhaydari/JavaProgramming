package day14_String;

public class Practice {
    public static void main(String[] args) {
        String str1 = "Java is fun, Java is Cool";
        int first = str1.indexOf("J");
        int second = str1.indexOf("n")+1;
        String three = str1.substring(first,second);
        System.out.println("three = " + three);

        String four = str1.substring(str1.indexOf(" J"), str1.indexOf("l")+1);
        System.out.println("four = " + four);



    }
}
