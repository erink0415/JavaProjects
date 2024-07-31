/*
 * ERIN KELLY
 */
public class Coffee {
	//instance variables
	private String name;
	private int caffeine;
	
	//constructor
	public Coffee()
	{
		this.name = "none";
		this.caffeine = 50;
	}
	//parameterized constructor
	public Coffee(String aName, int aC)
	{
		this.setName(aName);
		this.setCaffeine(aC);
	}
	//Accessor's / Getters
	//accessor's are public
	public String getName()
	{
		return this.name;
	}
	public int getCaffeine()
	{
		return this.caffeine;
	}
	//setters
	public void setName(String aName)
	{
		if(aName == null)
			this.name = "none";
		else
			this.name = aName;
	}
	public void setCaffeine(int aCaf)
	{
		if(aCaf < 50 || aCaf > 300)
			this.caffeine = 50;
		else
			this.caffeine = aCaf;
	}
	//toString
	public String toString()
	{
		return "Coffee Name: "+this.name+" Caffeine Amount: "+this.caffeine;
	}
	//equals method
	public boolean equals(Coffee aCoffee)
	{
		return aCoffee != null && this.name.equals(aCoffee.getName()) && this.caffeine == aCoffee.getCaffeine();        
	}
	
	//risky amount method
	public double riskyAmount()
	{
		return 180.0 / ((this.caffeine/100.0)*6.0);
	}
	
	
}
