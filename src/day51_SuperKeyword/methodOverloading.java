package day51_SuperKeyword;

class A{

    protected void method(){
        System.out.println("protected");
    }

}

public class methodOverloading extends A {

    @Override
    public void method(){
        System.out.println("public");
    }

   /* @Override
    public int method(){
        return 10;
    }*/ //no override here

    @Override
    public String toString(){
        return "example";
    }


}
