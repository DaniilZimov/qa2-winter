package basics;

import org.junit.Test;

public class MyFirstJavaClass {
    public int sumTwoDigits(int a, int b) {
 //       int someDigit = null;
  //      Integer someDigit = "null"
        int c = a + b;
        return c;
    }

    public int minus(int a, int b) {
        int c = a - b;
        return a - b;
    }

    @Test
    private void test() {
        int a = sumTwoDigits( 7, 13);
        int b = sumTwoDigits( 45,  132);
        int c = minus( 100,  55);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }


    //One string comment

}