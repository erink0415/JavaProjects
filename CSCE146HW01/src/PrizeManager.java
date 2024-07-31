/*
 * ERIN KELLY
 */

import java.util.Random;
import java.io.*;
import java.util.Scanner;

public class PrizeManager {
	
	private Prize[] prize;
	public static final int DEF_SIZE = 53;
	public static final String DELIM = "\t";
	public static final String FILE_NAME = "./prizeList.txt";
	public static final int BODY_FIELD_AMT = 2;
	
	
	public PrizeManager()
	{
		prize = new Prize[DEF_SIZE];
		readPrize(FILE_NAME);
	}
	
	//CODE TO READ FILE
	public void readPrize(String aName)
	{
		try
		{
			Scanner fileScanner = new Scanner(new File(aName));
			
			int i=0;
			while(fileScanner.hasNextLine())
			{
				String fileLine = fileScanner.nextLine();//read the line
				String[] splitLine = fileLine.split(DELIM);//split the line
				if(splitLine.length == BODY_FIELD_AMT)
				{
					String prizeName = splitLine[0];
					int prizeValue = Integer.parseInt(splitLine[1]);
					Prize Prize = new Prize(prizeName, prizeValue);
					prize[i] = Prize;
					
					i++;
				}
				
			}
			fileScanner.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public Prize[] getPrize()
	{
		return prize;
	}
	
	public static Prize[] choosePrizes(Prize[] prizes)
	{
		//creates array to store indices chosen
		Prize[] prizeList = new Prize[5];
		
		for(int i=0;i<prizeList.length-1;i++)
		{
			
			//whiles to make sure no duplicates
				prizeList[0] = prizes[(int)(Math.random()*prizes.length)];
				prizeList[1] = prizes[(int)(Math.random()*prizes.length)];
		
					while(prizeList[0] == prizeList[1])
					{
						prizeList[1] = prizes[(int)(Math.random()*prizes.length)];
					}
				
				prizeList[2] = prizes[(int)(Math.random()*prizes.length)];
					while(prizeList[0] == prizeList[2] || prizeList[1] == prizeList[2] || prizeList[3] == prizeList[2] ||  prizeList[4] == prizeList[2])
					{
						prizeList[2] = prizes[(int)(Math.random()*prizes.length)];
					}
				
				prizeList[3] = prizes[(int)(Math.random()*prizes.length)];
				while(prizeList[0] == prizeList[3] || prizeList[1] == prizeList[3] || prizeList[2] == prizeList[3] ||  prizeList[4] == prizeList[3])
				{
					prizeList[2] = prizes[(int)(Math.random()*prizes.length)];
				}
				
				prizeList[4] = prizes[(int)(Math.random()*prizes.length)];
				
				while(prizeList[0] == prizeList[4] || prizeList[1] == prizeList[4] || prizeList[2] == prizeList[4] ||  prizeList[3] == prizeList[4])
				{
					prizeList[2] = prizes[(int)(Math.random()*prizes.length)];
				}
		}
		
		return prizeList;
	}
	
	//adding prize values
	public static int addPrizes(Prize[] prizeList)
	{
		int total = 0;
		for(int i=0;i<5;i++)
		{
		total += prizeList[i].getPrizeValue();
		}
		return total;
		
	}
	
	
}

