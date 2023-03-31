public class Program16 {
    public static void main(String [] args){

        // a.  int value to String
        int a = 2050;     // byte value (type)
        System.out.println("The int value into String :"+ Integer.toString(a));
        
        // b. int value to Integer Instance 
        Integer  b = Integer.valueOf(a);  //Byte Instance 
        System.out.println("The int value into Integer Instance :"+ b);
    
        //c. String instance into Integer instance
        String s =new String("123");    // String Instance 
        Integer c = Integer.valueOf(s);          // String Instance to Integer instance
        System.out.println("String instance to Integer instance :"+c );
        }
    
}
