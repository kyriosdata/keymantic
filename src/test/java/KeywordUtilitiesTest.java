import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class KeywordUtilitiesTest {

	KeywordUtilities utilities = new KeywordUtilities();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void isArchetypeNameWithEmptyParameter() {
		assertFalse(utilities.isArchetypeName(" "));
	}
	
	@Test
	public void isArchetypeName() {
		assertTrue(utilities.isArchetypeName("health summary"));
	}
	
	@Test
	public void isOntologyNameWithEmptyParameter() {
		assertFalse(utilities.isOntologyName(" "));
	}
	
	@Test
	public void isOntologyName() {
		assertTrue(utilities.isOntologyName("family members"));
	}
}
