package Tasks;

public class Search {
	
	public static int linear(int[] nameCount, int name)
	{
		
		int index = 0;
		
		while ((nameCount[index] != name) && (index <  nameCount.length -1));
		{
			index += 1;
		}
		
		if(nameCount[index] == name)
		{
			return(index);
		}
		else
		{
			return(-1);
		}
		
	}
	
	public static int linear(String[] nameCount, String name)
	{
		
		int index = 0;
		
		while (!(nameCount[index] .equals(name)) && (index <  nameCount.length -1))
		{
			index += 1;
		}
		
		if(nameCount[index].equals(name))
		{
			return(index);
		}
		else
		{
			return(-1);
		}
		
	}
	



}
