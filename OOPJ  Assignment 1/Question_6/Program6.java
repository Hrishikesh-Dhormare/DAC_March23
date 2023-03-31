public class Program6 {
    public static void main(String [] args){
        boolean data = true;
        String s = Boolean.toString(data);
        Boolean b = Boolean.valueOf(data);
        //6.a - 
        System.out.println("boolean value into String :"+s);
       //6.b -
        System.out.println("boolean value into Boolean Instance :"+Boolean.valueOf(data));
       //6.c -
        String name = "true";
        System.out.println("String value to boolean value :"+Boolean.valueOf(name));
        //6.d -
        Boolean c = new Boolean(name);
        System.out.println("String value into Boolean Instance :"+c/*Boolean.valueOf(name)*/);
   
   
    }
    
}
