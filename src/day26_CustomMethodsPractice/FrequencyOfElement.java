package day26_CustomMethodsPractice;


public class FrequencyOfElement {
    public static void main(String[] args) {
    int[] arr = {1,2,3,4,3,2,3,3,4,5,6};
    int n= frequencyOfElement(arr,3);
        System.out.println(n);
        System.out.println("-----------------");

        double[] arr1= {1.4,3.4,1.4,3.4,5.5,1.4};
        double n2 =frequencyOfElement(arr1,1.4);
        System.out.println(n2);

    }

   // returns the frequency of the given element from the given array
    public static int frequencyOfElement(int[] array , int element){
        int count = 0;
        for( int each: array){
            if (each==element){
                count++;
            }
        }
        return count;
    }
    public static double frequencyOfElement(double[] array , double element){
        int count = 0;
        for( double each: array){
            if (each==element){
                count++;
            }
        }
        return count;
    }

    public static int frequencyOfElement(char[] array , char element){
        int count = 0;
        for( char each: array){
            if (each==element){
                count++;
            }
        }
        return count;
    }

    public static int frequencyOfElement(String[] array , String element){
        int count = 0;
        for( String each: array){
            if (each==element){
                count++;
            }
        }
        return count;
    }
}
