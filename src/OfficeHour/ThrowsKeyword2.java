package OfficeHour;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword2 {

    public static void main(String[] args) throws InterruptedException, FileNotFoundException {

       //System.out.println(9/0); //must occur during runtime only
        Thread.sleep(3000);
        System.out.println("completed");


        new FileInputStream("");

       //you can put more than one throws exceptions
    }



}
