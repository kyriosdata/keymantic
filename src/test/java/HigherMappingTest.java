import static org.junit.Assert.*;

import org.junit.Test;

public class HigherMappingTest {

	double[][] matrix = {{10.0, 0.0, 20.0, 4.0}, {0.0, 10.0, 5.0, 40} };
	HigherMappingSelector selector;

	
	public HigherMappingTest()
	{
		selector = new HigherMappingSelector();
	}
	
	@Test
	public void sizeOfResultingMatrix()
	{
		double[][] result = selector.map(matrix);
		
		assertEquals(matrix.length, result.length);
		assertEquals(matrix[0].length, result[0].length);
	}
	
	@Test
	public void valueOfSmallerMappings()
	{
		double[][] matrix = {{10.0, 0.0, 20.0, 4.0}, {0.0, 10.0, 5.0, 40} };
		
		double[][] result = selector.map(matrix);
		
		for( int x = 0; x < result.length; x++ )
		{
			for( int y = 0; y < result[0].length; y++ )
			{
				if(result[x][y] != 20 && result[x][y] != 40 )
				{
					double value = result[x][y];
					
					assertEquals(value, 0.0, 0.01);
				}
			}
		}
	}
	
	@Test
	public void valueOfHigherMapping()
	{
		double[][] matrix = {{10.0, 0.0, 20.0, 4.0}, {0.0, 10.0, 5.0, 40} };
		
		double[][] result = selector.map(matrix);
		
		assertEquals(matrix[0][2], result[0][2], 0.01 );
		assertEquals(matrix[1][3], result[1][3], 0.01 );
	}
}
