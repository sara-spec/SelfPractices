package day51_SuperKeyword;

class B{
    public B(){
        System.out.println("Super class' default constrcutor");
    }

}

public class SuperKeyword2 extends B{

    public SuperKeyword2(){
        //super();
        System.out.println("Sub class' default constructor");
    }

    public static void main(String[] args) {

        new SuperKeyword2();

    }

}
