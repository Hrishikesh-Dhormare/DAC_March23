class Program33 {
    public static void main(String [] args){

        String str = args[ 0 ];
        int a =Integer.parseInt(str);
        System.out.println("Command line to int :"+a);

        String str1 = args[ 1 ];
        float b = Float.parseFloat(str1);
        System.out.println("Command line to float :"+b); 
    
        String str2 = args[ 2 ];
        double c = Double.parseDouble(str2);
        System.out.println("Command line to double :"+c);
    }
    
}
