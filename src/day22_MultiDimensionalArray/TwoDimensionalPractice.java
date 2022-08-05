package day22_MultiDimensionalArray;

import java.util.Arrays;

public class TwoDimensionalPractice {
    public static void main(String[] args) {
        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"} };

            for (String[] eachArray : items) {
                for (String element : eachArray) {
                    System.out.print(element + "\t");

                }

                System.out.println();

            }
        System.out.println("------------------------------");
        for (int i = 0; i < items.length; i++) {
            for (int j = items[i].length - 1; j >= 0; j--) {
                System.out.print(items[i][j] + "\t");

            }
            System.out.println();
        }

            }

        }




