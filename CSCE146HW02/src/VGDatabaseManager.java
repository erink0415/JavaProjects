/*
 * ERIN KELLY
 */
import java.util.Scanner;
import java.io.*;

public class VGDatabaseManager {
	private GenLL<VGDatabase> VGD;
	private GenLL<VGDatabase> result;
	public static final String DELIM = "\t";
	public static final int BODY_FIELD_AMT = 2;
	
	public VGDatabaseManager()
	{
		VGD = new GenLL<VGDatabase>();
	}
	
	public void addVGD(VGDatabase aVGD)
	{
		VGD.add(aVGD);
	}
	
	public void readVGDFile(String aName)
	{
		try
		{
			Scanner fileScanner = new Scanner(new File(aName));
			while(fileScanner.hasNextLine())
			{
				String fileLine = fileScanner.nextLine();
				String[] splitLines = fileLine.split(DELIM);
				if(splitLines.length == BODY_FIELD_AMT)
				{
					String name = splitLines[0];
					String console = splitLines[1];
					VGDatabase aVGD = new VGDatabase(name,console);
					//this.addVGD(aVGD);
					VGD.add(aVGD);
				}
			}
			fileScanner.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void writeVGDFile(String aName)
	{
		try
		{
			PrintWriter fileWriter = new PrintWriter(new FileOutputStream(aName));
			//bodyyy
			while(result.hasMore())
			{
				VGDatabase aVGD = result.getCurrent();
				fileWriter.println(aVGD.getName()+DELIM+aVGD.getConsole());
				result.goToNext();
			}
			fileWriter.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void writeVGDAppend(String aName)
	{
		try
		{
			PrintWriter fileWriter = new PrintWriter(new FileOutputStream(aName), true);
			//bodyyy
			result.reset();
			while(result.hasMore())
			{
				VGDatabase aVGD = result.getCurrent();
				fileWriter.println(aVGD.getName()+DELIM+aVGD.getConsole());
				result.goToNext();
			}
			fileWriter.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void searchVGD(String aName, String aConsole)
	{
		result = new GenLL<VGDatabase>();
		
		aName = aName.toLowerCase();
		aConsole = aConsole.toLowerCase();
		VGD.reset();
		while(VGD.hasMore())
		{
			if(aName.equals("*") || VGD.getCurrent().getName().toLowerCase().contains(aName))
			{
				if((aConsole.equals("*") || VGD.getCurrent().getConsole().toLowerCase().contains(aConsole)))
				{
					VGD.getCurrent();
					System.out.println(VGD.getCurrent());
					result.add(VGD.getCurrent());
				}
			}
			VGD.goToNext();	
		}
	}
	public void print()
	{
		while(result.hasMore())
		{
			System.out.println(result.getCurrent());
			result.goToNext();
		}
	}
}
