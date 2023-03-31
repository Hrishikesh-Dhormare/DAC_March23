public class Program20 {
    public static void main(String [] args){

        // a.  long value to String
        long a = 1030402050l;
           // long value (type)
        System.out.println("The long value into String :"+Long.toString(a));
        
        // b. long value to Long Instance 
        Long  b = Long.valueOf(a);  //Long Instance 
        System.out.println("The long value into Long Instance :"+ b);
    
        //c. String instance into Long instance
        String s =new String("123");    // String Instance 
        Long c = Long.valueOf(s);          // String Instance to Long instance
        System.out.println("String instance to Long instance :"+c );
        }

    
}
