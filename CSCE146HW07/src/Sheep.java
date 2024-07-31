//erin kelly
public class Sheep implements Comparable<Sheep>{

	//variables
	//name, shearing time, arrival time
	private String name;
	private int shearingTime;
	private int arrivalTime;
	private int shearingTimeLeft;
	
	//constructors
	public Sheep()
	{
		this.name = "none";
		this.shearingTime = 0;
		this.arrivalTime = 0;
		this.shearingTimeLeft = this.shearingTime;
	}
	public Sheep(String aN, int aST, int aAT)
	{
		this.setName(aN);
		this.setShearingTime(aST);
		this.setArrivalTime(aAT);
		this.setShearingTimeLeft();
	}
	//getters
	public String getName()
	{
		return this.name;
	}
	public int getShearingTime()
	{
		return this.shearingTime;
	}
	public int getArrivalTime()
	{
		return this.arrivalTime;
	}
	public int getShearingTimeLeft()
	{
		return this.shearingTimeLeft;
	}
	//setters
	public void setName(String aN)
	{
		if(aN == null)
			this.name = "none";
		else
			this.name = aN;
	}
	public void setShearingTime(int aST)
	{
		if(aST >=0)
			this.shearingTime = aST;
		else
			this.shearingTime = 0;
	}
	public void setArrivalTime(int aAT)
	{
		if(aAT >=0)
			this.arrivalTime = aAT;
		else
			this.arrivalTime = 0;
	}
	public void setShearingTimeLeft()
	{
		this.shearingTimeLeft = this.shearingTime;
	}
	//to string
	public String toString()
	{
		return "Name: "+this.name+" SheerTime: "+this.shearingTime+" Arrival Time: "+this.arrivalTime;
	}
	
	//compareTo
	public int compareTo(Sheep aSheep)
	{
		if(aSheep == null)
			return 1;
		else if(this.shearingTime>aSheep.getShearingTime())
			return 1;
		else if(this.shearingTime<aSheep.getShearingTime())
			return -1;
		else 
			return this.name.compareTo(aSheep.getName());
			
	}
	public boolean isDone()
	{
		return this.shearingTimeLeft == 0;
	}
	public void sheerForOneMin() 
	{
		this.shearingTimeLeft--;
	}
}
