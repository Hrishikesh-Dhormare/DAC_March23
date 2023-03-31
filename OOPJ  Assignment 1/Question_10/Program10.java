// program to perform operation on char type to get below output

public class Program10 {
    public static void main(String [] args){
       
        //a. The number of bits used to represent a byte value
        char a = 'A';
        byte bbits = Character.SIZE;
        System.out.println("The number of bits used to represent a char value :"+bbits);

        //b. The number of bytes used to represent a byte value
        byte bbytes = Byte.BYTES;
        System.out.println("The number of bytes used to represent a char value :"+bbytes);

        //d. The maximum value of char 
        int max_value = Character.MAX_VALUE;
        System.out.println("The maximum value of char :"+max_value);

        //c. The minimum value of char 
        byte min_value = Character.MIN_VALUE;
        System.out.println("The maximum value of char  :"+min_value);


    }
}
