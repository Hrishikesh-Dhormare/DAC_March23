public class Program24 {
    public static void main(String [] args){

        
        float a = 31.15f;
        System.out.println("The float value into String :"+Float.toString(a));
        
        
        Float  b = Float.valueOf(a);  //Float Instance 
        System.out.println("The float value into Float Instance :"+ b);
    
        String s =new String("5761");    // String Instance 
        Float c = Float.valueOf(s);          // String Instance to Long instance
        System.out.println("String instance to Float instance :"+c );
        }
    
}
