package day08_IfStatement;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        int number = 9;
        boolean m1 = number==1 || number==3 || number==5 || number == 7 || number==8 || number==10 || number==12;
        boolean m2 = number==4 || number== 6 || number == 9 || number ==11;
        boolean m3 = number==2;
        if (m1){
            System.out.println(" 31 Days");
        }
        if ( !m1 && !m3){
            System.out.println(" 30 Days");
        }
        if (!m1 && !m2){
            System.out.println(" 28 Days");
        }
    }
}
