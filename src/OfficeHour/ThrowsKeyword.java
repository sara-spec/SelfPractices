package OfficeHour;

public class ThrowsKeyword { //designed for only checked unwanted exceptions

    public void methodA() throws InterruptedException{
        Thread.sleep(3000);
    }

    public void methodB() throws InterruptedException{
        methodA(); //try catch
    }

    public static void main(String[] args) throws InterruptedException {

        ThrowsKeyword obj = new ThrowsKeyword();
        obj.methodA();

        obj.methodA();

        obj.methodA();



    }











}
