package praktikum5;

public class Paint {
	private Double coverage;
	
	public Paint(Double c) {
		coverage = c;
	}
	
	public double amount(Shape s) {
		System.out.println("Computing amount for " + s);
		return s.area() /  coverage;
	}
}
