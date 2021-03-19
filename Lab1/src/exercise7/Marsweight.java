package exercise7;
import java.util.Scanner;

public class Marsweight {
	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		double weight = getEarthWeight();
		double realWeight = computeRealWeight(weight);
		System.out.print("Your weight would be " + realWeight + " kg on Mars.");
	}
	
	public static double getEarthWeight()
	{
        System.out.println("Please enter your current Earth weight(kg): ");
        return keyboard.nextDouble();
    }
	
	public static double computeRealWeight(double weight)
	{
		double realWeight = 0;
		realWeight = (weight * 0.38);
		
		return realWeight;
	}
}
