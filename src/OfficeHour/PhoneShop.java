package OfficeHour;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("11 Pro", 1000);

        iphone.call(911);

        iphone.text(12345);

        System.out.println(iphone);

        Samsung samsung = new Samsung("galaxy Note20", 700);

        samsung.call(911);

        samsung.text(12345);

        System.out.println(samsung);


    }



}
