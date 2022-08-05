package day08_IfStatement;

public class SwapTwoVariables_WithTemporaryVariable {
    public static void main(String[] args) {
        int a = 10,
                b= 15,
                c=b;
        b=a;
        a=c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
