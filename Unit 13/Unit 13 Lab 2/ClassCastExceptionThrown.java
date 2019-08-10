public class ClassCastExceptionThrown {
    public static void main(String[] args) {
        
        System.out.println();
        Object i = (Integer)10;
        String s = (String)i;
        System.out.println("\n" + "Main Method Completed" + "\n");

    }
}