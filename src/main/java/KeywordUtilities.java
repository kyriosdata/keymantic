
public class KeywordUtilities 
{
	private String[] archetypes = {"adverse reaction list",
			"care plan", "encounter", "event summary",
			"family history", "health summary"};
	
	public boolean isArchetypeName(String key)
	{
		for (int i = 0; i < archetypes.length; i++) {
			if( archetypes[i] == key )
				return true;
		}
		return false;
	}
	
	public boolean isOntologyName(String key)
	{
		return false;
	}
}
