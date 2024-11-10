package test.com;


class Car
{
	final int maxSpeed; // Final variable which is blank or not initialized
	
	public Car(int maxSpeed)
	{
		this.maxSpeed = maxSpeed;
	}
	
	public void show()
	{
		System.out.println("Max speed is => "+maxSpeed);
	}
	
}

public class BlankFinalVariable {

	public static void main(String[] args) {


		Car honda = new Car(50);
		honda.show();
	}

}
