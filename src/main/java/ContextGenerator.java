
public class ContextGenerator
{
	private double[][] matrixDePesosDeValor;
	
	public double[][] compute(double[][] partialMapToDBTErms, double[][] matrixDePesosDeEsquema, String[] keywords )
	{
		matrixDePesosDeValor = matrixDePesosDeEsquema;
		
		
		
		
		return null;
	}
	
	public double[][] initializationPass(double[][] matrix )
	{
		for(int x = 0; x < matrix.length; x++ )
		{
			for(int y = 0; y < matrix[0].length; y++ )
			{
				if(matrix[x][y] != 0 )
				{
					matrix[x][y] = 0;
				}
				else
				{
					matrix[x][y] = 1;
				}
			}
		}
		
		return matrix;
	}
}
