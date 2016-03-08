package Quiz3;

public class Triangle extends GeometricObject {
	private double s1;
	private double s2;
	private double s3;

	Triangle() {
		s1 = 1.0;
		s2 = 1.0;
		s3 = 1.0;
	}

	Triangle(double s1, double s2, double s3) {
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}

	public double getS1() {
		return s1;
	}

	public void setS1(double s1) {
		this.s1 = s1;
	}

	public double getS2() {
		return s2;
	}

	public void setS2(double s2) {
		this.s2 = s2;
	}

	public double getS3() {
		return s3;
	}

	public void setS3(double s3) {
		this.s3 = s3;
	}

	public double getPerimeter() {
		return this.s1 + this.s2 + this.s3;
	}

	public double getArea() {
		double per = this.getPerimeter() / 2.0;
		return Math.pow(per * (per - this.s1) * (per - this.s2) * (per - this.s3), 0.5);
	}

	public String toString() {
		return "The Triangle Class has 3 length of Side (s1,s2,s3) inputs to evaluate the Area and Perimeter.";
	}
}
