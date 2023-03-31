public class Program11 {
    public static void main(String[] args){
        
        int code_point= args[0].codePointAt(0);
        char ch= args[0].charAt(0);
        //boolean flag=character.isDigit(ch);
        if(Character.isDigit(ch)){
            System.out.println("The entered character is a digit : "+ch);
            System.out.println("Code point is : "+code_point);
        }
        else if(Character.isLowerCase(ch)){
             System.out.println("The entered character is a digit : "+Character.toUpperCase(ch));
             System.out.println("Code point is : "+code_point);
        }
        else{
            System.out.println("The entered character is a digit : "+Character.toLowerCase(ch));
             System.out.println("Code point is : "+code_point);
        }
    }

    
}
