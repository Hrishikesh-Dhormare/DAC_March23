// Read the documentation of NumberFormatException and try to generate it in Java code

public class Program31 {
    public static void main(String[] args) {
        String str = "Hrishi";
        int a = Integer.parseInt(str); //Exception in thread "main" java.lang.NumberFormatException: For input string: "Hrishi"
        System.out.println(a);
    }
    
}

/*
 * Exception in thread "main" java.lang.NumberFormatException: For input string: "Hrishi"
 *         at java.lang.NumberFormatException.forInputString(Unknown Source)
 *         at java.lang.Integer.parseInt(Unknown Source)
 *         at java.lang.Integer.parseInt(Unknown Source)
 *         at Program31.main(Program31.java:6)
 * 
 */
