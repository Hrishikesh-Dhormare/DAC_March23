public class Program28 {
    public static void main(String [] args){

        
        double a = 31.15134d;
        System.out.println("The double value into String :"+Double.toString(a));
        
        
        Double  b = Double.valueOf(a);  //Float Instance 
        System.out.println("The double value into Double Instance :"+ b);
    
        String s =new String("87125761");    // String Instance 
        Double c = Double.valueOf(s);          // String Instance to Long instance
        System.out.println("String instance to Double instance :"+c );

        long l = Double.doubleToLongBits(a);
        System.out.println("double value into DoubleToLongBits :"+ l);
        }
 
}
