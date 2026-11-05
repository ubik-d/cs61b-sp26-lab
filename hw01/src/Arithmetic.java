import edu.princeton.cs.algs4.StdIn;

import java.util.ArrayList;
import java.util.List;

/** Simple Arithmetic Class.
 * @author Josh Hug
 * */
public class Arithmetic {

    /** Computes product of two ints.
     * @param a Value 1
     * @param b Value 2
     * @return Product of a and b
     * */
    public static int product(int a, int b) {
        return a * b;
    }

    /** Computes sum of two ints (incorrectly).
     * @param a Value 1
     * @param b Value 2
     * @return Sum of a and b
     * */
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>();
        IO.println(a.size());
        List<Integer> b=a;
        b.add(1);



        IO.println(a.size());
        System.out.println("Give me a number! (no decimals, please)");
        int num1 = StdIn.readInt();
        System.out.println("Give me another number! (still no decimals)");
        int num2 = StdIn.readInt();

        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product(num1, num2));
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum(num1, num2));
    }
}
