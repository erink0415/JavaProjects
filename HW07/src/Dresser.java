/*
 * ERIN KELLY
 */
public class Dresser {
	//instance variable
	private Clothing[][] clothes;
	
	//constructor
	public Dresser()
	{
		this.clothes = new Clothing[5][10];
	}
	//add clothing itemssss
	public void Add(Clothing aC)
	{
		if(aC == null)
		{
			return;
		}
		else if(aC.getType().equalsIgnoreCase("undergarment"))
		{
			for(int i=0;i<clothes[0].length;i++)
			{
				if(clothes[0][i] == null)
				{
					clothes[0][i] = aC;
					return;
				}
			}
			System.out.println("Whoops, this drawer is full");

		}
		else if(aC.getType().equalsIgnoreCase("Socks"))
		{
			for(int i=0;i<clothes[0].length;i++)
			{
				if(clothes[1][i] == null)
				{
					clothes[1][i] = aC;
					return;
				}
			}
			System.out.println("Whoops, this drawer is full");

		}
		
		else if(aC.getType().equalsIgnoreCase("Stockings"))
		{
			for(int i=0;i<clothes[0].length;i++)
			{
				if(clothes[1][i] == null)
				{
					clothes[1][i] = aC;
					return;
				}
			
			}
			System.out.println("Whoops, this drawer is full");

		}
		else if(aC.getType().equalsIgnoreCase("Top"))
		{
			for(int i=0;i<clothes[0].length;i++)
			{
				if(clothes[2][i] == null)
				{
					clothes[2][i] = aC;
					return;
				}
				
			}
			System.out.println("Whoops, this drawer is full");

		}
		else if(aC.getType().equalsIgnoreCase("Bottom"))
		{
			for(int i=0;i<clothes[0].length;i++)
			{
				if(clothes[3][i] == null)
				{
					clothes[3][i] = aC;
					return;
				}
				
			}
			System.out.println("Whoops, this drawer is full");

		}
		else if(aC.getType().equalsIgnoreCase("Cape"))
		{
			for(int i=0;i<clothes[0].length;i++)
			{
				if(clothes[4][i] == null)
				{
					clothes[4][i] = aC;
					return;
				}
				
			}
			System.out.println("Whoops, this drawer is full");

		}
		
	}
	public void Remove(Clothing aC)
	{
		for(int i=0; i<clothes.length;i++)
			{
				for(int j=0; j<clothes[0].length; j++)
				{
					if(clothes[i][j] != null && clothes[i][j].getType().equals(aC.getType()) && clothes[i][j].getColor().equals(aC.getColor()))
							{
								clothes[i][j] = null;
							}
				}
			}
	}
	
	
	public void Print()
	{
		for(int i=0; i<clothes.length; i++)
		{
			for(int j=0; j<clothes[i].length;j++)
			{
				if(clothes[i][j] != null)
				{
					System.out.println(clothes[i][j]);
				}
			}
		}
	}
}
