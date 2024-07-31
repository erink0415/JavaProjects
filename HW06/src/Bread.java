/*
 * ERIN KELLY
 */
public class Bread {
//INSTANCE VARIABLE
	private String name;
	private int cal;
	private String type;
	//CONSTRUCTORS
	public Bread()
	{
		this.name = "none";
		this.cal = 50;
		this.type = "Whole Grain";
	}
	public Bread(String aN, int aC, String aT)
	{
		this.setName(aN);
		this.setCal(aC);
		this.setType(aT);
	}
	//GETTERS AND SETTERS
	//name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name == null)
			this.name = "none";
		else
			this.name = name;
	}
	//calories
	public int getCal() {
		return cal;
	}
	public void setCal(int cal) {
		if(cal < 50 || cal > 250)
			this.cal = 50;
		else
			this.cal = cal;
	}
	//type
	public String getType() {
		return type;
	}
	public void setType(String aType) {
		if(aType.equalsIgnoreCase("Honey Wheat") || aType.equalsIgnoreCase("White") || aType.equalsIgnoreCase("Whole Grain"))
		{
			this.type = aType;
		}
		else
		{
			this.type = "Whole Grain";
		}
	}
	//STRING METHOD
	public String toString()
	{
		return "Name: "+this.name+" \n"
				+ "Calories: "+this.cal+" \n"
						+ "Type: "+this.type;
	}
	//EQUALS METHOD
	public boolean equals(Bread aB)
	{
		return aB != null &&
				this.name.equalsIgnoreCase(aB.getName()) &&
				this.cal == aB.getCal() &&
				this.type.equalsIgnoreCase(aB.getType());
	}
}
