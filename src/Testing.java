class Vehicle 
{
	int maxSpeed = 120;
	
	}
class Car extends Vehicle
{
	int maxSpeed = 180;
	void display()
	{
	System.out.println("maxspeed is :"+ super.maxSpeed);
	}
}
public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car small = new Car();
		small.display();

	}

}
