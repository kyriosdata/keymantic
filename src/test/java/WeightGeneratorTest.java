import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WeightGeneratorTest
{
	private WeightGenerator generator;
	String[] keywords  = {"dengue", "fever", "disease", "epidemic"};
	String[] terms = {"history", "familiar", "ache"};
	private double[][] matrix = new double[keywords.length][terms.length];
	
	@Before
	public void setUp()
	{
		generator = new WeightGenerator();
	}
	
	@Test
	public void computeISW()
	{
		/* 1 - Tests if the matrix returned from computeISW method contains only elements between 0 and 100.
		 * 2, 3 - Tests if the horizontal and vertical lengths of the matrix match the size of the arrays
		 * used as parameters for the method computeISW
		 */
		
		matrix = generator.computeISW(keywords, terms);
		
		for( int i = 0; i < keywords.length; i++ )
			for( int j = 0; j < terms.length; j++ )
				assertTrue( matrix[i][j] >= 0 && matrix[i][j] <= 100 );
		
		assertTrue( matrix.length == keywords.length );
		assertTrue( matrix[0].length == terms.length );
	}
}
