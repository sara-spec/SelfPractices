package OfficeHour;

public class Iphone extends Phone{

   public Iphone(String model, double price) {
               super(model, price); //mandatory calling from super class
              /* brand = "iphone";
               madeIn = "China"; you can call in the constructor static but not recommended*/
   }

   static{
       brand = "iPhone";
       madeIn = "USA";
   }

   @Override
   public void call(long phoneNumber){
       System.out.println("Iphone "+model+" is calling "+phoneNumber);
   }

   @Override
   public void text(long phoneNumber){
       System.out.println("Iphone "+model+" is texting "+phoneNumber);
   }














}
