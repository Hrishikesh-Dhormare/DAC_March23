public class Program19 {
    public static void main(String [] args){
       
        //a. The number of bits used to represent a long value
        long a = 129000129l;
        byte b = Long.SIZE;
        System.out.println("The number of bits used to represent a long value :"+b);

        //b. The number of bytes used to represent a integer value
        byte bbytes = Long.BYTES;
        System.out.println("The number of bytes used to represent a long value :"+bbytes);

        //d. The maximum value of integer 
        long max_value = Long.MAX_VALUE;
        System.out.println("The maximum value of long value :"+max_value);

        //c. The minimum value of integer 
        long min_value = Long.MIN_VALUE;
        System.out.println("The maximum value of long value :"+min_value);


    }
    
}
