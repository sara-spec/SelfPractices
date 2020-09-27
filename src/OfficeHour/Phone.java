package OfficeHour;

public class Phone {

    /*
    Phone: brand, model, price, madeIn, call(), text(), toString()
     */
    public static String brand;
    public String model;
    public double price;
    public static String madeIn;

    public Phone(String model, double price){
        this.model = model;
        this.price = price;
    }
    public void call(long phoneNumber){ //action call
        System.out.println("Phone is calling: "+phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println("Phone is texting to: "+phoneNumber);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
