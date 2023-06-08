import java.util.Scanner;
public class Operations {
void show(String s1) {
		System.out.println(s1);
	}
	int add(int a, int b) {
		return a + b;
	}
	int sub(int a, int b) {
		return a - b;
	}
	int mul(int a, int b) {
		return a * b;
	}
	double div(double a, double b) {
		return (double) a / b;
	}
	public static void main(String[] args) {
		Operations op=new Operations();
		Scanner obj=new Scanner(System.in);
		op.show("Enter first number");
		int x = obj.nextInt();
		op.show("Enter second number");
		int y = obj.nextInt();
		op.show("Enter third number");
		int z = obj.nextInt();
		
		int r = op.add(x,y);
		int f = op.add(z,r);
		op.show("The Additions of these values are"+f);
		
		r = op.sub(x,y);
		f = op.sub(r,z);
		op.show("The subtraction of these values are"+f);
		
		r = op.mul(x,y);
		f = op.mul(z,r);
		op.show("The multiplication of these values are"+f);
		
		double m = op.div(x,y);
		double n = op.div(m,z);
		op.show("The division of these values are"+n);
		
	}
	}

