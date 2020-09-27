package OfficeHour;

import java.lang.Exception;
import java.lang.Object; //automatically done

public class ExceptionTypes {

    public static void main(String[] args) {

        //System.out.println("Cybertek".charAt(20)); //unchecked, unexpected

        //Thread.sleep(2000); //unwanted, checked, must be handle immediately

        //Selenium exceptions unchecked exceptions

        //System.out.println(9/0); //unchecked unexpected

        //Selenium use RuntimeException

        try{    //for checked use specific class
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println("catch block1 handled it");
        }catch(Exception e){
            System.out.println("catch block2 handled it");
        }

        int[] arr ={1,2,3};
        try{
            System.out.println(arr[25]);
        }catch(ClassCastException e){
            System.out.println(e.getMessage());
        }finally { //always get executed handled or not
            System.out.println("Finally completed");
        }


        //if it is not handled other codes are not checking


        try{
            System.out.println(9/0); //unchecked unexpected
        }catch(ArithmeticException e){ //RuntimeException is also handle this exception but arithmetic is more specific
            System.out.println("Arithmetic exceptions is caught "+e.getMessage());
        }

        System.out.println("test 1 completed");










    }






}
