//erin
public class RightTriangle extends Shape{
	private double base;
	private double height;
	
	//constructors
	public RightTriangle()
	{
		super();
		this.base = 0.0;
		this.height =0.0;
	}
	public RightTriangle(String aType, double aBase, double aHeight, double aArea)
	{
		super(aType, aArea);
		this.setBase(aBase);
		this.setHeight(aHeight);
	}
	//getters
	public double getBase()
	{
		return this.base;
	}
	public double getHeight()
	{
		return this.height;
	}
	//setters
	public void setBase(double aBase)
	{
		if(aBase>0)
			this.base = aBase;
		else
			this.base = 1;
	}
	public void setHeight(double aHeight)
	{
		if(aHeight>0)
			this.height = aHeight;
		else
			this.height = 1;
	}
	public void area(double aBase, double aHeight)
	{
		setArea(0.5*aBase*aHeight);
	}
	public String toString()
	{
		return this.getType()+" Base: "+this.base+" Height: "+this.height+" Area: "+this.getArea();
	}
	
	
}
