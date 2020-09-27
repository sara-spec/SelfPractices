package FinalKeyword;

public class BreakTimeException extends RuntimeException { //custom unhecked exception

    public BreakTimeException() {
        super("It is time for break");
        System.out.println("15 minutes break");
    }

    public BreakTimeException(String str) {
        super(str);
        System.out.println("15 minutes break");
    }

}

class Test{

    public static void main(String[] args) {

        //throw new RuntimeException("runtime");

        //throw new BreakTimeException("abreak");

       // System.out.println("completed");

        throw new BreakTimeException("break");








    }







}










