import java.util.Scanner;
public class Temperature {
	double f;
	double c;
	Scanner s = new Scanner(System.in);
	public void initTemp() {
		System.out.println("Enter Temperature in farenheit :: ");
		f=s.nextDouble();	
	}
	public void calc()
	{
		c=(f-32)/1.8;
		System.out.println("Temperature in Celsius = "+c);	
	}
	public static void main(String[] args) {
		Temperature t = new Temperature();
		t.initTemp();
		t.calc();	
	}
}
