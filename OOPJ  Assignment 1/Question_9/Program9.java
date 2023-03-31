//program to write convert state of Bytes instance into byte, short, int, long, float and double 

public class Program9 {
    public static void main(String [] args){

        // byte instance
        byte b = 23;
        Byte instances = new Byte ((byte) 23);
        byte value = Byte.valueOf(instances);
        System.out.println("Byte instance into byte "+value);

        
        short value1 =  instances.shortValue();                     // Byte instance to short. 
        System.out.println("Byte instance into short "+value1);

        int value2 =  instances.intValue();                        // Byte instance to int. 
        System.out.println("Byte instance into int "+value2);

        long value5 = instances.longValue();
        System.out.println("Byte instance into long :"+value5);

        float value3 = instances.floatValue();
        System.out.println("Byte instance into float :"+value3);

        double value4 = instances.doubleValue();
        System.out.println("Byte instance into double :"+value4);

    }
    
}
