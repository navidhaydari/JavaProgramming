package day14_String;

public class StringMethods2 {
    public static void main(String[] args) {
        String str1 = "Java is fun, i love learning Java";
       String str2 =  str1.replace("Java", "Python");
        System.out.println("str2 = " + str2);
        String email = "navid@gmail.com";
      String email2 =  email.replace("gmail", "yahoo");
        System.out.println("email2 = " + email2);
        String s = "Dog Dog Dog Dog";
        String c = s.replace("Dog","Cat");
        System.out.println("c = " + c);
        String s2 = "C# is fun, C# is cool"; // we want to replace one c# to java.
        String s3 = s2.replaceFirst(" C#", "Java");
        System.out.println(s3);
        String s4 = "java";
        s4 = s4.replace("a","e");
        System.out.println("s4 = " + s4);
        String s5 = "Java is th best, we enjoy using Java, Java is cool";
        s5= s5.replaceFirst("Java","C++");
        System.out.println("s5 = " + s5);


    }
}
