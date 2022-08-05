package day33_Statics;

public class IphoneObjects {
    public static void main(String[] args) {
        System.out.println( Iphone.OS);
        Iphone iphone1 = new Iphone();
        iphone1.color = "black";
        System.out.println(iphone1.color);
    }
}
