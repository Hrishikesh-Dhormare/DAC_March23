public class Program14 {
    public static void main(String [] args){

        // short instance
        
        Short instances = new Short((byte) 127);
        byte value = instances.byteValue();
        System.out.println("Short instance into byte "+value);

        
        short value1 =  instances.shortValue();                     // short instance to short. 
        System.out.println("Short instance into short "+value1);

        int value2 =  instances.intValue();                        // Short instance to int. 
        System.out.println("Short instance into int "+value2);

        long value5 = instances.longValue();                       // Short instance to long  
        System.out.println("Short instance into long :"+value5);

        float value3 = instances.floatValue();                      // Short instance to float
        System.out.println("Short instance into float :"+value3);

        double value4 = instances.doubleValue();                     // Short instance to double
        System.out.println("Bytes instance into double :"+value4);

    }
    
}
