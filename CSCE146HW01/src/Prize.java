/*
 * ERIN KELLY
 */
public class Prize {

	private String prizeName;
	private int prizeValue;
	
	//constructors
	public Prize()
	{
		this.prizeName = "none";
		this.prizeValue = 0;
	}
	
	public Prize(String aN, int aV)
	{
		setPrizeName(aN);
		setPrizeValue(aV);
	}
	
	public String getPrizeName()
	{
		return this.prizeName;
	}
	public int getPrizeValue()
	{
		return this.prizeValue;
	}
	
	public void setPrizeName(String aName)
	{
		if(aName != null)
		{
			this.prizeName = aName;
		}
		else
		{
			this.prizeName = "none";
		}
	}
	public void setPrizeValue(int aValue)
	{
		if(aValue >= 0)
			this.prizeValue = aValue;
		else
			this.prizeValue = 0;
	}
	
	public String toString()
	{
		return this.prizeName;
	}
	
	public boolean equals(Prize aPrize)
	{
		return aPrize != null &&
				this.prizeName.equals(aPrize.getPrizeName()) &&
				this.prizeValue == aPrize.getPrizeValue();
				
	}
	
	
}
