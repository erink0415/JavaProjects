/*
 * Erin Kelly
 */
public class Rectangle {
//attributes
	private double length;
	private double width;
	private double area;
	
	
//constructor
	public Rectangle(double l, double w){
		this.length = l;
		this.width = w;
	}
	
//setters
	public void setLength(double length) {
		this.length = length;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
//getters
	public double getLength() {
		return this.length;
	}
	public double getWidth() {
		return this.width;
	}
	
	public double getArea() {
		return (this.length)*(this.width);
	}
	
}
