package bridgelabz;

public class Line {
	public static void main(String[] args)
	{
		System.out.println("welcome to line computation program");
		int x1 = 10, x2 = 20, y1 = 30, y2 = 40;
		int a1 = 50,a2 = 60, b1 = 70, b2 = 80;
		int vx = x2 - x1 ;int va,vb;
		int vy = y2 - y1;
		va = a2 - a1;
		vb = b2 - b1;
		double a = Math.pow(vx,2);
		double b = Math.pow(vy, 2);
		double c = Math.pow(va, 2);
		double d = Math.pow(vb, 2);	
		double length1 = Math.sqrt(a+b);
		double length2 = Math.sqrt(c+d);
		System.out.println("length of first line :" +length1);
		System.out.println("length of second line :" +length2);
		if ( length1 == length2 )
		{
			System.out.println("lenths are equal");
		}
		else if(length1 > length2)
		{
			System.out.println("length1"+length1+ "is greater than"+length2);
		}
		else
			System.out.println("length1"+length1+"is smaller than"+length2);
	}
}
