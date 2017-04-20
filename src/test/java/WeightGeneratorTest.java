import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.TestCase;

public class WeightGeneratorTest
{
	private HashMap<String, Double> matrix;
	private WeightGenerator generator;
	String[] keywords  = {"dengue", "fever", "disease"};;
	String[] terms = {"history", "familiar", "ache"};
	
	@Before
	public void setUp()
	{
		generator = new WeightGenerator();
	}
	
	@Test
	public void computeISW()
	{
		matrix = generator.computeISW(keywords, terms);
		
		assertFalse( matrix.isEmpty());
		assertEquals(keywords.length * terms.length, matrix.size());		
	}
}
