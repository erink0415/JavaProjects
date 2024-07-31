/*
 * ERIN KELLY
 */
public class PBJSandwich {
	//instance variables
	private Bread topSlice;
	private PeanutButter peanutButter;
	private Jelly jelly;
	private Bread bottomSlice;
	//constructors
	public PBJSandwich()
	{
		this.topSlice = new Bread();
		this.peanutButter  = new PeanutButter();
		this.jelly = new Jelly();
		this.bottomSlice = new Bread();
	}
	public PBJSandwich(Bread aTop, PeanutButter aPB, Jelly aJ, Bread aBot)
	{
		this.setTopSlice(aTop);
		this.setPeanutButter(aPB);
		this.setJelly(aJ);
		this.setBottomSlice(aBot);
	}
	//setter and getters
	//topSlice
	public Bread getTopSlice() {
		return topSlice;
	}
	public void setTopSlice(Bread topSlice) {
		if(topSlice == null)
			this.topSlice = new Bread();
		else
			this.topSlice = topSlice;
	}
	//Peanut Butter
	public PeanutButter getPeanutButter() {
		return peanutButter;
	}
	public void setPeanutButter(PeanutButter peanutButter) {
		if(peanutButter == null)
			this.peanutButter = new PeanutButter();
		else
			this.peanutButter = peanutButter;
	}
	//Jelly
	public Jelly getJelly() {
		return jelly;
	}
	public void setJelly(Jelly jelly) {
		if(jelly == null)
			this.jelly = new Jelly();
		else
			this.jelly = jelly;
	}
	//Bottom Slice
	public Bread getBottomSlice() {
		return bottomSlice;
	}
	public void setBottomSlice(Bread bottomSlice) {
		if(bottomSlice == null)
			this.bottomSlice = new Bread();
		else
			this.bottomSlice = bottomSlice;
	}
	//equals
	public boolean equals(PBJSandwich aPBJ)
	{
		return aPBJ != null && 
				this.topSlice.equals(aPBJ.getTopSlice()) &&
				this.peanutButter.equals(aPBJ.getPeanutButter()) &&
				this.jelly.equals(aPBJ.getJelly()) &&
				this.bottomSlice.equals(aPBJ.getBottomSlice());
	}
	//toString
	public String toString()
	{
		return "Top Slice: "+this.topSlice+" \n"
				+ "PeanutButter: "+this.peanutButter+" \n"
						+ "Jelly: "+this.jelly+" \n"
								+ "Bottom Slice: "+this.bottomSlice;
	}
}
