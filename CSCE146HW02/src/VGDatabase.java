/*
 * ERIN KELLY
 */
public class VGDatabase {
	
	private String name;
	private String console;
	
	//MAKE CONSTUCT
	public VGDatabase()
	{
		this.name = this.console = "none";
	}
	
	public VGDatabase(String aName, String aCon)
	{
		//TODO MAKE MUTATORS
		this.setName(aName);
		this.setConsole(aCon);
	}
	
	//MAKE GET
	public String getName()
	{
		return this.name;
	}
	
	public String getConsole()
	{
		return this.console;
	}
	
	//MAKE SET
	public void setName(String aName)
	{
		if(aName != null)
			this.name = aName;
		else
			this.name = "none";
	}
	
	public void setConsole(String aCon)
	{
		if(aCon != null)
			this.console = aCon;
		else
			this.console = "none";
	}
	
	//MAKE TO STRING
	public String toString()
	{
		return "Name: "+this.name+" Console: "+this.console;
	}
	
	//MAKE EQUALS
	public boolean equals(VGDatabase aVGD)
	{
		return aVGD != null &&
				this.name.equals(aVGD.getName()) &&
				this.console.equals(aVGD.getConsole());
	}
}
