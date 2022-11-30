package week1.day1;

public class Car
{
	public void pressureBreak() 
	{
		System.out.println("Stop the Car");
	}
	public void applyGear()
	{
		System.out.println("Apply the Gear");
	}
	public void switchOnAc() 
	{
		System.out.println("On the AC");
	}
    public void riseAcclerate()
    {
    	System.out.println("Apply the acceletrate");
    }
public static void main(String[] args) 
{
	Car done =new Car();
	done.pressureBreak();
	done.applyGear();
	done.switchOnAc();
	done.riseAcclerate();
}
}

