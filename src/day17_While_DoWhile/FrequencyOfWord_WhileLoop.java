package day17_While_DoWhile;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {


        String str = " Java Java Python Python";
        int freqJava = 0;
        int freqPython=0;
        while (str.contains("Java")){
            str = str.replaceFirst("Java","");
            freqJava++;

        }
        while (str.contains("Java")){
            str = str.replaceFirst("Java","");
            freqJava++;
        }
        while (str.contains("Python")) {
            str = str.replaceFirst("Python", "");
            freqPython++;
        }
        while (str.contains("Java")) {
            str = str.replaceFirst("Python", "");
            freqPython++;
        }

        System.out.println("java"+ freqJava + " python" + freqPython);
        System.out.println("---------------------------------------");

        String s1 = "cat cat cat cat dog dog dog dog cat cat";
        int frequencyCat = 0;
        int frequencyDog=0;

        while (s1.contains("cat")){
            s1=s1.replaceFirst("cat","");
            frequencyCat++;


        }
        while (s1.contains("cat")) {
            s1 = s1.replaceFirst("cat", "");
            frequencyCat++;
        }
        while (s1.contains("cat")) {
            s1 = s1.replaceFirst("cat", "");
            frequencyCat++;
        }
        while (s1.contains("cat")) {
            s1 = s1.replaceFirst("cat", "");
            frequencyCat++;
        }
        while (s1.contains("cat")) {
            s1 = s1.replaceFirst("cat", "");
            frequencyCat++;
        }
        while (s1.contains("cat")) {
            s1 = s1.replaceFirst("cat", "");
            frequencyCat++;
        }
        while (s1.contains("dog")) {
            s1 = s1.replaceFirst("dog", "");
            frequencyDog++;
        }
        while (s1.contains("dog")) {
            s1 = s1.replaceFirst("dog", "");
            frequencyDog++;
        }
        while (s1.contains("dog")) {
            s1 = s1.replaceFirst("dog", "");
            frequencyDog++;
        }
        while (s1.contains("dog")) {
            s1 = s1.replaceFirst("dog", "");
            frequencyDog++;
        }

        System.out.println("cat: "+frequencyCat + " dog: "+ frequencyDog);
        System.out.println("---------------------------------");



    }
}