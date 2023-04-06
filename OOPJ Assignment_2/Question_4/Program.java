import java.util.Scanner;
class ElectricityBill {
    private String customerName;
    private double unitsConsumed;
    private double billAmount;
    ElectricityBill( ) {
        this.customerName = null;
        this.unitsConsumed = 0.0;
        this.billAmount = 0.0;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setUnitConsumed(double unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }
    public String getCustomerName( ){
        return this.customerName; 
    }
    public double getunitsConsumed( ){
        return this.unitsConsumed; 
    }
    void calculateBillAmount( ) {
        if(unitsConsumed<=100)   System.out.println("Bill Amount = "+(unitsConsumed * 5));
        else if(unitsConsumed<=200) System.out.println("Bill Amount = "+(unitsConsumed * 7));
        else System.out.println("Bill Amount = "+(unitsConsumed * 10));
    }
}

class Program {
    public static void main(String[] args) {
        
        ElectricityBill bill =   new ElectricityBill(); 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the constumer Name : ");
        String name = sc.nextLine();
        System.out.println("Enter the unit consume : ");
        int unit = sc.nextInt();
        bill.setCustomerName(name);
        bill.setUnitConsumed(unit);
        System.out.println("Constumer Name : "+bill.getCustomerName());
        System.out.println("Unit consumed : "+bill.getunitsConsumed());
        bill.calculateBillAmount();
    }
    
}
