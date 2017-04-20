import java.io.File;
import java.util.Arrays;
import java.util.HashMap;

import info.debatty.java.stringsimilarity.Jaccard;

public class WeightGenerator 
{
	private HashMap<String, Double> matrix = new HashMap<String, Double>();
	
	public HashMap<String, Double> computeISW( String[] keywords, String[] archetypes )
	{		
		
		for( String keyword : keywords )
		{
			for( String archetype : archetypes )
			{
				String stringPair = new StringPairs(keyword, archetype ).getString();
				matrix.put(stringPair, 0.0);
			}
		}
		
		Jaccard jaccard = new Jaccard();
		
		for( String word : keywords )
		{
			for(String archetype : archetypes)
			{
				double similarity = 0;
				
					if( jaccard.similarity(word, archetype) > similarity ) 
					{
						similarity = jaccard.similarity(word, archetype);
					}
				
				matrix.replace(word , similarity * 100);
			}
		}
		
		return matrix;	
	}
}
