//erin
public class Rectangle extends Shape{

	private double length;
	private double width;
	
	public Rectangle()
	{
		super();
		this.length = 1;
		this.width = 1;
	}
	public Rectangle(String aType, double aLength, double aWidth, double aArea)
	{
		super(aType, aArea);
		setLength(aLength);
		setWidth(aWidth);
	}
	//getters
	public double getLength()
	{
		return this.length;
	}
	public double getWidth()
	{
		return this.width;
	}
	//setters
	public void setLength(double aLength)
	{
		if(aLength>0)
			this.length = aLength;
		else
			this.length = 1;
	}
	public void setWidth(double aWidth)
	{
		if(aWidth>0)
			this.width = aWidth;
		else
			this.width = 1;
	}
	public void area(double aLength, double aWidth)
	{
		setArea(aLength*aWidth);
	}
	public String toString()
	{
		return this.getType()+" Length: "+this.length+" Width: "+this.width+" Area: "+this.getArea();
	}
}
