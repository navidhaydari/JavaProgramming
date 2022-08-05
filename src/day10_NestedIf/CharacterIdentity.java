package day10_NestedIf;

public class CharacterIdentity {
    public static void main(String[] args) {
        /*
4. Create a class called Character Identity, and write a program that can
identify if the given character is a digit or Alphabetic Character(A~Z
or a~Z) or a special character
Ex:
ch = '@'
output:
Special Character
HINT: You may wanna check out the numbers of the
chracters on ASCII table
         */
        char chr = 'l';

           if (chr >='0' && chr <= '9'){

               System.out.println("Digit");} else if (chr>='A' && chr<='Z' || (chr>='a' && chr<='z')  ) {
               System.out.println("Alphabetic");
           }else {
               System.out.println("Special character");
           }
    }
}
