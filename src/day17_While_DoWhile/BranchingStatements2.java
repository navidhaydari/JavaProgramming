package day17_While_DoWhile;

public class BranchingStatements2 {
    public static void main(String[] args) {
        for (char i = 'A'; i <='E' ; i++) {
            if (i=='C'){
                continue;
            }
            System.out.println(i);

        }
        System.out.println("--------------------");

        // printing even numbers with continue
        for (int i = 1; i <=10 ; i++) {
            if ((i%2!=0)){
                continue;  // its used just for skip

            }
            System.out.println(i);

        }
        System.out.println("--------------------");
        // printing odd numbers with continue
        for (int i = 1; i<=10 ; i++){
            if (i%2==0){
                continue;
            }
            System.out.println(i);
        }


    }
}
