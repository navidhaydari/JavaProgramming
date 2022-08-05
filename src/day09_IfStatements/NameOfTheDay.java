package day09_IfStatements;

public class NameOfTheDay {
    public static void main(String[] args) {
        int day = 3;
        boolean monday = day ==1,
                thursday = day ==2,
                wednesday = day ==3;
        if (monday){
          //  System.out.println(" monday");
        } else if (thursday) {
            System.out.println(" thursday");
        } else if (wednesday) {
            System.out.println( " wednesday");
        }
        else {
            System.out.println(" other day");
        }

        }

    }



