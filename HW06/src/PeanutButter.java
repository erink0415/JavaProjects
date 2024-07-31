/*
 * ERIN KELLY
 */
public class PeanutButter {
	//INTANCE
	private String name;
	private int cal;
	private boolean crunch;
	//constructors
	public PeanutButter()
	{
		this.name = "none";
		this.cal = 100;
		this.crunch = true;
	}
	public PeanutButter(String aN, int aC, boolean aCr)
	{
		this.setName(aN);
		this.setCal(aC);
		this.setCrunch(aCr);
	}
	//setters and getters
	//name
	public String getName() {
		return name;
	}
	//add if
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
	//add if
	public void setCal(int cal) {
		if(cal < 100 || cal > 300)
			this.cal = 100;
		else
			this.cal = cal;
	}
	//crunchy
	public boolean isCrunch() {
		return crunch;
	}
	//add if
	public void setCrunch(boolean crunch) {
		this.crunch = crunch;
	}
	//equals method
	public boolean equals(PeanutButter aPB)
	{
		return aPB != null &&
				this.name.equalsIgnoreCase(aPB.getName()) &&
				this.cal == aPB.getCal() &&
				this.crunch == aPB.isCrunch();
	}
	//STRING METHOD
	public String toString()
	{
		return "name: "+this.name+" \n"
				+ "Calories: "+this.cal+" \n"
						+ "Crunch: "+this.crunch;
	}
	
	
}
