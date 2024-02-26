package newprograms;

public class Assignment94 {
	double PI;
	int r=9;

	public static void main(String[] args) {
		double pi = Math.PI;

        for (int i = 0; i < 10; i++) 
        {
            double radius = Math.random();
            double area = pi * radius * radius;

            System.out.println("Radius: " + radius);
            System.out.println("Area: " + area);
        }
	}

}
