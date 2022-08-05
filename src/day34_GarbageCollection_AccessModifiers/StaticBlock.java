package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("main method"); // second run
    }
    static {
        System.out.println("Static Block"); // first run , one time run
    }
}
