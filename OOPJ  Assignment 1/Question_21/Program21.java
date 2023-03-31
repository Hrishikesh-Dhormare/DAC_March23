public class Program21 {
    public static void main(String [] args){

        // Long instance
        
        Long instances = new Long (32023321215l);
        byte value = instances.byteValue();
        System.out.println("Long instance into byte "+value);

        
        short value1 =  instances.shortValue();                     // Long instance to short. 
        System.out.println("Long instance into short "+value1);

        int value2 =  instances.intValue();                        // Long instance to int. 
        System.out.println("Long instance into int "+value2);

        long value3 = instances.longValue();                      // Long instance to long.
        System.out.println("Long instance into long :"+value3);

        float value4 = instances.floatValue();                     // Long instance to float.
        System.out.println("Long instance into float :"+value4);

        double value5 = instances.doubleValue();                   // Long instance to double.
        System.out.println("Long instance into double :"+value5);

    }
    
}
