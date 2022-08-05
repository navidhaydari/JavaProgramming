package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {

        int number = 100;
        System.out.println("number = " + number); // 100

        number = 200;
        System.out.println("number = " + number); // 200

        String word = " Java Programming" ;
        System.out.println("word = " + word); // Java programming
        System.out.println("------------------------");


        word = "Wooden Spoon";
        System.out.println("word = " + word); // wooden Spoon

        System.out.println("--------------------------------");

        int x = 100;
        x += 200; // 300
        System.out.println(x);

        String name = "Wooden";
        name+="spoon";
        System.out.println(name);

        System.out.println("===========================");
        double money = 500;
        money += 350;
        System.out.println(money);
        System.out.println("--------------------------");
        int avl = 3000;
        avl -= 1000;
        System.out.println("avl = " + avl);
        System.out.println("-----------------");
        int quarters = 156;
        quarters%=25;
        System.out.println("quarters = " + quarters);

        int cent5 = 500;
        cent5 %= 5;
        System.out.println("cent5 = " + cent5);

        int ab = 300;
        ab%=16;
        System.out.println("ab = " + ab);

        System.out.println("-------------------");
        int balance = 3000;
        balance%=153; // insurance fee:153
        System.out.println("balance = " + balance);




    }

}
