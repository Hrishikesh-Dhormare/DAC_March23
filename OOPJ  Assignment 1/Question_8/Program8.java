//Write a program to convert 

public class Program8 {
    public static void main(String [] args){

    // a.  byte value to String
    byte a =Byte.SIZE;     // byte value (type)
    System.out.println("The byte value into String :"+ Byte.toString(a));
    
    // b. byte value to Byte Instance 
    byte value = 56;
    Byte  b = Byte.valueOf(value);  //Byte Instance 
    System.out.println("The byte value into Byte Instance :"+ b);

    //c. String instance into Byte instance
    String s =new String("123");
    Byte c = Byte.valueOf(s);
    System.out.println("String instance to Byte instance :"+c );
    }
    
}
