/**
* This class models a DivideByZeroException which is a subclass of Exception
*
* @author Krish Thawani
*/
public class DivideByZeroException extends Exception {
    private int denom;
    public DivideByZeroException() {

    }
    public DivideByZeroException (String s) {
        super(s);
    }
    public DivideByZeroException(int d) {
        super("div by zero");
        denom = d;
    }
    public int getDenominator() {
        return denom;
    }
}