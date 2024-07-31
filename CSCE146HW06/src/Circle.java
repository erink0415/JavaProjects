//erin
public class Circle extends Shape{
	private double radius;
	
	public Circle()
	{
		super();
		this.radius = 1;
	}
	public Circle(String aType,double aRadius, double aArea)
	{
		super(aType, aArea);
		this.setRadius(aRadius);
	}
	//getters
	public double getRadius()
	{
		return this.radius;
	}
	//setters
	public void setRadius(double aRadius)
	{
		if(aRadius > 0)
			this.radius = aRadius;
		else
			this.radius = 0;
	}
	public void area(double aRadius)
	{
		setArea(aRadius*aRadius*Math.PI);
	}
	public String toString()
	{
		return this.getType()+" Radius: "+this.radius+" Area: "+getArea();
	}
}
