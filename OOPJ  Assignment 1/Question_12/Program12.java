public class Program12 {
    public static void main(String [] args){

       //a. The number of bits used to represent a short value
       short a = 25;
       byte bbits = Short.SIZE;
       System.out.println("The number of bits used to represent a short value :"+bbits);
    
        //b. The number of bytes used to represent short value
        short bbytes = Short.BYTES;
        System.out.println("The number of bytes used to represent a short value :"+bbytes);

        //d. The maximum value of char 
        int max_value = Short.MAX_VALUE;
        System.out.println("The maximum value of short value :"+max_value);

        //c. The minimum value of char 
        int min_value = Short.MIN_VALUE;
        System.out.println("The maximum value of short value :"+min_value);

    
    
    }
    
}
