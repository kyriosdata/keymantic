import info.debatty.java.stringsimilarity.Jaccard;
import info.debatty.java.stringsimilarity.Levenshtein;

public class WeightGenerator 
{
	public double[][] computeISW( String[] keywords )
	{		
		KeywordUtilities utilities = new KeywordUtilities();
		
		String[] archetypeTerms = utilities.getArchetypeTerms();
		
		double[][] matrix = new double[keywords.length][archetypeTerms.length];
		
		for( int i = 0; i < keywords.length; i++ ){
			for( int j = 0; j < archetypeTerms.length; j++ ){
				matrix[i][j] = 0.0;
			}
		}
		
		Jaccard jaccard = new Jaccard();
		Levenshtein levenshtein = new Levenshtein();
		
		for( int i = 0; i < keywords.length; i++ )
		{
			for( int j = 0; j < archetypeTerms.length; j++ )
			{
				double similarity = 0;
				
					if( jaccard.similarity(keywords[i], archetypeTerms[j]) > similarity ) {
						similarity = jaccard.similarity(keywords[i], archetypeTerms[j]) * 100;
					}
					
					if( levenshtein.distance(keywords[i], archetypeTerms[j]) > similarity) {
						similarity = levenshtein.distance(keywords[i], archetypeTerms[j]) * 10;
					}
				
				matrix[i][j] = similarity;
			}
		}
		return matrix;
	}
}
