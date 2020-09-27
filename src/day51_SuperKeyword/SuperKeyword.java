package day51_SuperKeyword;

class Test{

    int a;

    public void method(){
        System.out.println("Hello");
    }

    public void m(){
        this.method(); //remember constructor call
        //super.method(); this is super class, does not have super keyword
    }
}

public class SuperKeyword extends Test{

    public void print1(){
        System.out.println(a); //superkeyword' a ==> 300
    }
    public void print2(){
        System.out.println(super.a); //Test' a ==> 200
    }
    public void method2(){
        super.method();
        System.out.println("Hola");
    }
    public void method3(){
        this.method2();
        super.method();
    }

    public static void main(String[] args) {
        Test obj1 = new Test();
        obj1.a = 300;

        SuperKeyword obj2 = new SuperKeyword();
        obj2.a = 200;

        obj2.print1(); //300 //I have a ? here
        obj2.print2(); //200

        obj2.method2(); //Hello, Hola
        obj2.method3(); // .Hello



    }


}
