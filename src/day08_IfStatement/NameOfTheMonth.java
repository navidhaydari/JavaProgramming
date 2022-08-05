package day08_IfStatement;

public class NameOfTheMonth {
    public static void main(String[] args) {
        int month = 5;
        String january = "enero",
                february = "febrero",
                march = "marz",
                april = "abril",
                may= "mayo",
                june = "junio",
                july = "julio",
                august = "agusto",
                september = "septiembe",
                october = "octubre",
                november = "noviembre",
                december = "deciembre";

        boolean a1 = month == 1;
        boolean a2 = month ==2,
                a3 = month ==3,
                a4= month ==4,
                a5= month==5,
                a6=month==6,
                a7=month==7,
                a8=month==8,
                a9=month==9,
                a10=month==10,
                a11=month==11,
                a12=month==12;
        if (a1) {
            System.out.println(january);
        }
        if (a2){
            System.out.println(february);
        }
        if (a3){
            System.out.println(march);
        }
        if (!a1 && !a2 &&!a3){
            System.out.println("otherMonths");

        }

    }
}
