import static org.junit.Assert.*;

import org.junit.Test;

public class ContextGeneratorTest {

	ContextGenerator context = new ContextGenerator();
	double[][] matrix = { {0, 10.0, 0.5}, {1, 20, 0}};
	
	@Test
	public void test()
	{
		double[][] result = context.initializationPass(matrix);
		
		assertTrue(result != null );
		
		for(int x = 0; x < result.length; x++ )
		{
			for(int y = 0; y < result[0].length; y++ )
			{
				assertTrue(result[x][y] == 0 || result[x][y] == 1 );
			}
		}
	}
	
	@Test
	public void initializationPassTest()
	{
		double[][] matrix = { {0, 10.0, 0.5}, {0, 20, 0}};
		double[][] result = { {0, 10.0, 0.5}, {0, 20, 0}};
		result = context.initializationPass(result);
				
		for(int x = 0; x < matrix.length; x++ )
		{
			for(int y = 0; y < matrix[0].length; y++ )
			{
				if( matrix[x][y] != 0 )
				{
					
					assertTrue(result[x][y] == 0 );
				}
				else
				{
					assertTrue(result[x][y] == 1);
				}
			}
		}	
	}

}
