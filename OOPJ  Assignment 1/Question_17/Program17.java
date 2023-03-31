public class Program17 {
    public static void main(String [] args){

        // Integer instance
        //int b = 032023;
        Integer instances = new Integer (32023);
        byte value = instances.byteValue();
        System.out.println("Integer instance into byte "+value);

        
        short value1 =  instances.shortValue();                     // Integer instance to short. 
        System.out.println("Integer instance into short "+value1);

        int value2 =  instances.intValue();                        // Integer instance to int. 
        System.out.println("Integer instance into int "+value2);

        long value5 = instances.longValue();                      // Integer instance to long.
        System.out.println("Integer instance into long :"+value5);

        float value3 = instances.floatValue();                     // Integer instance to float.
        System.out.println("Integer instance into float :"+value3);

        double value4 = instances.doubleValue();                   // Integer instance to double.
        System.out.println("Integer instance into double :"+value4);

    }
    
}
