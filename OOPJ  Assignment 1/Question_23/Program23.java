public class Program23 {
    public static void main(String [] args){
       
        
        float a = 3.14f;
        byte b = Float.SIZE;
        System.out.println("The number of bits used to represent a float value :"+b);

       
        byte bbytes = Float.BYTES;
        System.out.println("The number of bytes used to represent a float value :"+bbytes);

        
        float max_value = Float.MAX_VALUE;
        System.out.println("The maximum value of float value :"+max_value);

        
        float min_value = Float.MIN_VALUE;
        System.out.println("The maximum value of float value :"+min_value);


    }
    
}
