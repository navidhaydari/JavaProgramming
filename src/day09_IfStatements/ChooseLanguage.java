package day09_IfStatements;

public class ChooseLanguage {
    public static void main(String[] args) {
        /*
         Create a class called ChooseLanguage, Given an integer variable named
selection that has a number between 1~5, Write a program that can
select the language based on the number that's given in selection and
prints the following message:
for 1: Hello, thank for your call
for 2: Hola, gracias para llamar
for 3: Merhaba, aradiginiz icin tesekkurler
for 4: Privet, spasibo za vash zvonok
for 5: Merci ,pour votre appel
         */
        int num=6;
       String lang =  (num>=1 && num<=5)? (num==1)? "Hello, thanks for your call" :(num==2)? "Hola, gracias para llamar"
                :(num==3)? "Merhaba, aradiginiz icin tesekkurler" :(num==4)?"Privet, spasibo za vash zvonok"
                : "Merci ,pour votre appel" : "invalid key";
        System.out.println("lang = " + lang);
    }
}
