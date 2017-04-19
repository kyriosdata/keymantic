
public class StringPairs 
{
	private String firstWord;
	private String secondWord;
	private String stringPair;
	
	public StringPairs(String first, String second )
	{
		this.firstWord = first;
		this.secondWord = second;
		
		this.stringPair = first + "," + second;
	}
	
	public String getString()
	{
		return  stringPair;
	}
}
