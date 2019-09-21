package Problems;

import java.util.*;

public class KyleP2 {
	
    public static void main(String[] args) {
    	
        Scanner console = new Scanner(System.in);
        
        double bmi1 = user(console);
        
        report(bmi1);
    }

    public static double user(Scanner console) {
    	
        System.out.print("What is your weight in pounds? ");
        
        double weight = console.nextDouble();
        
        System.out.print("What is your height in inches? ");
        
        double height = console.nextDouble();

        return bmi(height, weight);
    }

    public static double bmi(double height, double weight) {
    	
        return (weight * 703 / height / height);
    }

    public static void report(double bmi) {
    	
        System.out.printf("Your BMI = %f\n",bmi);
        
        if (bmi < 18.5) {
        	
            System.out.println("That is considered underweight");
            
        } else if (bmi < 25) {
        	
            System.out.println("That is considered normal");
            
        } else if (bmi < 30) {
        	
            System.out.println("That is considered overweight");
            
        } else {
        	
            System.out.println("That is considered obese");
        }
    }
}