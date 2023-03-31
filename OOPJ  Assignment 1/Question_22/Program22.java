public class Program22 {
    public static void main(String [] args){
       
       long x = 2030405060l;
       long y = 2030405061l;

        long max_value = Long.max(x,y);
        System.out.println("Maximum  value is of :"+max_value);    

        long min_value = Long.min(x,y);
        System.out.println("Maximum  value is of :"+min_value); 
        
        long sum = Long.sum(x,y);
        System.out.println("Sum :"+sum);    

    }
    
}
