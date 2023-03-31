public class Program25 {
    public static void main(String [] args){

        // Float instance
        
        Float instances = new Float (31.45f);
        byte value = instances.byteValue();
        System.out.println("Float instance into byte "+value);

        
        short value1 =  instances.shortValue();                     // Float instance to short. 
        System.out.println("Float instance into short "+value1);

        int value2 =  instances.intValue();                        // Float instance to int. 
        System.out.println("Float instance into int "+value2);

        long value3 = instances.longValue();                      // Float instance to long.
        System.out.println("Float instance into long :"+value3);

        float value4 = instances.floatValue();                     // Float instance to float.
        System.out.println("Float instance into float :"+value4);

        double value5 = instances.doubleValue();                   // Float instance to double.
        System.out.println("Float instance into double :"+value5);

    }
    
}
