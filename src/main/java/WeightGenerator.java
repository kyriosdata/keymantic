import info.debatty.java.stringsimilarity.Jaccard;
import info.debatty.java.stringsimilarity.Levenshtein;

public class WeightGenerator 
{
	public double[][] computeISW( String[] keywords, String[] archetypes )
	{		
		double[][] matrix = new double[keywords.length][archetypes.length];
		
		for( int i = 0; i < keywords.length; i++ ){
			for( int j = 0; j < archetypes.length; j++ ){
				matrix[i][j] = 0.0;
			}
		}
		
		Jaccard jaccard = new Jaccard();
		Levenshtein levenshtein = new Levenshtein();
		
		for( int i = 0; i < keywords.length; i++ )
		{
			for( int j = 0; j < archetypes.length; j++ )
			{
				double similarity = 0;
				
					if( jaccard.similarity(keywords[i], archetypes[j]) > similarity ) {
						similarity = jaccard.similarity(keywords[i], archetypes[j]) * 100;
					}
					
					if( levenshtein.distance(keywords[i], archetypes[j]) > similarity) {
						similarity = levenshtein.distance(keywords[i], archetypes[j]) * 10;
					}
				
				matrix[i][j] = similarity;
			}
		}
		return matrix;
	}
}
