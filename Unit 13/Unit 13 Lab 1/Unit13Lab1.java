/**
* This program modifies the CatchExceptions6 program to allow the user to enter two numbers multiple times.
*
* @author Krish Thawani
*/

import java.util.Scanner;
class Unit13Lab1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println();
        boolean repeat = true;

        while (repeat) {
            try {

                System.out.print("Enter two numbers to divide: ");
                divide(input.nextInt(),input.nextInt());
                repeat = false;

            } catch (DivideByZeroException e) {

                System.out.println("\n" + "Denominator cannot be zero. Please try again." + "\n");
            }
        }
    }
    public static int divide(int x, int y) throws DivideByZeroException {
        int result = 0;
        try {
            result = x/y;
        } catch (ArithmeticException e) {
            throw new DivideByZeroException(y);
        }
        return result;
    }
}