package exercise8;
import exercise7.Marsweight;

public class WeightList {
	public static void main(String[] args) {
		Marsweight mw = new Marsweight();
		mw.getEarthWeight();
		double weight = 0;
		mw.computeRealWeight(weight);
	}
	
	public void getEarthWeight() {
		System.out.print("The weights on Earth are: ");
	}
	public void computeRealWeight()
	{
		System.out.print("The weights on Mars are: ");
	}
}
