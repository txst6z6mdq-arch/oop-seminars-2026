package projekti;

import java.util.Scanner;

public class PointInCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);

double x;
double y;
System.out.print("Vendos vleren e koordinates x dhe y: ");
x = input.nextDoube();
y = input.nextDoube();

if(x * x + y * y <= 100) {
	System.out.println("Koordinatat jane brenda e rrethit.");
}
else {
	System.out.println("Koordinatat jane jasht rrethit.");
}
input.close();
	}

}
