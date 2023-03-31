public class Program13 {
    public static void main(String [] args){

        // a.  short value to String
        Short a = 129;     // byte value (type)
        System.out.println("The short value into String :"+ Short.toString(a));
        
        // b. short value to Byte Instance 
        short value = 56;
        Short  b = Short.valueOf(value);  //Byte Instance 
        System.out.println("The short value into Short Instance :"+ b);
    
        //c. String instance into Short instance
        String s =new String("123");
        Short c = Short.valueOf(s);
        System.out.println("String instance to Short instance :"+c );
        }
        
    
}
