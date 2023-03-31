public class Program29 {
    public static void main(String [] args){

        
        Double instances = new Double (32.15236d);
        byte value = instances.byteValue();
        System.out.println("Double instance into byte "+value);

        
        short value1 =  instances.shortValue();                     // Float instance to short. 
        System.out.println("Double instance into short "+value1);

        int value2 =  instances.intValue();                        // Float instance to int. 
        System.out.println("Double instance into int "+value2);

        long value3 = instances.longValue();                      // Float instance to long.
        System.out.println("Double instance into long :"+value3);

        float value4 = instances.floatValue();                     // Float instance to float.
        System.out.println("Double instance into float :"+value4);

        double value5 = instances.doubleValue();                   // Float instance to double.
        System.out.println("Double instance into double :"+value5);

    }
}
