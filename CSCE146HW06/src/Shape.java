//erin kelly
public class Shape implements Comparable<Shape>{

	private String type;
	private double area;
	
	//constructors
	public Shape()
	{
		this.type = "Circle";
		this.area = 1.0;
	}
	public Shape(String aType, double aArea)
	{
		this.setType(aType);
		this.setArea(aArea);
	}
	
	//getters
	public String getType()
	{
		return this.type;
	}
	public double getArea()
	{
		return this.area;
	}
	
	//setters
	public void setType(String aType)
	{
		if(aType.equalsIgnoreCase("circle") ||
			aType.equalsIgnoreCase("rectangle") ||
			aType.equalsIgnoreCase("right triangle"))
			this.type = aType;
		else this.type = "Circle";
	}
	public void setArea(double aArea)
	{
		if(aArea > 0)
			this.area = aArea;
		else
			this.area = 1.0;
	}
	public String toString()
	{
		return this.type;
	}
	public int compareTo(Shape aShape)
	{
		if(aShape == null)
			return 11;
		else if(this.area>aShape.getArea())
			return 10;
		else if(this.area<aShape.getArea())
			return -10;
		else
			return this.type.compareTo(aShape.getType());
	}
}
