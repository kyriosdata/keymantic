import java.lang.management.MemoryNotificationInfo;
import java.util.ArrayList;

public class HigherMappingSelector 
{
	//private ArrayList<Mapping> mappings;
	
	public double[][] map( double[][] weightsMatrix )
	{
		for( int x = 0; x < weightsMatrix.length; x++ )
		{
			double maior = 0;
			int maiorIndexX = 0;
			int maiorIndexY = 0;
			for(int y = 0; y < weightsMatrix[0].length; y++ )
			{
				if( weightsMatrix[x][y] > maior )
				{
					maior = weightsMatrix[x][y];
					maiorIndexX = x;
					maiorIndexY = y;
				}
				
				weightsMatrix[x][y] = 0;
			}
			
			weightsMatrix[maiorIndexX][maiorIndexY] = maior;
		}
		
		return weightsMatrix;
	}
}
