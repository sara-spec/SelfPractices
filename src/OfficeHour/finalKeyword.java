package OfficeHour;

public class finalKeyword {

    private final int c = 200; //final here cannot make changes

    public int getC() { //read only
        return c;
    }

    public void setC(int c) { //modify only thats why final compiles here
        //this.c = c;
    }

    /*
    5 private variables 3 final 2 not final
    getter 5 setter 2
     */

    //final static int z = 300;

    final private String userName = "Cybertek";
    final private String password = "Cybertek123"; //you cannot change your username and password

    //you can apply final keyword to the method and class
}

    class TestBase {

        //@BeforeMethod
        public final void setUp() { //final keyword cannot be overridden
            System.out.println("set up the driver");
            System.out.println("open the browser");
            System.out.println("url");
            System.out.println("maximize the window");
            System.out.println("implicit wait");
        }


        //@afterMethod
        public void tearDown() {
            System.out.println("if fail take screenshot");
            System.out.println("close browser");
        }
    }

    class TestCase  extends TestBase {

        // public void setUp(){   setup cannot be overridden}

        public void tearDown(){
            System.out.println("it is not final so can be overridden");
        }

        public static void main(String[] args) {

        final int a = 100; //makes immutable your data
        //a= 200;
        }
}

final class Tester{
    //name, age, gender, findBug, jobTitle
    //final class never be super class can be sub class
}

//class BA extends //Tester {
    //thats why compiles

    //final keyword cannot be super, can be sub class

    //does not inherits anything

//}



