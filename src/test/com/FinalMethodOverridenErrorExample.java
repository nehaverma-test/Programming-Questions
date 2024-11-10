package test.com;


class Car
{
	final public void speed()
	{
		System.out.println("Car's speed is ");
	}
}

class Honda extends Car
{
	
	public void speed() // Compilation error shown at speed method defined in Parent class
	{
		
	}
	
}

public class FinalMethodOverridenErrorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
