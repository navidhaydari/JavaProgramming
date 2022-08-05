package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" enter the number");
        int num = scan.nextInt();
        String result = "";
        if (num>=1 && num<=7){
            if (num==1) {
                result = "monday";
            } else if (num==2) {
                result="Tuesday";

            } else if (num==3) {
                result="wednesday";
            } else if (num==4) {
                result="thursday";

            } else if (num==5) {
                result="friday";

            } else if (num==6) {
                result="saturday";

            } else if (num==7) {
                result="sunday";


            }
        }else {
            result="invalid";
        }
        System.out.println("result = " + result);
        scan.close();
    }
}
