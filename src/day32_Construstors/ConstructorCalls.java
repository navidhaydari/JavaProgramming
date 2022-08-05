package day32_Construstors;

public class ConstructorCalls {
    public ConstructorCalls(){
        System.out.println("Default Constructors");

    }
    public ConstructorCalls(int a){
        this();
        System.out.println("Constructor with int argument");

    }
}
