package day51_SuperKeyword;

class C{
    public C(int a){
        System.out.println("super class' int arg constructor");
    }

}

public class SuperKeyword3 extends C{ //sub class has to call a constructor from a super class

    public SuperKeyword3(int a){
        super(100);
        System.out.println("Sub class' constrcutor with arg");
    }

    public static void main(String[] args) {
         new SuperKeyword3(100);




    }

}
