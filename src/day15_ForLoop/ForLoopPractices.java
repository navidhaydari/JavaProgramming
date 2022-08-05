package day15_ForLoop;

public class ForLoopPractices {
    public static void main(String[] args) {
        for (int i = 15; i<=45; i++ ){
            System.out.print(i+" ");
        }
        System.out.println(); // its important
        System.out.println("------------------");
        for (int j = 100; j>=50; j-=5){
            System.out.print(j+" ");
        }
        System.out.println();
        System.out.println("--------------------");
        /*
        print all the even numbers between 1~55
         */
        for (int i =2; i<=55; i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("--------------------");
         // second way solution
        for(int i = 1 ; i <=55 ; i ++){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("---------------------");
        for (char ch = 'A' ; ch<='Z' ; ch ++){
            System.out.print(ch+ " ");
        }

        System.out.println();
        System.out.println("---------------------");
        for(char i = 'a'; i<='z' ; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("----------------------");
        for (char i = 'Z' ; i >='A'; i--){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("-----------------------");
        for (char i = 1; i <=4000 ; i++){
            System.out.print(i+" ");
        }

    }

}
