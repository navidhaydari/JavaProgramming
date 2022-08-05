package day35_Enscapsulation;

public class person {
    public String name;
    public int age;
    public char gender;
    public  String language;

    public static String planet;
    public static boolean isHuman;
    public static boolean hasNose;
    public static int numberOfWings;
    public static int numberOfHead;

    public person(String name, int age, char gender, String language) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.language = language;
    }

    static {
        planet = "earth";
        isHuman = true;
        hasNose = true;
        numberOfWings = 0;
        numberOfHead = 1;

    }

    public static void printPlanetName(){
        System.out.println("Planet name is: " + planet);
    }

    public void eat(String food){
        System.out.println(name + " is eating "+ food );
    }
    public void drink(String drink){
        System.out.println(name+ " is drinking "+ drink);
    }

    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet='" + planet + '\'' +   // by our self
                '}';
    }
}
