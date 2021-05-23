package bridgelabz;

public class Line {
	public static void main(String[] args)
	{
		System.out.println("welcome to line computation program");
		int x1 = 10, x2 = 20, y1 = 30, y2 = 40;
		int vx = x2 - x1 ;
		int vy = y2 - y1;
		double a = Math.pow(vx,2);
		double b = Math.pow(vy, 2);
		double length = Math.sqrt(a+b);
		System.out.println("length of line :" +length);
	}

}
