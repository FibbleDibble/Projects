public class WeightCalc
    //this is a program that calculates an objects weight in pounds on earth to weight in pounds on other planets
{
	public static void main (String[] args)
	{
		int x = Integer.parseInt (args[0]);
		
		System.out.println("Mars:"+x*0.38);
		System.out.println("Jupiter:"+x*2.36);
		System.out.println("Venus:"+x*0.91);
		System.out.println("Saturn:"+x*1.09);
		
		double y = Double.parseDouble (args[0]);
	}
}