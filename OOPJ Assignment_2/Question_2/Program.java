import java.util.Scanner;
class BMI {
    private double height;
    private double weight;
    private double bmi;
    BMI( ) {
        this.height = 0.0;
        this.weight = 0.0;
        this.bmi = 0.0;
    }
    public void setHeight(double height ) {
        this.height = height;
    }
    public void setWeight(double weight ) {
        this.weight = weight;
    }
    public double getHeight( ) {
        return this.height;
    }
    public double getWeight( ) {
        return this.weight; 
    }
    public double calculateBMI( ) {
        this.bmi = this.weight / (this.height * this.height);
        return this.bmi;
    }
}

class Program {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        BMI data = new BMI();
        System.out.println("Enter the Height  in meters :");
        double height = sc.nextDouble();
        System.out.println("Enter the Weight in kilogram :");
        double weight = sc.nextDouble();
        data.setHeight(height);
        data.setWeight(weight);
        data.getHeight();
        data.getWeight();
        data.calculateBMI();
        System.out.println("BMI = "+data.calculateBMI());
    }
    
}
