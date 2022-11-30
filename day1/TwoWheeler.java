package week1.day1;

public class TwoWheeler 
{
	int noOfWheels =2;
	short noOfMirrors =1;
	long chassisNumber =9876543210123L;
	boolean isPunctured =true;
	String bikename = "DUKE";
	double runningKM = 23.87;
public static void main(String[] args)
{
	TwoWheeler bike = new TwoWheeler();
	System.out.println("no of wheels=" +bike.noOfWheels);
	System.out.println("no of mirror=" +bike.noOfMirrors);
	System.out.println("chassis number=" +bike.chassisNumber);
	System.out.println("Tyre is punctured="+bike.isPunctured);
	System.out.println("Bike name=" +bike.bikename);
	System.out.println("runningKm=" +bike.runningKM);



}

}

