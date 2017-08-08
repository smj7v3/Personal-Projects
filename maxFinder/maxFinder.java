package smj7v3.maxFinder;

public class maxFinder {

	private double x;
	private double y;
	private double max;

	public maxFinder(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getMax() {
		return max;
	}

	public void setMax(double max) {
		this.max = max;
	}

	public double getMaxVal() {
		if (x > y) {
			max = x;
		} else {
			max = y;
		}
		return max;
	}

}
