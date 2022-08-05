package day20_Arrays;

import java.util.Arrays;

public class ReverseClass {
    public static void main(String[] args) {
        String[] classmates = {"navid" , "basit", "bayes", "wakil","khalid"};
        for (String each : classmates){
            String reversed = "";
            for (int i = each.length()-1; i>=0 ; i--) {
            reversed += each.charAt(i);

            }
            System.out.println(reversed);
        }


        }




        }



/*
2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */