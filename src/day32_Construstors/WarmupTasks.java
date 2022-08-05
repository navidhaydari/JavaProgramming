package day32_Construstors;

public class WarmupTasks {
    public double width,length,unitPrice;
    public  boolean isPersian;

    public WarmupTasks(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }
    public double calcPrice(){
        double totalPrice =  width*length*unitPrice;

        if (isPersian){
            totalPrice+=200;
        }
        return totalPrice;
    }

    public String toString() {
        return "WarmupTasks{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice= $" + unitPrice +
                ", isPersian=" + isPersian +
                ", toral price= $" + calcPrice() +
                '}';
    }
}


