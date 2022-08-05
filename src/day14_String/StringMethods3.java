package day14_String;

public class StringMethods3 {
    public static void main(String[] args) {
        String word = "Cydeo School";
        //             0123456....
        word = word.substring(0,5); // from zero to five it brings chars
        System.out.println("word = " + word);

        String word2 = "Java Programming Language";
        String s1= word2.substring(0,word2.indexOf(" ")); // java
        String s2 = word2.substring(word2.indexOf(" ")+1 , word2.lastIndexOf(" ") ); // programming
        String s3= word2.substring(word2.lastIndexOf(" ")+1); // language
        System.out.println("word2 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);


    }
}
