//erin Kelly

import java.io.File;
import java.util.Scanner;

public class SheepManager {
	//variables
	private MinHeap<Sheep> sheepHeap;
	private Sheep currentSheep;
	private int currentMinute;
	private int totalSheep;
	private Sheep[] waitingSheep;
	private String DELIM = "\t";
	
	//constructors
	public SheepManager()
	{
		sheepHeap = new MinHeap<Sheep>();
		currentSheep = null;
		currentMinute = 0;
		totalSheep = 128;
		waitingSheep = new Sheep[totalSheep];
	}
	
	public void scheduleSheep()
	{
		currentMinute=0;
		while(true)
		{
			for(int i=0;i<totalSheep;i++)
			{
				if(waitingSheep[i] == null)
					break;
				if(currentMinute==waitingSheep[i].getArrivalTime())
				{
					addSheep(waitingSheep[i]);
					i++;
				}
			}
			if(isDone())
				break;
			advanceOneMinute();
			currentMinute++;
		}
	}
	
	//add sheep
	public void addSheep(Sheep aSheep)
	{
		if(currentSheep == null)
			currentSheep = aSheep;
		else
			sheepHeap.add(aSheep);
		totalSheep++;
	}
	
	//advance one minute
	private void advanceOneMinute()
	{
		currentSheep.sheerForOneMin();
		if(currentSheep.isDone())
		{
			System.out.println(currentSheep.toString());
			currentSheep = sheepHeap.remove();
		}
	}
	//isDone
	public boolean isDone()
	{
		return currentSheep == null;
	}
	
	//getCurrentSheep
	public Sheep getCurrentSheep()
	{
		return currentSheep;
	}
	public void readFile(String fileName)
	{
		try
		{
			//Creates the scanner to read the file
			Scanner fileScanner = new Scanner(new File(fileName));
			int line = 0;
			//While there is a next line
			while(fileScanner.hasNextLine())
			{
				//Read the next line in the file
				String fileLine = fileScanner.nextLine();
				//Split said line based on the tab delimiter
				String[] splitLines = fileLine.split(DELIM);
				if(splitLines.length == 3)
				{
					String name = splitLines[0];
					int shearingTime = Integer.parseInt(splitLines[1]);
					int arrivalTime = Integer.parseInt(splitLines[2]);
					
					Sheep sheep = new Sheep(name, shearingTime, arrivalTime);
					waitingSheep[line] = sheep;
				}
				line++;
				
			}
			fileScanner.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}