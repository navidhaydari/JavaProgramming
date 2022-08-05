package day21_ForEachLoop;

public class UniqueElements {
    public static void main(String[] args) {

        String[] names = {"navid", "navid", "basit", "bayes", "basit"};

        for (String each : names) {

            int count = 0;
            for (String elements : names) {
                if (elements.equals(each)) {
                    count++;
                }

            }
            if (count==1){
                System.out.println(each);



}
        }
    }
}
