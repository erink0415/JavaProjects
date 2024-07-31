/*
 * ERIN KELLY
 */
public class Jelly {
	//instance variables
	private String name;
	private int cal;
	private String fruitType;
	//constructors
	public Jelly()
	{
		this.name = "none";
		this.cal = 50;
		this.fruitType = "Grape";
	}
	public Jelly(String aN, int aC, String aT)
	{
		this.setName(aN);
		this.setCal(aC);
		this.setFruitType(aT);
	}
	//setters and getters
	//for name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name != null)
			this.name = "none";
		else
			this.name = name;
	}
	//for calories
	public int getCal() {
		return cal;
	}
	public void setCal(int cal) {
		if(cal < 50 || cal > 200)
			this.cal = 50;
		else
			this.cal = cal;
	}
	//for type
	public String getFruitType() {
		return fruitType;
	}
	public void setFruitType(String fruitType) {
		if(fruitType.equalsIgnoreCase("Apple") || fruitType.equalsIgnoreCase("Blackberry")||
				fruitType.equalsIgnoreCase("Grape") || fruitType.equalsIgnoreCase("blueberry") ||
				fruitType.equalsIgnoreCase("Tomato"))
			this.fruitType = fruitType;
		else if(fruitType == null)
			this.fruitType = "Grape";
		else
			this.fruitType = "Grape";
	}
	//STRING METHOD
	public String toString()
	{
		return "Name: "+this.name+" \n"
				+ "Calories: "+this.cal+" \n"
						+ "Fruit Type: "+this.fruitType;
	}
	//equals method
	public boolean equals(Jelly aJ)
	{
		return aJ != null &&
				this.name.equals(aJ.getName()) &&
				this.cal == aJ.getCal() &&
				this.fruitType.equals(aJ.getFruitType());
	}
	
}
