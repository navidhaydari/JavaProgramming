package day19_LoopPractices;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aabbcdfaabb";
        String result = ""; // cdf we find this.

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0; //  represents the frequency of the ch.

            for (int i = 0; i <str.length() ; i++) { // compares the character
                char each = str.charAt(i);
                // System.out.print(each); aabbcdfaabb

                if (ch == each) {
                    count++;
                }

            }
            if (count!=1){
                continue;
            }

            //if (count==1){ // if the frequency one then its unique
                result+=ch;


            }
        System.out.println(result);

        }



    }

