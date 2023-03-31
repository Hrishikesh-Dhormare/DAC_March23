public class Program18 {
    public static void main(String [] args){
       
        int x =156;
        int y =89;
        //Integer a = new Integer(56,89);
        int max = Integer.compare(x,y);
        System.out.println(max);
        /* if (x == y) then return value is o
            if (x < y) then return value is -1 
            if (x > y) then return value is +1 */

        int max_value = Integer.max(x,y);
        System.out.println("Maximum  value is of :"+max_value);    

        int min_value = Integer.min(x,y);
        System.out.println("Maximum  value is of :"+min_value); 
        
        int sum = Integer.sum(x,y);
        System.out.println("Sum :"+sum);    

    }
    
}
