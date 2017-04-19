import java.io.File;
import java.util.Arrays;
import java.util.HashMap;

import info.debatty.java.stringsimilarity.Jaccard;

public class WeightGenerator 
{
	private HashMap<String, Double> matrix = new HashMap<String, Double>();
	
	public HashMap<String, Double> computeISW( String[] keywords, Reader[] archetypes )
	{		
		
		for( String keyword : keywords )
		{
			for( Reader archetype : archetypes )
			{
				String stringPair = new StringPairs(keyword, archetype.getName() ).getString();
				matrix.put(stringPair, 0.0);
			}
		}
		
		Jaccard jaccard = new Jaccard();
		
		for( String word : keywords )
		{
			for(Reader archetype : archetypes)
			{
				double similarity = 0;
				
				String[] archetypeWords = archetype.getListOfAchetypeWords();
				
				for(String archetypeWord : archetypeWords )
				{
					if( jaccard.similarity(word, archetypeWord) > similarity ) 
					{
						similarity = jaccard.similarity(word, archetypeWord);
					}
				}
								
				matrix.put(word , similarity * 100);
				
			}
		}
		
		return matrix;	
	}
}
