package day23_CustomMethods_Void;

public class OddNumbers {
    public static void main(String[] args) {
        oddNumbers();
    }

    public static void oddNumbers(){
        String result="";
        for (int i = 0; i < 100; i++) {
            if (i%2!=0){
                System.out.print(i+" ");
            }


        }
    }
}
