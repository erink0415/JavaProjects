/*
 * ERIN KELLY
 */
public class Clothing {
	private String type;
	private String color;
	
	public Clothing()
	{
		this.type = "Socks";
		this.color = "Black";
	}
	public Clothing(String aT, String aC)
	{
		this.setType(aT);
		this.setColor(aC);
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		if(type.equalsIgnoreCase("Undergarment") 
				|| type.equalsIgnoreCase("Socks") 
				|| type.equalsIgnoreCase("Stockings")
				|| type.equalsIgnoreCase("Top")
				|| type.equalsIgnoreCase("Bottom")
				|| type.equalsIgnoreCase("cape"))
			this.type = type;
		else
			this.type = "Socks";
		
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		if(color.equalsIgnoreCase("brown") 
				|| color.equalsIgnoreCase("Red")
				|| color.equalsIgnoreCase("Pink")
				|| color.equalsIgnoreCase("black")
				|| color.equalsIgnoreCase("White")
				|| color.equalsIgnoreCase("orange")
				|| color.equalsIgnoreCase("green")
				|| color.equalsIgnoreCase("blue")
				|| color.equalsIgnoreCase("purple")
				|| color.equalsIgnoreCase("grey"))
			this.color = color;
		else
			this.color = "Black";
	}
	public String toString()
	{
		return "[Clothing] Type: "+this.type+" Color: "+this.color;
	}
	public boolean equals(Clothing aClothing)
	{
		return aClothing != null &&
			this.type.equals(aClothing.getType()) &&
			this.color.equals(aClothing.getColor());
	}
	
}
