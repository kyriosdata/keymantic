import java.util.ArrayList;
import java.util.Iterator;

public class KeywordUtilities 
{
	private String[] archetypes = {"adverse reaction list",
			"care plan", "encounter", "event summary",
			"family history", "health summary"};
	
	private ArrayList<String> ontologies = new ArrayList<String>();
	
	public KeywordUtilities()
	{
		ontologies.add("at0000 " + "Family history"
				+ "Summary information about the significant health-related problems found in family members.");
	}
	
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
		Iterator<String> iterador = ontologies.iterator();
		
		while (iterador.hasNext()) {
			if( iterador.next().contains(key))
			{
				return true;
			}
			
		}
		
		return false;
	}
}
