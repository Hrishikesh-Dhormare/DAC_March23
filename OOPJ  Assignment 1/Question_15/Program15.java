public class Program15 {
    public static void main(String [] args){
       
        //a. The number of bits used to represent a integer value
        int a = 129;
        byte b = Integer.SIZE;
        System.out.println("The number of bits used to represent a int value :"+b);

        //b. The number of bytes used to represent a integer value
        byte bbytes = Integer.BYTES;
        System.out.println("The number of bytes used to represent a int value :"+bbytes);

        //d. The maximum value of integer 
        int max_value = Integer.MAX_VALUE;
        System.out.println("The maximum value of int value :"+max_value);

        //c. The minimum value of integer 
        int min_value = Integer.MIN_VALUE;
        System.out.println("The maximum value of int value :"+min_value);


    }
    
}
