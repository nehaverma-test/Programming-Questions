package test.com;



class Vehicle
{
	private int price;
	
	public Vehicle(int price)
	{
		this.price = price;
	}
	
	class Finance
	{
		public void showDiscount(int discount)
		{
			price = (int)(price - discount*0.01);
			System.out.println(price);
			
		}
	}
	
}

public class InnerClassExample {
	
	public static void main(String[] args)
	{
		Vehicle car = new Vehicle(8877700);
		Vehicle.Finance fin  = car.new Finance();
		fin.showDiscount(9);
	}
	
	
}




