package day09_IfStatements;

public class Finra {
    public static void main(String[] args) {
        /*
3. Create a class called FINRA, Write a function which prints out the number.
but for number which is a multiple of 3, print "FIN" instead of the number and
for number which is a multiple of 5, print "RA" instead of the number. and
for number which is a multiple of both 3 and 5, print "FINRA" instead of the number.
            ex:
                number = 3
                  output:
                      FIN
                number = 10
            output:
                RA
                number = 15
            output:
                FINRA
 */
    int num = 15;
if (num%3==0 && (num%5==0)) {
    System.out.println("finra");
} else if (num%3 ==0) {
    System.out.println("Fin");
} else if (num%5==0) {
    System.out.println("ra");

}
    }
}