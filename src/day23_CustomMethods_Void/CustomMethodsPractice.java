package day23_CustomMethods_Void;

public class CustomMethodsPractice {
    public static void main(String[] args) {
        helloCydeoFiveTimes();

        helloWorldFiveTimes();
        evenNumbersOneToTen();
    }
    // create a function that can print hello world 5 times
    public static void helloWorldFiveTimes(){
        for (int i = 0; i < 5; i++) {
            System.out.println("hello world");
        }
    }

    // create a function that can creates hello cydeo 5 times
    public static void helloCydeoFiveTimes(){
        for (int j = 0; j < 5; j++) {
            System.out.println("hello Cydeo");
        }

    }
    // create a function from one to ten all even numbers.
    public static void evenNumbersOneToTen(){
        for (int i = 0; i < 10; i+=2) {
                System.out.print(i);
            }
            System.out.println();

        }
    }



