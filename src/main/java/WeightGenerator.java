import info.debatty.java.stringsimilarity.Jaccard;

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
		
		for( int i = 0; i < keywords.length; i++ ){
			for( int j = 0; j < archetypes.length; j++ ){
				double similarity = 0;
				
					if( jaccard.similarity(keywords[i], archetypes[j]) > similarity ) {
						similarity = jaccard.similarity(keywords[i], archetypes[j]);
					}
				
				matrix[i][j] = similarity * 100;
			}
		}
		return matrix;
	}
}
