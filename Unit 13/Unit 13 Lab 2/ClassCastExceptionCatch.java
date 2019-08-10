public class ClassCastExceptionCatch {
    public static void main(String[] args) {
        
        try {
            System.out.println();
            Object i = (Integer)10;
            String s = (String)i;
        } catch (ClassCastException e) {
            System.out.println("Exception Caught");
            e.printStackTrace();
        }
        System.out.println("\n" + "Main Method Completed" + "\n");

    }
}