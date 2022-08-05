package day16_ForLoopStringPractice;

public class DigitsLettersSpecialCharts {
    public static void main(String[] args) {
        String str = "Cydeo12345School!@#$%WoodenSpoon";
        String digits = "";
        String letters = "";
        String SpecialChars = "";
        for (int i = 0; i <= str.length()-1 ; i++) { // i is index numbers.
            char ch = str.charAt(i); // every single characters in string.
            if (ch>='0' && ch<='9'){
                digits+= ch;

            } else if ((ch>='a' && ch<='z') || (ch>='A' && ch<= 'Z')) {
                letters+=ch;

            }else{
                SpecialChars+=ch;
            }

        }
        System.out.println(digits+"\n"+letters+"\n"+SpecialChars);

    }
}
